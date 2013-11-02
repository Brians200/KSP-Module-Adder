package configtree;

import org.antlr.runtime.tree.CommonTree;

public class KspPartTreeBuilder {
	
	public static IKspPartTree build(CommonTree t)
	{
		ConfigTree tree = new ConfigTree(t);
		return tree;
	}
	
	static String createTabs(int amount)
	{
		StringBuilder value = new StringBuilder();
		for(int i=0;i<amount;i++)
		{
			value.append("\t");
		}
		return value.toString();
	}
}
