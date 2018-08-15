package TakeoffImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Strategy.TakeoffStrategy;

public class VerticalTakeOff implements TakeoffStrategy {

	@Override
	public void performTakeoff() {
		// System.out.println("��ֱ���(VerticalTakeOff)");
		Logger logger = LogManager.getLogger(VerticalTakeOff.class);
		logger.info("��ֱ���(VerticalTakeOff)");
	}

}
