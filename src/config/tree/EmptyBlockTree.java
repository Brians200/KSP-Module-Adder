package config.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

public class EmptyBlockTree implements IKspPartTree {

	int tabAmount;
	List<IKspPartTree> parts = new ArrayList<>();
	public EmptyBlockTree(CommonTree t, int tabAmount)
	{
		this.tabAmount = tabAmount;
		
		int i = 0;
		
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
	
	public EmptyBlockTree()
	{
		
	}
	
	public void addPart(IKspPartTree part)
	{
		parts.add(part);
	}
	
	public String addMechjeb()
	{
		return null;  //Should never add mechjeb to this
	}
	
	public String addProtractor() {
		return null;  //Should never add protractor to this
	}
	
	@Override
	public Map<String,String> addDeadlyReentry() {
		return null;  //Should never add deadly reentry to this
	}
	
	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);

		StringBuilder value = new StringBuilder();
		value.append(tabs);
		value.append("{");
		
		for(IKspPartTree child : parts)
		{
			value.append(child);
		}
		
		value.append(tabs);
		value.append("}\n");
		
		return value.toString();
	}

}
