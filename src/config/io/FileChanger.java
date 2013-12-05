package config.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;

import config.modules.DeadlyReentry;
import config.modules.Mechjeb;
import config.modules.Protractor;
import config.tree.IKspPartTree;
import config.tree.KspPartTreeBuilder;

public class FileChanger {

	public static void applyChanges(String filePath, boolean addMechjeb, boolean addProtractor, boolean addDeadlyReentry)
	{
		try {
			
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
			
			String mechjeb = null;
			String protractor = null;
			String deadlyReentry = null;
			String partName = null;
			
			if(addMechjeb)
			{	
				partName = tree.addMechjeb();
				if(partName != null)
				{
					mechjeb = Mechjeb.createMechjebTree();
				}
			}
			
			if(addProtractor)
			{
				partName = tree.addProtractor();
				if(partName != null)
				{
					protractor = Protractor.createProtractorTree();
				}
			}
			
			if(addDeadlyReentry)
			{
				Map<String,String> parts = tree.addDeadlyReentry();	
				if(parts != null)
				{
					partName = parts.get("partName");
					deadlyReentry = DeadlyReentry.createDeadlyReentryModules(parts);
				}
			}
			
			if(mechjeb!=null || protractor!=null || deadlyReentry!=null)
			{
				FileWriter out = new FileWriter("GameData\\moduleChanges.cfg",true);
				out.append("@PART[" + partName + "]");
				out.append("\n");
				out.append("{");
				
				if(deadlyReentry!=null)
					out.append(deadlyReentry);

				if(protractor!=null)
					out.append(protractor);
				
				if(mechjeb!=null)
					out.append(mechjeb);
				
				out.append("}");
				out.append("\n");
				
				
				out.close();
				
				if(mechjeb!=null)
					System.out.println("Mechjeb added to " + filePath);
				if(protractor!=null)
					System.out.println("Protractor added to " + filePath);
				if(deadlyReentry!=null)
					System.out.println("Deadly Reentry added to " + filePath);
			}
			
		} catch (RecognitionException | IOException e) {
			// TODO: Proper error handling
			//e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}		
		
}
