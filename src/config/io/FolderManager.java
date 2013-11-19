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

public class FolderManager {
	static HashSet<String> filesToIgnore = new HashSet<>(); 
	static public void applyChanges(/*parameters to be added */)
	{
		String directory = "GameData";
	
		//Check to see if mechjeb is present
		File mechjeb = new File(directory + "\\MechJeb2\\Plugins\\MechJeb2.dll");	
		
		//Check to see if Protractor is present
		File protractor = new File(directory + "\\Protractor\\Plugins\\protractor.dll");
		
		//Check to see if Deadly Reentry is present
		File deadlyReentry = new File(directory + "\\DeadlyReentry\\Plugins\\DeadlyReentry.dll");
			
		//Files that don't need touched
		filesToIgnore.add("GameData\\BoulderCo\\common.cfg");
		filesToIgnore.add("GameData\\BoulderCo\\Clouds\\cloudLayers.cfg");
		filesToIgnore.add("GameData\\KAS\\addModule.cfg");
		filesToIgnore.add("GameData\\KAS\\settings.cfg");
		filesToIgnore.add("GameData\\Kethane\\Grid.cfg");
		filesToIgnore.add("GameData\\Kethane\\settings.cfg");
		filesToIgnore.add("GameData\\Kethane\\Resources\\Kethane.cfg");
		filesToIgnore.add("GameData\\MechJeb2\\Plugins\\PluginData\\MechJeb2\\mechjeb_settings_global.cfg");
		filesToIgnore.add("GameData\\MechJeb2\\Plugins\\PluginData\\MechJeb2\\mechjeb_settings_type_.cfg");
		filesToIgnore.add("GameData\\MechJeb2\\Plugins\\PluginData\\MechJeb2\\mechjeb_settings_type_Untitled Space Craft Probe.cfg");
		filesToIgnore.add("GameData\\MechJeb2\\Plugins\\PluginData\\MechJeb2\\mechjeb_settings_type_Untitled Space Craft.cfg");
		filesToIgnore.add("GameData\\RCSBuildAid\\settings.cfg");
		filesToIgnore.add("GameData\\Squad\\Resources\\ScienceDefs.cfg"); 
		filesToIgnore.add("GameData\\Squad\\Resources\\ResourcesGeneric.cfg");
		
		//Deadly re-entry editor files
		filesToIgnore.add("GameData\\DeadlyReentry\\custom.cfg");
		filesToIgnore.add("GameData\\DeadlyReentry\\DeadlyReentry.cfg");
		filesToIgnore.add("GameData\\DeadlyReentry\\DeadlyReentry_B9.cfg");
		filesToIgnore.add("GameData\\DeadlyReentry\\DeadlyReentry-HOME.cfg");
		filesToIgnore.add("GameData\\DeadlyReentry\\DeadlyReentryTechTree.cfg");
		filesToIgnore.add("GameData\\DeadlyReentry\\DeadlyReentry_TiberDyne_Shuttle.cfg");
		
		traverseDirectory(directory, mechjeb.exists(), protractor.exists(), deadlyReentry.exists());
	}
	
	static private void traverseDirectory(String directory, boolean addMechjeb, boolean addProtractor, boolean addDeadlyReentry)
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
				if(path.equals("GameData\\Squad\\Props")||path.equals("GameData\\MechJeb2\\Plugins\\PluginData\\MechJeb2")||path.equals("GameData\\DeadlyReentry"))
					continue;
				
				traverseDirectory(path, addMechjeb, addProtractor, addDeadlyReentry);
			}
			else
			{
				if(path.endsWith(".cfg") && !filesToIgnore.contains(path))
				{
					FileChanger.applyChanges(path, addMechjeb, addProtractor, addDeadlyReentry);
				}
			}
		}
		
	}
	
}
