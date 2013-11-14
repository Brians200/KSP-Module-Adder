package config.tree;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class BlockTree implements IKspPartTree {
	
	int tabAmount;
	String blockName;
	List<IKspPartTree> parts = new ArrayList<>();
	
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
	
	public boolean addMechjeb(IKspPartTree module)
	{
		if(blockName.equals("PART"))
		{
			boolean isCommandPod = false;
			for(IKspPartTree part : parts)
			{
				if(part instanceof BlockTree)
				{
					String moduleName = ((BlockTree) part).getModuleName();
					if(moduleName.equals("MechJebCore"))
					{
						return false; //quit looking, as it is already added
					}
					else if(moduleName.equals("ModuleCommand"))
					{
						isCommandPod=true;
					}
				}
			}
			
			if(isCommandPod)
			{
				parts.add(module); // add it since it doesn't exist yet
				return true;
			}
		}
		return false;
	}
	
	public boolean addProtractor(IKspPartTree module)
	{
		if(blockName.equals("PART"))
		{
			boolean isCommandPod = false;
			for(IKspPartTree part : parts)
			{
				if(part instanceof BlockTree)
				{
					String moduleName = ((BlockTree) part).getModuleName();
					if(moduleName.equals("ProtractorModule"))
					{
						return false; //quit looking, as it is already added
					}
					else if(moduleName.equals("ModuleCommand"))
					{
						isCommandPod=true;
					}
				}
			}
			
			if(isCommandPod)
			{
				parts.add(module); // add it since it doesn't exist yet
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean addDeadlyReentry(Hashtable<String, Object> deadlyReentry) {
		
		boolean added = false;
		
		if(blockName.equals("PART"))
		{
			for(int i=0;i<parts.size();i++)
			{
				if(parts.get(i) instanceof AssignmentTree && ((AssignmentTree) parts.get(i)).getLhs().equals("maxTemp"))
				{
					//check the previous one and see if this has been fixed already
					if(parts.get(i-1) instanceof CommentTree && ((CommentTree) parts.get(i-1)).getComment().equals("// Deadly Reentry Added"))
					{
						return false;
					}
					else
					{
						((AssignmentTree) parts.get(i)).addDeadlyReentry(deadlyReentry);
						CommentTree commentTree = new CommentTree("// Deadly Reentry Added", ((AssignmentTree) parts.get(i)).getTabAmount());
						parts.add(i++, commentTree);
						added = true;
					}
				}
				else if(parts.get(i) instanceof BlockTree && ((BlockTree) parts.get(i)).getBlockName().equals("MODULE"))
				{
					parts.get(i).addDeadlyReentry(deadlyReentry);
				}
			}
			
			if(added)
			{
				//check to see if there are any special rules for this...
				String partName = getModuleName();
				if(deadlyReentry.containsKey(partName))
				{
					Object value = deadlyReentry.get(partName);
					if(value instanceof IKspPartTree)
					{
						parts.add((IKspPartTree) value);
					}
					else 
					{
						@SuppressWarnings("unchecked")
						List<IKspPartTree> modules = (List<IKspPartTree>) value;
						for(IKspPartTree module : modules)
						{
							parts.add(module);
						}
					}
				}
				
			}
		}
		else
		{
			if(getModuleName().equals("ModuleEngines"))
			{
				for(int i=0;i<parts.size();i++)
				{
					if(parts.get(i) instanceof AssignmentTree && ((AssignmentTree) parts.get(i)).getLhs().equals("heatProduction"))
					{
						((AssignmentTree) parts.get(i)).addDeadlyReentry(deadlyReentry);
						return true;
					}
				}
			}
		}
		
		return added;
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
				
		value.append("\n");
		value.append(tabs);
		value.append("{\n");
		
		for(IKspPartTree child : parts)
		{
			value.append(child);
		}
		
		value.append(tabs);
		value.append("}\n");
		
		return value.toString();
	}
}
