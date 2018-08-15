package PlaneImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Plane.Plane;
import TakeoffImp.VerticalTakeOff;

public class Helicopter extends Plane {

	// Setup as '�����ٷ���'
	public Helicopter() {
		flyStrategy = new SubSonicFly();
		takeoffStrategy = new VerticalTakeOff();
	}
	
	@Override
	public void display() {
		// System.out.println("This is ֱ����(Helicopter) !");
		Logger logger = LogManager.getLogger(Helicopter.class);
		logger.info("This is ֱ����(Helicopter) !");
	}
}
