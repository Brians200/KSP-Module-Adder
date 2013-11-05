package config.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;

import config.modules.Mechjeb;
import config.modules.Protractor;
import config.tree.IKspPartTree;
import config.tree.KspPartTreeBuilder;

public class FileChanger {

	static IKspPartTree mechjeb = Mechjeb.createMechjebTree();
	static IKspPartTree protractor = Protractor.createProtractorTree();
	
	public static void applyChanges(String filePath, boolean addMechjeb, boolean addProtractor)
	{
		try {
			
			Scanner file = new Scanner(new File(filePath));
			String fileContents = file.useDelimiter("\\A").next();
			file.close();
			
			ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
			ConfigGrammarLexer cgl = new ConfigGrammarLexer(fileStream);
			TokenRewriteStream tokens = new TokenRewriteStream(cgl);
			ConfigGrammarParser cgp = new ConfigGrammarParser(tokens);
			ConfigGrammarParser.config_return config= cgp.config();
			
			IKspPartTree tree = null;
			
			try{
				tree = KspPartTreeBuilder.build((CommonTree) config.getTree());
			}
			catch(Exception e)
			{
				System.out.println("Attempting to fix: " + filePath);
				FileFixer.attemptFix(filePath);
				
				fileStream = new ANTLRFileStream(filePath);
				cgl = new ConfigGrammarLexer(fileStream);
				tokens = new TokenRewriteStream(cgl);
				cgp = new ConfigGrammarParser(tokens);
				config = cgp.config();
				
				try
				{
					tree = KspPartTreeBuilder.build((CommonTree) config.getTree());
					System.out.println("File can now be parsed! Check file for errors manually.");
				}
				catch(Exception e1)
				{
					System.out.println("Could not make file parseable... Check file for errors manually.");
					return;
				}
			}
			
			
			if(addMechjeb && tree.addMechjeb(mechjeb))
			{	
					System.out.println("Mechjeb added to " + filePath);
			}
			
			
			if(addProtractor && tree.addProtractor(protractor))
			{
				System.out.println("Protractor added to " + filePath);
			}
			
			if(!fileContents.equals(tree.toString()))  //only write the file if we changed something
			{
				PrintWriter out = new PrintWriter(filePath);
				out.print(tree.toString());
				out.close();
			}
			
		} catch (RecognitionException | IOException e) {
			// TODO: Proper error handling
			//e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}		
		
}
