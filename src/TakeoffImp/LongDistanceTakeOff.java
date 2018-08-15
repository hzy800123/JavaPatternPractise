package TakeoffImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Strategy.TakeoffStrategy;

public class LongDistanceTakeOff implements TakeoffStrategy {

	@Override
	public void performTakeoff() {
		// System.out.println("���������(LongDistanceTakeOff)");
		Logger logger = LogManager.getLogger(LongDistanceTakeOff.class);
		logger.info("���������(LongDistanceTakeOff)");
	}

}
