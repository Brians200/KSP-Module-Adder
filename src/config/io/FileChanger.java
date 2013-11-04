package config.io;

import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;

import config.tree.IKspPartTree;
import config.tree.KspPartTreeBuilder;

public class FileChanger {

	public static void applyChanges(String filePath)
	{
		
		try {
			
			ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
			ConfigGrammarLexer cgl = new ConfigGrammarLexer(fileStream);
			TokenRewriteStream tokens = new TokenRewriteStream(cgl);
			ConfigGrammarParser cgp = new ConfigGrammarParser(tokens);
			ConfigGrammarParser.config_return config;
			config = cgp.config();
			
			IKspPartTree tree = KspPartTreeBuilder.build((CommonTree) config.getTree());
			
			PrintWriter out = new PrintWriter(filePath);
			out.print(tree.toString());
			out.close();
			
		} catch (RecognitionException | IOException e) {
			// TODO: Proper error handling
			//e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}		
		
}
