package config.modules;

import java.util.Map;

public class DeadlyReentry {

	/*
	@PART[liquidEngine]
	{
		@maxTemp = 1800
		@MODULE[ModuleEngines]
		{
			@heatProduction = 200
		}
	}
	*/
	
	
	//For now I think decent rules are 
	//default maxtemp of 1450, 
	//parachutes to 1150, 
	//pods (i.e. modulecommand + crewCapacity>0) and 
	//aerodynamic and structural parts to 1600, 
	//ignore engines (let MFS handle it, and if MFS doesn't exist DRE will automatically halve the maxTemp),
	//and science to 600.
	public static String createDeadlyReentryModules(Map<String,String> dr)
	{
		int maxTemp = Integer.parseInt(dr.get("maxTemp"));
		int correctedTemp = 1450;
		
		String module = dr.get("Module");
		String category = dr.get("category");
		
		if(module!=null && module.equals("ModuleEngines"))
		{
			return null;//deadly reentry will handle this automatically
		}
		else if(module != null && module.equals("ModuleCommand")) //Crew pod or probe
		{
			String crewCapacity = dr.get("CrewCapacity");
			if(crewCapacity != null && Integer.parseInt(crewCapacity)>0)
				correctedTemp = Math.min(maxTemp, 1600);
		}
		else if(module != null && module.equals("ModuleScienceExperiment"))
		{
			String crewCapacity = dr.get("CrewCapacity");
			if(crewCapacity != null && Integer.parseInt(crewCapacity)>0)
			{
				correctedTemp = Math.min(maxTemp, 1600);
			}
			else
			{
				correctedTemp = Math.min(maxTemp, 600);
			}
		}
		else if(module != null && (module.equals("ModuleParachute") || module.equals("RealChuteModule")))
		{
			correctedTemp = Math.min(maxTemp, 1150);
		}
		else if(category != null && category.equals("Structural"))
		{
			correctedTemp = Math.min(maxTemp, 1600);
		}
		else if(category != null && category.equals("Aero"))
		{
			correctedTemp = Math.min(maxTemp, 1600);
		}
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n\t");
		sb.append("@maxTemp = ");
		sb.append(correctedTemp);
				
		sb.append("\n");
		
		return sb.toString();
	}
}
