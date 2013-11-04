package config.modules;

import config.tree.AssignmentTree;
import config.tree.BlockTree;

public class Mechjeb {
	
	public static BlockTree createMechjebTree()
	{
		
		//MODULE{
		BlockTree module = new BlockTree("MODULE",1);
		
		//name = MechJebCore
		AssignmentTree moduleName = new AssignmentTree("name", "MechJebCore",2);
		module.addPart(moduleName);
		
		//MechJebLocalSettings{
		BlockTree mechJebLocalSettings = new BlockTree("MechJebLocalSettings",2);
		module.addPart(mechJebLocalSettings);
		
		//MechJebModuleCustomWindowEditor {unlockTechs = flightControl}
		BlockTree mechJebModuleCustomWindowEditor = new BlockTree("MechJebModuleCustomWindowEditor",3);
		mechJebModuleCustomWindowEditor.addPart(new AssignmentTree("unlockTechs", "flightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleCustomWindowEditor);
		
		//MechJebModuleSmartASS {unlockTechs = flightControl}
		BlockTree mechJebModuleSmartASS = new BlockTree("MechJebModuleSmartASS",3);
		mechJebModuleSmartASS.addPart(new AssignmentTree("unlockTechs", "flightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleSmartASS);
		
		//MechJebModuleManeuverPlanner {unlockTechs = advFlightControl}
		BlockTree mechJebModuleManeuverPlanner = new BlockTree("MechJebModuleManeuverPlanner",3);
		mechJebModuleManeuverPlanner.addPart(new AssignmentTree("unlockTechs", "advFlightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleManeuverPlanner);
		
		//MechJebModuleNodeEditor {unlockTechs = advFlightControl}
		BlockTree mechJebModuleNodeEditor = new BlockTree("MechJebModuleNodeEditor",3);
		mechJebModuleNodeEditor.addPart(new AssignmentTree("unlockTechs", "advFlightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleNodeEditor);
		
		//MechJebModuleTranslatron {unlockTechs = advFlightControl}
		BlockTree mechJebModuleTranslatron = new BlockTree("MechJebModuleTranslatron",3);
		mechJebModuleTranslatron.addPart(new AssignmentTree("unlockTechs", "advFlightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleTranslatron);
		
		//MechJebModuleWarpHelper {unlockTechs = advFlightControl}
		BlockTree mechJebModuleWarpHelper = new BlockTree("MechJebModuleWarpHelper",3);
		mechJebModuleWarpHelper.addPart(new AssignmentTree("unlockTechs", "advFlightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleWarpHelper);
		
		//MechJebModuleAttitudeAdjustment{unlockTechs = advFlightControl}
		BlockTree mechJebModuleAttitudeAdjustment = new BlockTree("MechJebModuleAttitudeAdjustment",3);
		mechJebModuleAttitudeAdjustment.addPart(new AssignmentTree("unlockTechs", "advFlightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleAttitudeAdjustment);
		
		//MechJebModuleThrustWindow {unlockTechs = advFlightControl}
		BlockTree mechJebModuleThrustWindow = new BlockTree("MechJebModuleThrustWindow",3);
		mechJebModuleThrustWindow.addPart(new AssignmentTree("unlockTechs", "advFlightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleThrustWindow);
		
		//MechJebModuleRCSBalancerWindow {unlockTechs = advFlightControl}
		BlockTree mechJebModuleRCSBalancerWindow = new BlockTree("MechJebModuleRCSBalancerWindow",3);
		mechJebModuleRCSBalancerWindow.addPart(new AssignmentTree("unlockTechs", "advFlightControl",4));
		mechJebLocalSettings.addPart(mechJebModuleRCSBalancerWindow);
		
		//MechJebModuleRoverWindow {unlockTechs = fieldScience}
		BlockTree mechJebModuleRoverWindow = new BlockTree("MechJebModuleRoverWindow",3);
		mechJebModuleRoverWindow.addPart(new AssignmentTree("unlockTechs", "fieldScience",4));
		mechJebLocalSettings.addPart(mechJebModuleRoverWindow);
		
		//MechJebModuleAscentGuidance {unlockTechs = unmannedTech}
		BlockTree mechJebModuleAscentGuidance = new BlockTree("MechJebModuleAscentGuidance",3);
		mechJebModuleAscentGuidance.addPart(new AssignmentTree("unlockTechs", "unmannedTech",4));
		mechJebLocalSettings.addPart(mechJebModuleAscentGuidance);
		
		//MechJebModuleLandingGuidance {unlockTechs = unmannedTech}
		BlockTree mechJebModuleLandingGuidance = new BlockTree("MechJebModuleLandingGuidance",3);
		mechJebModuleLandingGuidance.addPart(new AssignmentTree("unlockTechs", "unmannedTech",4));
		mechJebLocalSettings.addPart(mechJebModuleLandingGuidance);
		
		//MechJebModuleSpaceplaneGuidance {unlockTechs = unmannedTech}
		BlockTree mechJebModuleSpaceplaneGuidance = new BlockTree("MechJebModuleSpaceplaneGuidance",3);
		mechJebModuleSpaceplaneGuidance.addPart(new AssignmentTree("unlockTechs", "unmannedTech",4));
		mechJebLocalSettings.addPart(mechJebModuleSpaceplaneGuidance);
		
		//MechJebModuleDockingGuidance {unlockTechs = advUnmanned}
		BlockTree mechJebModuleDockingGuidance = new BlockTree("MechJebModuleDockingGuidance",3);
		mechJebModuleDockingGuidance.addPart(new AssignmentTree("unlockTechs", "advUnmanned",4));
		mechJebLocalSettings.addPart(mechJebModuleDockingGuidance);
		
		//MechJebModuleRendezvousAutopilotWindow {unlockTechs = advUnmanned}
		BlockTree mechJebModuleRendezvousAutopilotWindow = new BlockTree("MechJebModuleRendezvousAutopilotWindow",3);
		mechJebModuleRendezvousAutopilotWindow.addPart(new AssignmentTree("unlockTechs", "advUnmanned",4));
		mechJebLocalSettings.addPart(mechJebModuleRendezvousAutopilotWindow);
		
		//MechJebModuleRendezvousGuidance {unlockTechs = advUnmanned}
		BlockTree mechJebModuleRendezvousGuidance = new BlockTree("MechJebModuleRendezvousGuidance",3);
		mechJebModuleRendezvousGuidance.addPart(new AssignmentTree("unlockTechs", "advUnmanned",4));
		mechJebLocalSettings.addPart(mechJebModuleRendezvousGuidance);
		
		return module;
	}
}
