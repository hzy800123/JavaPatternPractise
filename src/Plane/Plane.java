package Plane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Strategy.FlyStrategy;
import Strategy.TakeoffStrategy;

public abstract class Plane {
	
	// 飞行特征
	protected FlyStrategy flyStrategy;
	
	// 起飞特征
	protected TakeoffStrategy takeoffStrategy;
	
	public Plane() {		
	}
	
	// 飞行
	public void performFly() {
		flyStrategy.performFly();
	}
	
	// 起飞
	public void performTakeoff() {
	 	takeoffStrategy.performTakeoff();
	}
	
	// change the '飞行特征'
	public void setFlyStrategy( FlyStrategy newFlyStrategy ) {
		// System.out.println("change the '飞行特征' !");
		Logger logger = LogManager.getLogger(Plane.class);
		logger.info("change the '飞行特征' !");
		flyStrategy = newFlyStrategy;
	}
	
	// change the '起飞特征'
	public void setTakeoffStrategy( TakeoffStrategy newTakeoffStrategy ) {
		// System.out.println("change the '起飞特征' !");
		Logger logger = LogManager.getLogger(Plane.class);
		logger.info("change the '起飞特征' !");
		takeoffStrategy = newTakeoffStrategy;
	}
	
	public abstract void display();
}
