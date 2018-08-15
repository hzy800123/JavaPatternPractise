package FlyImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Strategy.FlyStrategy;

public class SubSonicFly implements FlyStrategy {

	@Override
	public void performFly() {
		// System.out.println("亚音速飞行(SubSonicFly)");
		Logger logger = LogManager.getLogger(SubSonicFly.class);
		logger.info("亚音速飞行(SubSonicFly)");
	}

}
