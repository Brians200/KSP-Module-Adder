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
		
		//Files that don't need touched
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
		filesToIgnore.add("GameData\\Squad\\Resources\\ScienceDefs.cfg"); //works as a string stream but not a filestream...
		filesToIgnore.add("GameData\\WarpPlugin\\Parts\\Resources\\ScienceDefs.cfg"); //works as a string stream but not a filestream...
		filesToIgnore.add("GameData\\WarpPlugin\\Parts\\Resources\\ResourcesGeneric.cfg"); //works as a string stream but not a filestream...
		
		//TODO: handle special characters, blacklisting files for now
		filesToIgnore.add("GameData\\Squad\\Parts\\Science\\GooExperiment\\part.cfg");
		filesToIgnore.add("GameData\\Squad\\Parts\\Utility\\ladder1\\part.cfg");
		filesToIgnore.add("GameData\\Squad\\Parts\\Utility\\telescopicLadder\\part.cfg");
		filesToIgnore.add("GameData\\Squad\\Parts\\Utility\\telescopicLadderBay\\part.cfg");
		
		//TODO: handle files that are malformed, blacklisting for now
		filesToIgnore.add("GameData\\Squad\\Parts\\Electrical\\batteryBankLarge\\part.cfg");
		filesToIgnore.add("GameData\\Squad\\Parts\\Science\\MaterialBay\\part.cfg");
		filesToIgnore.add("GameData\\Squad\\Parts\\Structural\\adapterLargeSmallBi\\part.cfg");
		filesToIgnore.add("GameData\\Squad\\Parts\\Structural\\adapterLargeSmallQuad\\part.cfg");
		filesToIgnore.add("GameData\\Squad\\Parts\\Structural\\adapterLargeSmallTri\\part.cfg");
		filesToIgnore.add("GameData\\Squad\\Parts\\Utility\\mediumDishAntenna\\part.cfg"); //not really sure what is wrong with this file yet...
		filesToIgnore.add("GameData\\TiberDyneShuttle\\Parts\\LandingGear\\TD_ShuttleGearDown\\part.cfg");
		filesToIgnore.add("GameData\\TiberDyneShuttle\\Parts\\LandingGear\\TD_ShuttleGearDownLarge\\part.cfg");
		filesToIgnore.add("GameData\\TiberDyneShuttle\\Parts\\LandingGear\\TD_ShuttleGearUp\\part.cfg");
		filesToIgnore.add("GameData\\TiberDyneShuttle\\Parts\\LandingGear\\TD_ShuttleGearUpLarge\\part.cfg");
		
		
		
		
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
				if(path.equals("GameData\\Squad\\Props"))
					continue;
				
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
