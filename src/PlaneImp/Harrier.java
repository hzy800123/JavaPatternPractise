package PlaneImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import FlyImp.SuperSonicFly;
import Plane.Plane;
import TakeoffImp.VerticalTakeOff;

public class Harrier extends Plane {

	// Setup as '飞行特征'
	public Harrier() {
		flyStrategy = new SuperSonicFly();
		takeoffStrategy = new VerticalTakeOff();
	}	
	
	@Override
	public void display() {
		// System.out.println("This is 鹞式战斗机(Harrier) !");
		Logger logger = LogManager.getLogger(Harrier.class);
		logger.info("This is 鹞式战斗机(Harrier) !");
	}

}
