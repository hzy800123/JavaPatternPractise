package PlaneImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import FlyImp.SuperSonicFly;
import Plane.Plane;
import TakeoffImp.LongDistanceTakeOff;

public class Fighter extends Plane {

	// Setup as '³¬ÒôËÙ·ÉÐÐ'
	public Fighter() {
		flyStrategy = new SuperSonicFly();
		takeoffStrategy = new LongDistanceTakeOff();
	}
	
	@Override
	public void display() {
		// System.out.println("This is ¼ß»÷»ú(Fighter) !");
		Logger logger = LogManager.getLogger(Fighter.class);
		logger.info("This is ¼ß»÷»ú(Fighter) !");
	}

}
