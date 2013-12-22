package config.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;


public class ConfigTree implements IKspPartTree {

	List<IKspPartTree> parts = new ArrayList<>();
	
	public ConfigTree(CommonTree t)
	{
		for(Object childObject : t.getChildren())
		{
			CommonTree child = (CommonTree) childObject;
			
			if(child.getText().equals("BLOCK"))
			{
				parts.add(new BlockTree(child, 0));
			}
			else if(child.getText().equals("COMMENT"))
			{	
				parts.add(new CommentTree(child, 0));
			}
			else if(child.getText().equals("ASSIGNMENT"))
			{
				parts.add(new AssignmentTree(child, 0));
			}
			else
			{
				throw new IllegalArgumentException();
			}
			
		}
	}
	
	public String addMechjeb()
	{
		for(int i = 0; i < parts.size(); i++)
		{
			String partName = parts.get(i).addMechjeb() ;
			if(partName != null)
			{
				return partName;
			}
		}
		return null;
	}
	
	public String addProtractor() {
		for(int i = 0; i < parts.size(); i++)
		{
			String partName = parts.get(i).addProtractor() ;
			if(partName != null)
			{
				return partName;
			}
		}
		return null;
	}

	@Override
	public Map<String,String> addDeadlyReentry() {
		for(int i = 0; i<parts.size();i++)
		{
			if(parts.get(i) instanceof BlockTree)
			{
				BlockTree tree = (BlockTree) parts.get(i);
				if(tree.blockName.equals("PART"))
				{
					Map<String,String> information = parts.get(i).addDeadlyReentry();
					return information;
				}
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder value = new StringBuilder();
		
		for(IKspPartTree child : parts)
		{
			value.append(child);
		}
		
		return value.toString();
	}
}
