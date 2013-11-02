import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;

import configtree.IKspPartTree;
import configtree.KspPartTreeBuilder;



public class KspModuleEditor {

	public static void main(String[] args) throws IOException, RecognitionException {
		//ANTLR Test
		
		//TODO: Proper error handling
		ANTLRFileStream fileStream = new ANTLRFileStream("part.cfg");
		ConfigGrammarLexer cgl = new ConfigGrammarLexer(fileStream);
		TokenRewriteStream tokens = new TokenRewriteStream(cgl);
		ConfigGrammarParser cgp = new ConfigGrammarParser(tokens);
		ConfigGrammarParser.config_return config = cgp.config();
		
		IKspPartTree tree = KspPartTreeBuilder.build((CommonTree) config.getTree());
		
		System.out.println(tree);
		
	}
	
}
