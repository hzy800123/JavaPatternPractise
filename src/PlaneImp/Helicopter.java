package PlaneImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Plane.Plane;
import TakeoffImp.VerticalTakeOff;

public class Helicopter extends Plane {

	// Setup as '亚音速飞行'
	public Helicopter() {
		flyStrategy = new SubSonicFly();
		takeoffStrategy = new VerticalTakeOff();
	}
	
	@Override
	public void display() {
		// System.out.println("This is 直升机(Helicopter) !");
		Logger logger = LogManager.getLogger(Helicopter.class);
		logger.info("This is 直升机(Helicopter) !");
	}
}
