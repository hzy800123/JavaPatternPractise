package PlaneImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Plane.Plane;
import TakeoffImp.LongDistanceTakeOff;

public class AirPlane extends Plane {
	
	// Setup as '�����ٷ���'
	public AirPlane() {
		flyStrategy = new SubSonicFly();
		takeoffStrategy = new LongDistanceTakeOff();
	}
	
	@Override
	public void display() {
		// System.out.println("This is �ͻ�(AirPlane) !");
		Logger logger = LogManager.getLogger(AirPlane.class);
		logger.info("This is �ͻ�(AirPlane) !");
	}

}
