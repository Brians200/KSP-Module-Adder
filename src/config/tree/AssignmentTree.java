package config.tree;

import org.antlr.runtime.tree.CommonTree;

public class AssignmentTree implements IKspPartTree {

	int tabAmount;
	String lhs;
	String rhs;
	
	public AssignmentTree(CommonTree t, int tabAmount)
	{
		this.tabAmount = tabAmount;
		
		int i = 0;
		CommonTree leftSide = (CommonTree) t.getChild(i++);
		CommonTree rightSide = (CommonTree) t.getChild(i++);
		
		lhs = leftSide.getText().trim();	
		rhs = rightSide.getText().trim();
	}

	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);
		return tabs + lhs + " = " + rhs;
	}
}
