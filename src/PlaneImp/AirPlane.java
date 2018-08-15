package PlaneImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Plane.Plane;
import TakeoffImp.LongDistanceTakeOff;

public class AirPlane extends Plane {
	
	// Setup as '亚音速飞行'
	public AirPlane() {
		flyStrategy = new SubSonicFly();
		takeoffStrategy = new LongDistanceTakeOff();
	}
	
	@Override
	public void display() {
		// System.out.println("This is 客机(AirPlane) !");
		Logger logger = LogManager.getLogger(AirPlane.class);
		logger.info("This is 客机(AirPlane) !");
	}

}
