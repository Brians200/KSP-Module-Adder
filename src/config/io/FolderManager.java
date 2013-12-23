package config.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import config.misc.GlobalIgnoreList;

public class FolderManager {
	static HashSet<String> filesToIgnore = new HashSet<>(); 
	static public void applyChanges(/*parameters to be added */)
	{
		String directory = "GameData";
		
		File moduleChanges = new File(directory + "\\moduleChanges.cfg");
		moduleChanges.delete();
		
		/*//Check to see if mechjeb is present
		File mechjeb = new File(directory + "\\MechJeb2\\Plugins\\MechJeb2.dll");	
		
		//Check to see if Protractor is present
		File protractor = new File(directory + "\\Protractor\\Plugins\\protractor.dll");
		
		//Check to see if Deadly Reentry is present
		File deadlyReentry = new File(directory + "\\DeadlyReentry\\Plugins\\DeadlyReentry.dll");*/
			
		traverseDirectory(directory);
	}
	
	static private void traverseDirectory(String directory)
	{
		List<String> fileNames = new ArrayList<>();
		
		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directory))) {
            for (Path path : directoryStream) {
                fileNames.add(path.toString());
            }
        } catch (IOException ex) {
        	//TODO: proper error handling
        	throw new RuntimeException(ex);
        }
		
		
		for(String path : fileNames)
		{
			if(Files.isDirectory(Paths.get(path), LinkOption.NOFOLLOW_LINKS))
			{
				if(GlobalIgnoreList.foldersToIgnore.contains(path))
					continue;
				
				traverseDirectory(path);
			}
			else
			{
				if(path.endsWith(".cfg") && !GlobalIgnoreList.filesToIgnore.contains(path))
				{
					FileChanger.applyChanges(path);
				}
			}
		}
		
	}
	
}
