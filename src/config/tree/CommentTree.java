package config.tree;

import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

public class CommentTree implements IKspPartTree {

	int tabAmount;
	String comment;
	
	public CommentTree(CommonTree t, int tabAmount)
	{
		this.tabAmount = tabAmount;
		CommonTree child = (CommonTree) t.getChild(0);
		comment = child.getText().trim();
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
	
	public CommentTree(String comment)
	{
		this.comment = comment;
	}
	
	public CommentTree(String comment, int tabAmount)
	{
		this.comment = comment;
		this.tabAmount = tabAmount;
	}
	
	public String getComment()
	{
		return comment;
	}
	
	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);
		return tabs + comment + "\n";
	}
}
