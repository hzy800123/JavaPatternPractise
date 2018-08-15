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
		// ���
		helicopter.performTakeoff();
		// ����
		helicopter.performFly();
		helicopter.setFlyStrategy(new SuperSonicFly());
		helicopter.performFly();
		System.out.println("--------------------------------------");
		
		Plane airPlane = new AirPlane();
		airPlane.display();
		// ���
		airPlane.performTakeoff();
		// ����
		airPlane.performFly();
		FlyStrategy newFlyStrategy = new SuperSonicFly();
		airPlane.setFlyStrategy(newFlyStrategy);
		// ����
		airPlane.performFly();
		System.out.println("--------------------------------------");
		
		Plane fighter = new Fighter();
		fighter.display();
		// ���
		fighter.performTakeoff();
		// ����
		fighter.performFly();
		fighter.setFlyStrategy(new SuperSonicFly());
		// ����
		fighter.performFly();
		System.out.println("--------------------------------------");
		
		Plane harrier = new Harrier();
		harrier.display();
		// ���
		harrier.performTakeoff();
		harrier.setTakeoffStrategy(new LongDistanceTakeOff());
		// ���				
		harrier.performTakeoff();
		// ����
		harrier.performFly();
		harrier.setFlyStrategy(new SubSonicFly());
		// ����
		harrier.performFly();
		System.out.println("--------------------------------------");
		
	}
}
