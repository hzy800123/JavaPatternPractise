package PlaneImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import FlyImp.SuperSonicFly;
import Plane.Plane;
import TakeoffImp.VerticalTakeOff;

public class Harrier extends Plane {

	// Setup as '��������'
	public Harrier() {
		flyStrategy = new SuperSonicFly();
		takeoffStrategy = new VerticalTakeOff();
	}	
	
	@Override
	public void display() {
		// System.out.println("This is ��ʽս����(Harrier) !");
		Logger logger = LogManager.getLogger(Harrier.class);
		logger.info("This is ��ʽս����(Harrier) !");
	}

}
