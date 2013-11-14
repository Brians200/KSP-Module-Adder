package config.tree;

import java.util.Hashtable;

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
	
	public boolean addMechjeb(IKspPartTree module)
	{
		return false;  //Should never add mechjeb to this
	}
	
	public boolean addProtractor(IKspPartTree module) {
		return false;  //Should never add protractor to this
	}
	
	@Override
	public boolean addDeadlyReentry(Hashtable<String, Object> deadlyReentry) {
		return false;  //Should never add deadly reentry to this
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
