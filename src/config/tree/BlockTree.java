package config.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

public class BlockTree implements IKspPartTree {
	
	int tabAmount;
	String blockName;
	List<IKspPartTree> parts = new ArrayList<>();
	public static Set<String> assignmentsToRecord = new HashSet<String>(Arrays.asList("maxTemp", "CrewCapacity", "category"));
	public static Set<String> modulesToRecord = new HashSet<String>(Arrays.asList("ModuleCommand","ModuleScienceExperiment","ModuleEngines"));
	
	public BlockTree(CommonTree t, int tabAmount)
	{
		this.tabAmount = tabAmount;
		
		int i = 0;
		blockName = t.getChild(i++).getText().trim();
		
		int numberOfChildren = t.getChildCount();
		for(; i<numberOfChildren; i++)
		{
			CommonTree child = (CommonTree) t.getChild(i);
			if(child.getText().equals("BLOCK"))
			{
				parts.add(new BlockTree(child, tabAmount+1));
			}
			else if(child.getText().equals("COMMENT"))
			{
				parts.add(new CommentTree(child, tabAmount+1));
			}
			else if(child.getText().equals("EMPTYBLOCK"))
			{
				parts.add(new EmptyBlockTree(child, tabAmount+1));
			}
			else if(child.getText().equals("ASSIGNMENT"))
			{
				parts.add(new AssignmentTree(child, tabAmount+1));
			}
			else if (child.getText().equals("MMREMOVERULE"))
			{
				parts.add(new MMRemoveTree(child, tabAmount+1));
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
	}
	
	public BlockTree(String blockName, int tabAmount)
	{
		this.tabAmount = tabAmount;
		this.blockName = blockName;
	}
	
	public void addPart(IKspPartTree part)
	{
		parts.add(part);
	}
	
	public String addMechjeb()
	{
		if(blockName.equals("PART"))
		{
			String partName = getModuleName();
			boolean isCommandPod = false;
			for(IKspPartTree part : parts)
			{
				if(part instanceof BlockTree)
				{
					String moduleName = ((BlockTree) part).getModuleName();
					if(moduleName.equals("MechJebCore"))
					{
						return null; //quit looking, as it is already added
					}
					else if(moduleName.equals("ModuleCommand"))
					{
						isCommandPod=true;
					}
				}
			}
			
			if(isCommandPod)
			{
				return partName;
			}
		}
		return null;
	}
	
	public String addProtractor()
	{
		if(blockName.equals("PART"))
		{
			String partName = getModuleName();
			boolean isCommandPod = false;
			for(IKspPartTree part : parts)
			{
				if(part instanceof BlockTree)
				{
					String moduleName = ((BlockTree) part).getModuleName();
					if(moduleName.equals("ProtractorModule"))
					{
						return null; //quit looking, as it is already added
					}
					else if(moduleName.equals("ModuleCommand"))
					{
						isCommandPod=true;
					}
				}
			}
			
			if(isCommandPod)
			{
				return partName;
			}
		}
		return null;
	}

	@Override
	public Map<String,String> addDeadlyReentry() {
		Map<String,String> ret = new HashMap<>();
		if(blockName.equals("PART")|| blockName.equals("﻿PART")) //some files have this weird encoding?
		{
			String partName = getModuleName();
			ret.put("partName", partName);
			for(int i=0;i<parts.size();i++)
			{
				IKspPartTree current = parts.get(i);
				if(current instanceof AssignmentTree)
				{
					String lhs = ((AssignmentTree) current).getLhs();
					
					if(assignmentsToRecord.contains(lhs))
					{
						Map<String,String> value = ((AssignmentTree) parts.get(i)).addDeadlyReentry();
						ret.putAll(value);
					}					
				}
				else if(current instanceof BlockTree && ((BlockTree) current).getBlockName().equals("MODULE"))
				{
					BlockTree module = (BlockTree) parts.get(i);
					String moduleName = module.getModuleName();
					
					if(modulesToRecord.contains(moduleName))
					{
						ret.put("Module", moduleName);
					}
				}
			}
		}
				
		return ret;
	}
	
	public String getModuleName()
	{
		for(IKspPartTree part : parts)
		{
			if(part instanceof AssignmentTree)
			{
				AssignmentTree assignment = (AssignmentTree) part;
				if(assignment.getLhs().equals("name"))
				{
					return assignment.getRhs();
				}
			}
		}
		return "";
	}
	
	public String getBlockName()
	{
		return blockName;
	}
	
	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);

		StringBuilder value = new StringBuilder();
		
		value.append(tabs);
		value.append(blockName);
		
		if(parts.size()>0)
		{
			value.append("\n");
			value.append(tabs);
		}
		value.append("{");
		
		if(parts.size()>0)
		{
			value.append("\n");
			
			for(IKspPartTree child : parts)
			{
				value.append(child);
			}
			
			value.append(tabs);
		}
		value.append("}\n");
		
		return value.toString();
	}
}
