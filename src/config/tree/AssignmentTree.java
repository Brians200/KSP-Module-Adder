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
	
	public String getLhs() {
		return lhs;
	}

	public String getRhs() {
		return rhs;
	}

	public boolean addMechjeb(IKspPartTree module)
	{
		return false;  //Should never add mechjeb to this
	}
	
	public boolean addProtractor(IKspPartTree module) {
		return false;  //Should never add protractor to this
	}
	
	public AssignmentTree(String lhs, String rhs, int tabAmount)
	{
		this.tabAmount = tabAmount;
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);
		return tabs + lhs + " = " + rhs + "\n";
	}

	
}
