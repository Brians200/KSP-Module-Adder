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
		
		
		/**************************Tiberion Shuttles*******************************************/
		/*@PART[TD_ShuttleCockpit]
		{
			MODULE
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		
		BlockTree tdShuttleCockpit = new BlockTree("MODULE", 1);
			tdShuttleCockpit.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleCockpit.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleCockpit.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleCockpit", tdShuttleCockpit);
		
		/*@PART[TD_ShuttleNoseUnit]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleNoseUnit = new BlockTree("MODULE", 1);
			tdShuttleNoseUnit.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleNoseUnit.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleNoseUnit.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleNoseUnit", tdShuttleNoseUnit);
			
		/*@PART[TD_ShuttleNoseUnitMJ]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleNoseUnitMJ = new BlockTree("MODULE", 1);
			tdShuttleNoseUnitMJ.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleNoseUnitMJ.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleNoseUnitMJ.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleNoseUnitMJ", tdShuttleNoseUnitMJ);
			
		/*	
		@PART[TD_ShuttleUnitSmall]
		{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleUnitSmall = new BlockTree("MODULE", 1);
			tdShuttleUnitSmall.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleUnitSmall.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleUnitSmall.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleUnitSmall", tdShuttleUnitSmall);
			
		/*@PART[TD_ShuttleUnitSmallMJ]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleUnitSmallMJ = new BlockTree("MODULE", 1);
			tdShuttleUnitSmallMJ.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleUnitSmallMJ.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleUnitSmallMJ.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleUnitSmallMJ", tdShuttleUnitSmallMJ);
		
		/*@PART[TD_ShuttleGearDown]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleGearDown = new BlockTree("MODULE", 1);
			tdShuttleGearDown.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleGearDown.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleGearDown.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleGearDown", tdShuttleGearDown);
		
		/*@PART[TD_ShuttleGearDownLarge]
		{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleGearDownLarge = new BlockTree("MODULE", 1);
			tdShuttleGearDownLarge.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleGearDownLarge.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleGearDownLarge.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleGearDownLarge", tdShuttleGearDownLarge);
		
		/*@PART[TD_ShuttleGearUp]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleGearUp = new BlockTree("MODULE", 1);
			tdShuttleGearUp.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleGearUp.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleGearUp.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleGearUp", tdShuttleGearUp);
		
		/*@PART[TD_ShuttleGearUpLarge]
		{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleGearUpLarge = new BlockTree("MODULE", 1);
			tdShuttleGearUpLarge.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleGearUpLarge.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleGearUpLarge.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleGearUpLarge", tdShuttleGearUpLarge);
		
		/*@PART[TD_BuranEngMount]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdBuranEngMount = new BlockTree("MODULE", 1);
			tdBuranEngMount.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdBuranEngMount.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdBuranEngMount.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_BuranEngMount", tdBuranEngMount);
		
		/*@PART[TD_ShuttleCargoBay]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleCargoBay = new BlockTree("MODULE", 1);
			tdShuttleCargoBay.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleCargoBay.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleCargoBay.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleCargoBay", tdShuttleCargoBay);
		
		/*@PART[TD_EngMountRadial]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdEngMountRadial = new BlockTree("MODULE", 1);
			tdEngMountRadial.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdEngMountRadial.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdEngMountRadial.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_EngMountRadial", tdEngMountRadial);
		
		/*@PART[TD_EngMountRadialLong]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdEngMountRadialLong = new BlockTree("MODULE", 1);
			tdEngMountRadialLong.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdEngMountRadialLong.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdEngMountRadialLong.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_EngMountRadialLong", tdEngMountRadialLong);
		
		/*@PART[TD_HeavyStrut]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdHeavyStrut = new BlockTree("MODULE", 1);
			tdHeavyStrut.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdHeavyStrut.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdHeavyStrut.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_HeavyStrut", tdHeavyStrut);
		
		/*@Part[TD_ShuttleResourceFull]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleResourceFull = new BlockTree("MODULE", 1);
			tdShuttleResourceFull.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleResourceFull.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleResourceFull.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleResourceFull", tdShuttleResourceFull);
		
		/*@PART[TD_ShuttleResourceHalf]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleResourceHalf = new BlockTree("MODULE", 1);
			tdShuttleResourceHalf.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleResourceHalf.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleResourceHalf.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleResourceHalf", tdShuttleResourceHalf);
		
		/*@PART[TD_ShuttleTankRCS]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleTankRCS = new BlockTree("MODULE", 1);
			tdShuttleTankRCS.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleTankRCS.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleTankRCS.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleTankRCS", tdShuttleTankRCS);
		
		/*@PART[TD_ShuttleElevBigLeft]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleElevBigLeft = new BlockTree("MODULE", 1);
			tdShuttleElevBigLeft.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleElevBigLeft.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleElevBigLeft.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleElevBigLeft", tdShuttleElevBigLeft);
		
		/*@PART[TD_ShuttleElevBigRight]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleElevBigRight = new BlockTree("MODULE", 1);
			tdShuttleElevBigRight.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleElevBigRight.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleElevBigRight.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleElevBigRight", tdShuttleElevBigRight);
		
		/*@PART[TD_ShuttleElevTankLeft]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleElevTankLeft = new BlockTree("MODULE", 1);
			tdShuttleElevTankLeft.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleElevTankLeft.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleElevTankLeft.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleElevTankLeft", tdShuttleElevTankLeft);
		
		/*@PART[TD_ShuttleElevTankRight]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleElevTankRight = new BlockTree("MODULE", 1);
			tdShuttleElevTankRight.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleElevTankRight.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleElevTankRight.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleElevTankRight", tdShuttleElevTankRight);
		
		/*@PART[TD_ShuttleTailFin]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleTailFin = new BlockTree("MODULE", 1);
			tdShuttleTailFin.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleTailFin.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleTailFin.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleTailFin", tdShuttleTailFin);
		
		/*@PART[TD_ShuttleWingBigCanard]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleWingBigCanard = new BlockTree("MODULE", 1);
			tdShuttleWingBigCanard.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleWingBigCanard.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleWingBigCanard.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleWingBigCanard", tdShuttleWingBigCanard);
		
		/*@PART[TD_ShuttleWingBigLeft]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleWingBigLeft = new BlockTree("MODULE", 1);
			tdShuttleWingBigLeft.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleWingBigLeft.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleWingBigLeft.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleWingBigLeft", tdShuttleWingBigLeft);
		
		/*@PART[TD_ShuttleWingBigRight]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleWingBigRight = new BlockTree("MODULE", 1);
			tdShuttleWingBigRight.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleWingBigRight.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleWingBigRight.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleWingBigRight", tdShuttleWingBigRight);
		
		/*@PART[TD_ShuttleWingTankCanard]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleWingTankCanard = new BlockTree("MODULE", 1);
			tdShuttleWingTankCanard.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleWingTankCanard.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleWingTankCanard.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleWingTankCanard", tdShuttleWingTankCanard);
		
		/*@PART[TD_ShuttleWingTankLeft]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleWingTankLeft = new BlockTree("MODULE", 1);
			tdShuttleWingTankLeft.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleWingTankLeft.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleWingTankLeft.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleWingTankLeft", tdShuttleWingTankLeft);
		
		/*@PART[TD_ShuttleWingTankRight]{
			Module
			{
				name = ModuleHeatShield
				direction = 0, 0, -1 // underside of fuselage
				reflective = 0.25 // 25% of heat is ignored at correct angle
			}
		}*/
		BlockTree tdShuttleWingTankRight = new BlockTree("MODULE", 1);
			tdShuttleWingTankRight.addPart(new AssignmentTree("name", "ModuleHeatShield", 2));
			tdShuttleWingTankRight.addPart(new AssignmentTree("direction", "0, 0, -1 // underside of fuselage", 2));
			tdShuttleWingTankRight.addPart(new AssignmentTree("reflective", "0.25 // 25% of heat is ignored at correct angle", 2));
			modules.put("TD_ShuttleWingTankRight", tdShuttleWingTankRight);
		
		
		return modules;		
	}
}
