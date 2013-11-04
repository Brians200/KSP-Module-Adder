package config.tree;

import org.antlr.runtime.tree.CommonTree;

public class CommentTree implements IKspPartTree {

	int tabAmount;
	String comment;
	
	public CommentTree(CommonTree t, int tabAmount)
	{
		this.tabAmount = tabAmount;
		
		StringBuilder commentBuilder = new StringBuilder();
		
		if(t.getChildCount()>0)
		{
			for(Object objectChild : t.getChildren())
			{
				CommonTree child = (CommonTree) objectChild;
				commentBuilder.append(child.getText());
			}
		}
		
		comment = commentBuilder.toString();
	}
	
	@Override
	public String toString() {
		String tabs = KspPartTreeBuilder.createTabs(tabAmount);
		return tabs + comment;
	}
}
