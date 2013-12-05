package config.modules;

public class Mechjeb {

	public static String createMechjebTree() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\t");
		sb.append("MODULE");
		sb.append("\n\t");
		sb.append("{");
		sb.append("\n\t\t");
		sb.append("name = MechJebCore");
		sb.append("\n\t\t");
		sb.append("MechJebLocalSettings {");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleCustomWindowEditor { unlockTechs = flightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleSmartASS { unlockTechs = flightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleManeuverPlanner { unlockTechs = advFlightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleNodeEditor { unlockTechs = advFlightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleTranslatron { unlockTechs = advFlightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleWarpHelper { unlockTechs = advFlightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleAttitudeAdjustment { unlockTechs = advFlightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleThrustWindow { unlockTechs = advFlightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleRCSBalancerWindow { unlockTechs = advFlightControl }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleAscentGuidance { unlockTechs = unmannedTech }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleLandingGuidance { unlockTechs = unmannedTech }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleSpaceplaneGuidance { unlockTechs = unmannedTech }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleDockingGuidance { unlockTechs = advUnmanned }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleRendezvousAutopilotWindow { unlockTechs = advUnmanned }");
		sb.append("\n\t\t\t");
		sb.append("MechJebModuleRendezvousGuidance { unlockTechs = advUnmanned }");
		sb.append("\n\t\t");
		sb.append("}");
		sb.append("\n\t");
		sb.append("}");
		sb.append("\n");

		return sb.toString();
	}
}
