package config.modules;

import config.tree.AssignmentTree;
import config.tree.BlockTree;

public class Protractor {
	//MODULE
	//{
	//	name = ProtractorModule
	//}
	
	public static BlockTree createProtractorTree()
	{
		BlockTree module = new BlockTree("MODULE",1);
		
		AssignmentTree moduleName = new AssignmentTree("name", "ProtractorModule",2);
		module.addPart(moduleName);
		
		return module;
	}
}
