package configtree;

import org.antlr.runtime.tree.CommonTree;

public class AssignmentTree implements IKspPartTree {

	int tabAmount;
	String lhs;
	String rhs;
	
	public AssignmentTree(CommonTree t, int tabAmount)
	{
		this.tabAmount = tabAmount;
		
		//String tabs = createTabs(tabAmount);
		//value.append(tabs);
		
		int i = 0;
		CommonTree leftSide = (CommonTree) t.getChild(i++);
		
		lhs = leftSide.getText();	
		//value.append(leftSide.getText());
		//value.append(" = ");
		
		StringBuilder rightSide = new StringBuilder();
		int childCount = t.getChildCount();
		
		for(; i<childCount; i++)
		{	
			CommonTree child = (CommonTree) t.getChild(i);
			rightSide.append(child.getText());
		}
		
		rhs = rightSide.toString();
	}

	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);
		return tabs + lhs + " = " + rhs;
	}
}
