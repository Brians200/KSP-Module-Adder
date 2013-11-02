import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;



public class KspModuleEditor {

	public static void main(String[] args) throws IOException, RecognitionException {
		//ANTLR Test
		
		//TODO: Proper error handling
		ANTLRFileStream fileStream = new ANTLRFileStream("part.cfg");
		ConfigGrammarLexer cgl = new ConfigGrammarLexer(fileStream);
		TokenRewriteStream tokens = new TokenRewriteStream(cgl);
		ConfigGrammarParser cgp = new ConfigGrammarParser(tokens);
		ConfigGrammarParser.config_return config = cgp.config();
		
		System.out.println(createStringConfig((CommonTree) config.getTree()));
	}
	
	static String createStringConfig(CommonTree t)
	{
		StringBuilder value = new StringBuilder();
		
		for(Object childObject : t.getChildren())
		{
			CommonTree child = (CommonTree) childObject;
			
			if(child.getText().equals("BLOCK"))
			{
				value.append(createStringBlock(child, 0));
			}
			else if(child.getText().equals("COMMENT"))
			{
				value.append(createStringComment(child, 0));
			}
			else
			{
				throw new IllegalArgumentException();
			}
			
		}
		
		
		return value.toString();
	}
	
	static String createStringBlock(CommonTree t, int tabAmount)
	{
		StringBuilder value = new StringBuilder();
		
		int i = 0;
		String blockName = t.getChild(i++).getText();
		
		String tabs = createTabs(tabAmount);
		
		value.append(tabs);
		value.append(blockName);
		
		value.append("\n");
		value.append(tabs);
		value.append("{");
		
		int numberOfChildren = t.getChildCount();
		for(; i<numberOfChildren; i++)
		{
			value.append("\n");
			
			CommonTree child = (CommonTree) t.getChild(i);
			if(child.getText().equals("BLOCK"))
			{
				value.append(createStringBlock(child, tabAmount+1));
			}
			else if(child.getText().equals("COMMENT"))
			{
				value.append(createStringComment(child, tabAmount+1));
			}
			else if(child.getText().equals("EMPTYBLOCK"))
			{
				value.append(createStringEmptyBlock(child, tabAmount+1));
			}
			else if(child.getText().equals("ASSIGNMENT"))
			{
				value.append(createStringAssignment(child, tabAmount+1));
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
		
		value.append("\n");
		value.append(tabs);
		value.append("}");
		
		
		
		
		return value.toString();
	}
	
	static String createStringEmptyBlock(CommonTree t, int tabAmount)
	{
		StringBuilder value = new StringBuilder();
		
		
		
		
		
		return value.toString();
	}
	
	static String createStringComment(CommonTree t, int tabAmount)
	{
		StringBuilder value = new StringBuilder();
		
		String tabs = createTabs(tabAmount);
		
		value.append(tabs);
		value.append("//");
		
		for(Object objectChild : t.getChildren())
		{
			CommonTree child = (CommonTree) objectChild;
			value.append(child.getText());
		}
		
		
		return value.toString();
	}
	
	static String createStringAssignment(CommonTree t, int tabAmount)
	{
		StringBuilder value = new StringBuilder();
		
		String tabs = createTabs(tabAmount);
		value.append(tabs);
		
		int i = 0;
		CommonTree leftSide = (CommonTree) t.getChild(i++);
		value.append(leftSide.getText());
		value.append(" = ");
		
		int childCount = t.getChildCount();
		
		for(; i<childCount; i++)
		{	
			CommonTree child = (CommonTree) t.getChild(i);
			value.append(child.getText());
		}
		
		
		return value.toString();
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
