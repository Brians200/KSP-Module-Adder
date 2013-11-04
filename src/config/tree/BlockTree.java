package config.tree;

import java.util.ArrayList;
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
			//check the modules and see if any of them are named moduleName
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
			//value.append("\n");
			value.append(child);
		}
		
		//value.append("\n");
		value.append(tabs);
		value.append("}\n");
		
		return value.toString();
	}
}
