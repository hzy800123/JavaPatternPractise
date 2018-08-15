package TakeoffImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Strategy.TakeoffStrategy;

public class VerticalTakeOff implements TakeoffStrategy {

	@Override
	public void performTakeoff() {
		// System.out.println("垂直起飞(VerticalTakeOff)");
		Logger logger = LogManager.getLogger(VerticalTakeOff.class);
		logger.info("垂直起飞(VerticalTakeOff)");
	}

}
