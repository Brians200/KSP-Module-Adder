package configtree;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class EmptyBlockTree implements IKspPartTree {

	int tabAmount;
	List<IKspPartTree> parts = new ArrayList<>();
	public EmptyBlockTree(CommonTree t, int tabAmount)
	{
		this.tabAmount = tabAmount;
		
		int i = 0;
		
		//String tabs = createTabs(tabAmount);
		
		//value.append(tabs);
		//value.append("{");
		
		int numberOfChildren = t.getChildCount();
		for(; i<numberOfChildren; i++)
		{
			//value.append("\n");
			
			CommonTree child = (CommonTree) t.getChild(i);
			if(child.getText().equals("BLOCK"))
			{
				parts.add(new BlockTree(child, tabAmount+1));
				//value.append(createStringBlock(child, tabAmount+1));
			}
			else if(child.getText().equals("COMMENT"))
			{
				parts.add(new CommentTree(child, tabAmount+1));
				//value.append(createStringComment(child, tabAmount+1));
			}
			else if(child.getText().equals("EMPTYBLOCK"))
			{
				parts.add(new EmptyBlockTree(child, tabAmount+1));
				//value.append(createStringEmptyBlock(child, tabAmount+1));
			}
			else if(child.getText().equals("ASSIGNMENT"))
			{
				parts.add(new AssignmentTree(child, tabAmount+1));
				//value.append(createStringAssignment(child, tabAmount+1));
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
		
		//value.append("\n");
		//value.append(tabs);
		//value.append("}\n");
		
	}
	
	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);

		StringBuilder value = new StringBuilder();
		value.append(tabs);
		value.append("{");
		
		for(IKspPartTree child : parts)
		{
			value.append("\n");
			value.append(child);
		}
		
		value.append("\n");
		value.append(tabs);
		value.append("}\n");
		
		return value.toString();
	}
}
