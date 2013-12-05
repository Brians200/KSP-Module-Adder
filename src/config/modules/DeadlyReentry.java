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
	
	public static String createDeadlyReentryModules(Map<String,String> dr)
	{
		String maxTemp = dr.get("maxTemp");
		String heatProduction = dr.get("heatProduction");
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\t");
		sb.append("@maxTemp = ");
		sb.append(maxTemp);
		
		if(heatProduction!=null)
		{
			sb.append("\n\t");
			sb.append("@MODULE[ModuleEngines]");
			sb.append("\n\t");
			sb.append("{");
			sb.append("\n\t\t");
			sb.append("@heatProduction = ");
			sb.append(heatProduction);
			sb.append("\n\t");
			sb.append("}");
		}
		
		sb.append("\n");
		
		return sb.toString();
	}
}
