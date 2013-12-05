package config.modules;

public class Protractor {
	//MODULE
	//{
	//	name = ProtractorModule
	//}
	
	public static String createProtractorTree()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\n\t");
		sb.append("MODULE");
		sb.append("\n\t");
		sb.append("{");
		sb.append("\n\t\t");
		sb.append("name = ProtractorModule");
		sb.append("\n\t");
		sb.append("}");
		sb.append("\n");
		
		return sb.toString();
	}
}
