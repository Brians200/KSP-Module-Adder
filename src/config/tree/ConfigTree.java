package config.tree;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

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
			else
			{
				throw new IllegalArgumentException();
			}
			
		}
	}
	
	public boolean addMechjeb(IKspPartTree module)
	{
		for(int i = 0; i < parts.size(); i++)
		{
			if(parts.get(i).addMechjeb(module))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean addProtractor(IKspPartTree module) {
		for(int i = 0; i < parts.size(); i++)
		{
			if(parts.get(i).addProtractor(module))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addDeadlyReentry(Hashtable<String, Object> deadlyReentry) {
		for(int i = 0; i<parts.size();i++)
		{
			if(parts.get(i) instanceof BlockTree)
			{
				BlockTree tree = (BlockTree) parts.get(i);
				if(tree.blockName.equals("PART"))
				{
					if(parts.get(i).addDeadlyReentry(deadlyReentry))
					{
						return true;
					}
				}
			}
		}
		return false;
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
