package config.tree;

import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

public class MMRemoveTree implements IKspPartTree{

	int tabAmount;
	String remove;
	
	public MMRemoveTree(CommonTree t, int tabAmount)
	{
		this.tabAmount = tabAmount;
		CommonTree child = (CommonTree) t.getChild(0);
		remove = child.getText().trim();
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
	
	public MMRemoveTree(String remove)
	{
		this.remove = remove;
	}
	
	public MMRemoveTree(String remove, int tabAmount)
	{
		this.remove = remove;
		this.tabAmount = tabAmount;
	}
	
	public String getComment()
	{
		return remove;
	}
	
	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);
		return tabs + remove + "\n";
	}

}
