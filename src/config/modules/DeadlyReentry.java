package config.modules;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import config.tree.AssignmentTree;
import config.tree.BlockTree;
import config.tree.CommentTree;
import config.tree.IKspPartTree;

public class DeadlyReentry {

	public static Hashtable<String, Object> createDeadlyReentryModules()
	{
		Hashtable<String, Object> modules = new Hashtable<>();
	
		/*@PART[noseCone]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, 0 // full-surface coating
				reflective = 0.1
			}
		}*/
		BlockTree noseCone = new BlockTree("MODULE", 1);
			noseCone.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			noseCone.addPart(new AssignmentTree("direction", "0, 0, 0 // full-surface coating", 2));
			noseCone.addPart(new AssignmentTree("reflective", "0.1", 2));
			modules.put("noseCone", noseCone);
	
		/*@PART[noseConeAdapter]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0.707, -0.707 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree noseConeAdapter = new BlockTree("MODULE", 1);
			noseConeAdapter.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			noseConeAdapter.addPart(new AssignmentTree("direction", "0, 0.707, -0.707 // underside of fuselage", 2));
			noseConeAdapter.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("noseConeAdapter", noseConeAdapter);
	
		/*@PART[standardNoseCone]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, 0 // full surface coating
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree standardNoseCone = new BlockTree("MODULE", 1);
			standardNoseCone.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			standardNoseCone.addPart(new AssignmentTree("direction", "0, 0, 0 // full surface coating", 2));
			standardNoseCone.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("standardNoseCone", standardNoseCone);
	
		/*@PART[Mark1Cockpit]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0.15, 0.9 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree Mark1Cockpit = new BlockTree("MODULE", 1);
			Mark1Cockpit.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			Mark1Cockpit.addPart(new AssignmentTree("direction", "0, 0.15, 0.9 // underside of fuselage", 2));
			Mark1Cockpit.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("Mark1Cockpit", Mark1Cockpit);
	
		/*@PART[avionicsNoseCone]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, 0 // full surface coating
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree avionicsNoseCone = new BlockTree("MODULE", 1);
			avionicsNoseCone.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			avionicsNoseCone.addPart(new AssignmentTree("direction", "0, 0, 0 // full surface coating", 2));
			avionicsNoseCone.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("avionicsNoseCone", avionicsNoseCone);
	
		/*@PART[mark3Cockpit]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0.15, 0.9 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree mark3Cockpit = new BlockTree("MODULE", 1);
			mark3Cockpit.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			mark3Cockpit.addPart(new AssignmentTree("direction", "0, 0.15, 0.9 // underside of fuselage", 2));
			mark3Cockpit.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("mark3Cockpit", mark3Cockpit);
		
		/*@PART[mk1pod]{
			MODULE
			{ // this one is custom, and is a little thicker than most heat shields.
				name = ModuleHeatShield
				direction = 0, -1, 0 // bottom of pod
				reflective = 0.05 // 5% of heat is ignored at correct angle
				ablative = AblativeShielding
				loss
				{ // loss is based on the shockwave temperature (also based on density)
					key = 650 0 // start ablating at 650 degrees C
					key = 1000 64 // peak ablation at 1000 degrees C
					key = 3000 80 // max ablation at 3000 degrees C
				}
				dissipation
				{ // dissipation is based on the part's current temperature
						key = 300 0 // begin ablating at 300 degrees C
						key = 500 180 // maximum dissipation at 500 degrees C
				}
			}
			RESOURCE
			{
				name = AblativeShielding
				amount = 250
				maxAmount = 250
			}
		}*/
		List<IKspPartTree> mk1pod = new ArrayList<>();{  //block these variables off so I can reuse the names later
		BlockTree mk1pod1 = new BlockTree("MODULE", 1);
			mk1pod1.addPart(new CommentTree("// this one is custom, and is a little thicker than most heat shields.", 2));
			mk1pod1.addPart(new AssignmentTree("name", "ModuleHeatShield",2));
			mk1pod1.addPart(new AssignmentTree("direction","0, -1, 0 // bottom of pod",2));
			mk1pod1.addPart(new AssignmentTree("reflective", "0.05 // 5% of heat is ignored at correct angle", 2));
			mk1pod1.addPart(new AssignmentTree("ablative", "AblativeShielding", 2));
			BlockTree loss = new BlockTree("loss", 2);
				loss.addPart(new CommentTree("// loss is based on the shockwave temperature (also based on density)",3));
				loss.addPart(new AssignmentTree("key", "650 0 // start ablating at 650 degrees C", 3));
				loss.addPart(new AssignmentTree("key", "1000 64 // peak ablation at 1000 degrees C", 3));
				loss.addPart(new AssignmentTree("key", "3000 80 // max ablation at 3000 degrees C", 3));
				mk1pod1.addPart(loss);
			BlockTree dissipation = new BlockTree("dissipation", 2);
				dissipation.addPart(new CommentTree("// dissipation is based on the part's current temperature", 3));
				dissipation.addPart(new AssignmentTree("key", "300 0 // begin ablating at 300 degrees C", 3));
				dissipation.addPart(new AssignmentTree("key", "500 180 // maximum dissipation at 500 degrees C", 3));
				mk1pod1.addPart(dissipation);
		mk1pod.add(mk1pod1);
		BlockTree resource = new BlockTree("RESOURCE", 1);
			resource.addPart(new AssignmentTree("name", "AblativeShielding", 2));
			resource.addPart(new AssignmentTree("amount", "250", 2));
			resource.addPart(new AssignmentTree("maxAmount", "250", 2));
		mk1pod.add(resource);}
		modules.put("mk1pod", mk1pod);
		

		/*@PART[probeCoreSphere]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, 0 // full surface coating
				reflective = 0.1
			}
		}*/
		BlockTree probeCoreSphere = new BlockTree("MODULE", 1);
			probeCoreSphere.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			probeCoreSphere.addPart(new AssignmentTree("direction", "0, 0, 0 // full surface coating", 2));
			probeCoreSphere.addPart(new AssignmentTree("reflective", "0.1", 2));
			modules.put("probeCoreSphere", probeCoreSphere);
	
		/*@PART[mk2Fuselage]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, 1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree mk2Fuselage = new BlockTree("MODULE", 1);
			mk2Fuselage.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			mk2Fuselage.addPart(new AssignmentTree("direction", "0, 0, 1 // underside of fuselage", 2));
			mk2Fuselage.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("mk2Fuselage", mk2Fuselage);
		
		/*@PART[mk2SpacePlaneAdapter]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0.15, 0.9 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree mk2SpacePlaneAdapter = new BlockTree("MODULE", 1);
			mk2SpacePlaneAdapter.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			mk2SpacePlaneAdapter.addPart(new AssignmentTree("direction", "0, 0.15, 0.9 // underside of fuselage", 2));
			mk2SpacePlaneAdapter.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("mk2SpacePlaneAdapter", mk2SpacePlaneAdapter);
		
		/*@PART[mk3Fuselage]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree mk3Fuselage = new BlockTree("MODULE", 1);
			mk3Fuselage.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			mk3Fuselage.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			mk3Fuselage.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("mk3Fuselage", mk3Fuselage);
		
		/*@PART[mk3spacePlaneAdapter]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, 1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree mk3spacePlaneAdapter = new BlockTree("MODULE", 1);
			mk3spacePlaneAdapter.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			mk3spacePlaneAdapter.addPart(new AssignmentTree("direction", "0, 0, 1 // underside of fuselage", 2));
			mk3spacePlaneAdapter.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("mk3spacePlaneAdapter", mk3spacePlaneAdapter);
		
		
		/*@PART[dockingPort1]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, 0 // all directions
				reflective = 0.25 // 25% of heat is ignored when closed
				adjustCollider = 0.25 // the attachNode is kinda funky
			}
	
			MODULE{
			    name = ModuleAnimation2Value
			    animationName = dockingring
			    valueName = maxTemp
			    valueCurve
			    {
			        key = 0 1700 0 0
			        key = 0.1 1500 0 0
			        key = 1 1450 0 0
			    }
			}
	
			MODULE{
			    name = ModuleAnimation2Value
			    animationName = dockingring
			    moduleName = ModuleHeatShield
			    valueName = reflective
			    valueCurve
			    {
			        key = 0 0.25 0 0
			        key = 0.1 0 0 0
			        key = 1 -1.5 0 0 // don't leave the shield open.
			    }
			}
		}*/
		List<IKspPartTree> dockingPort1 = new ArrayList<>();{  //block these variables off so I can reuse the names later
			BlockTree moduleHeatShield = new BlockTree("MODULE", 1);
				moduleHeatShield.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
				moduleHeatShield.addPart(new AssignmentTree("direction", "0, 0, 0 // all directions", 2));
				moduleHeatShield.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored when closed", 2));
				moduleHeatShield.addPart(new AssignmentTree("adjustCollider", "0.25 // the attachNode is kinda funky", 2));
			dockingPort1.add(moduleHeatShield);
			BlockTree moduleAnimation2Value1 = new BlockTree("MODULE", 1);
			moduleAnimation2Value1.addPart(new AssignmentTree("name", "ModuleAnimation2Value", 2));
			moduleAnimation2Value1.addPart(new AssignmentTree("animationName", "dockingring", 2));
			moduleAnimation2Value1.addPart(new AssignmentTree("valueName", "maxTemp", 2));
			BlockTree valueCurve1 = new BlockTree("valueCurve", 2);
				valueCurve1.addPart(new AssignmentTree("key", "0 1700 0 0", 3));
				valueCurve1.addPart(new AssignmentTree("key", "0.1 1500 0 0", 3));
				valueCurve1.addPart(new AssignmentTree("key", "1 1450 0 0", 3));
			moduleAnimation2Value1.addPart(valueCurve1);
		dockingPort1.add(moduleAnimation2Value1);
		BlockTree moduleAnimation2Value2 = new BlockTree("MODULE", 1);
			moduleAnimation2Value2.addPart(new AssignmentTree("name", "ModuleAnimation2Value", 2));
			moduleAnimation2Value2.addPart(new AssignmentTree("animationName", "dockingring", 2));
			moduleAnimation2Value2.addPart(new AssignmentTree("moduleName", "ModuleHeatShield", 2));
			moduleAnimation2Value2.addPart(new AssignmentTree("valueName", "reflective", 2));
			BlockTree valueCurve2 = new BlockTree("valueCurve", 2);
				valueCurve2.addPart(new AssignmentTree("key", "0 0.25 0 0", 3));
				valueCurve2.addPart(new AssignmentTree("key", "0.1 0 0 0", 3));
				valueCurve2.addPart(new AssignmentTree("key", "1 -1.5 0 0 // don't leave the shield open.", 3));
			moduleAnimation2Value2.addPart(valueCurve2);
		dockingPort1.add(moduleAnimation2Value2);}
		modules.put("dockingPort1", dockingPort1);
		
			
			
		/*@PART[dockingPortLateral]{
			MODULE{
				name = ModuleHeatShield
				direction = 0, 0, 0 // all directions
				reflective = 0.15 // 15% of heat is ignored when closed
			}
			MODULE{
			    name = ModuleAnimation2Value
			    animationName = dockingporthull
			    valueName = maxTemp
			    valueCurve
			    {
			        key = 0 1700 0 0
			        key = 0.1 1500 0 0
			        key = 1 1450 0 0
			    }
			}
			MODULE{
			    name = ModuleAnimation2Value
			    animationName = dockingporthull
			    moduleName = ModuleHeatShield
			    valueName = reflective
			    valueCurve
			    {
			        key = 0 0.15 0 0
			        key = 0.1 0 0 0
			        key = 1 -.25 0 0
			    }
			}
		}*/
		List<IKspPartTree> dockingPortLateral = new ArrayList<>();{  //block these variables off so I can reuse the names later
			BlockTree moduleHeatShield = new BlockTree("MODULE", 1);
				moduleHeatShield.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
				moduleHeatShield.addPart(new AssignmentTree("direction", "0, 0, 0 // all directions", 2));
				moduleHeatShield.addPart(new AssignmentTree("reflective", "0.15 // 15% of heat is ignored when closed", 2));
			dockingPortLateral.add(moduleHeatShield);
			BlockTree moduleAnimation2Value1 = new BlockTree("MODULE", 1);
			moduleAnimation2Value1.addPart(new AssignmentTree("name", "ModuleAnimation2Value", 2));
			moduleAnimation2Value1.addPart(new AssignmentTree("animationName", "dockingporthull", 2));
			moduleAnimation2Value1.addPart(new AssignmentTree("valueName", "maxTemp", 2));
			BlockTree valueCurve1 = new BlockTree("valueCurve", 2);
				valueCurve1.addPart(new AssignmentTree("key", "0 1700 0 0", 3));
				valueCurve1.addPart(new AssignmentTree("key", "0.1 1500 0 0", 3));
				valueCurve1.addPart(new AssignmentTree("key", "1 1450 0 0", 3));
			moduleAnimation2Value1.addPart(valueCurve1);
		dockingPortLateral.add(moduleAnimation2Value1);
		BlockTree moduleAnimation2Value2 = new BlockTree("MODULE", 1);
			moduleAnimation2Value2.addPart(new AssignmentTree("name", "ModuleAnimation2Value", 2));
			moduleAnimation2Value2.addPart(new AssignmentTree("animationName", "dockingporthull", 2));
			moduleAnimation2Value2.addPart(new AssignmentTree("moduleName", "ModuleHeatShield", 2));
			moduleAnimation2Value2.addPart(new AssignmentTree("valueName", "reflective", 2));
			BlockTree valueCurve2 = new BlockTree("valueCurve", 2);
				valueCurve2.addPart(new AssignmentTree("key", "0 0.15 0 0", 3));
				valueCurve2.addPart(new AssignmentTree("key", "0.1 0 0 0", 3));
				valueCurve2.addPart(new AssignmentTree("key", "1 -.25 0 0", 3));
			moduleAnimation2Value2.addPart(valueCurve2);
		dockingPortLateral.add(moduleAnimation2Value2);}
		modules.put("dockingPortLateral", dockingPortLateral);
		
		return modules;		
	}
}
