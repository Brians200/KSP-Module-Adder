package config.tree;

import java.util.HashMap;
import java.util.Map;

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
	
	public int getTabAmount(){
		return tabAmount;
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
		Map<String,String> ret = new HashMap<String, String>();
		ret.put(lhs,rhs);
		return ret;
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
