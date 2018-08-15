package FlyImp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Strategy.FlyStrategy;

public class SuperSonicFly implements FlyStrategy {

	@Override
	public void performFly() {
		// System.out.println("�����ٷ���(SuperSonicFly)");
		Logger logger = LogManager.getLogger(SuperSonicFly.class);
		logger.info("�����ٷ���(SuperSonicFly)");
	}

}
