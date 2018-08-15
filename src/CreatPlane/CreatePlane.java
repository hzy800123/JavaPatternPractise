package CreatPlane;

import FlyImp.SubSonicFly;
import FlyImp.SuperSonicFly;
import Plane.Plane;
import PlaneImp.AirPlane;
import PlaneImp.Fighter;
import PlaneImp.Harrier;
import PlaneImp.Helicopter;
import Strategy.FlyStrategy;
import TakeoffImp.LongDistanceTakeOff;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CreatePlane {
	
	public static void main(String[] args) {
		
		Logger logger = LogManager.getLogger(CreatePlane.class);
		
		logger.info("Testing log4j logger...");
		
		Plane helicopter = new Helicopter();
		helicopter.display();
		// 起飞
		helicopter.performTakeoff();
		// 飞行
		helicopter.performFly();
		helicopter.setFlyStrategy(new SuperSonicFly());
		helicopter.performFly();
		System.out.println("--------------------------------------");
		
		Plane airPlane = new AirPlane();
		airPlane.display();
		// 起飞
		airPlane.performTakeoff();
		// 飞行
		airPlane.performFly();
		FlyStrategy newFlyStrategy = new SuperSonicFly();
		airPlane.setFlyStrategy(newFlyStrategy);
		// 飞行
		airPlane.performFly();
		System.out.println("--------------------------------------");
		
		Plane fighter = new Fighter();
		fighter.display();
		// 起飞
		fighter.performTakeoff();
		// 飞行
		fighter.performFly();
		fighter.setFlyStrategy(new SuperSonicFly());
		// 飞行
		fighter.performFly();
		System.out.println("--------------------------------------");
		
		Plane harrier = new Harrier();
		harrier.display();
		// 起飞
		harrier.performTakeoff();
		harrier.setTakeoffStrategy(new LongDistanceTakeOff());
		// 起飞				
		harrier.performTakeoff();
		// 飞行
		harrier.performFly();
		harrier.setFlyStrategy(new SubSonicFly());
		// 飞行
		harrier.performFly();
		System.out.println("--------------------------------------");
		
	}
}
