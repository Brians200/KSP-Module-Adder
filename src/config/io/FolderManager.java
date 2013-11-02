package config.io;

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
				traverseDirectory(path);
			}
			else
			{
				if(path.endsWith(".cfg") && !filesToIgnore.contains(path))
				{
					FileChanger.applyChanges(path);
				}
			}
		}
		
	}
	
}
