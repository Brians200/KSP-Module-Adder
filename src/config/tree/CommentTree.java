package config.tree;

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
	
	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);
		return tabs + comment;
	}
}
