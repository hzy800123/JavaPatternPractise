package Plane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FlyImp.SubSonicFly;
import Strategy.FlyStrategy;
import Strategy.TakeoffStrategy;

public abstract class Plane {
	
	// ��������
	protected FlyStrategy flyStrategy;
	
	// �������
	protected TakeoffStrategy takeoffStrategy;
	
	public Plane() {		
	}
	
	// ����
	public void performFly() {
		flyStrategy.performFly();
	}
	
	// ���
	public void performTakeoff() {
	 	takeoffStrategy.performTakeoff();
	}
	
	// change the '��������'
	public void setFlyStrategy( FlyStrategy newFlyStrategy ) {
		// System.out.println("change the '��������' !");
		Logger logger = LogManager.getLogger(Plane.class);
		logger.info("change the '��������' !");
		flyStrategy = newFlyStrategy;
	}
	
	// change the '�������'
	public void setTakeoffStrategy( TakeoffStrategy newTakeoffStrategy ) {
		// System.out.println("change the '�������' !");
		Logger logger = LogManager.getLogger(Plane.class);
		logger.info("change the '�������' !");
		takeoffStrategy = newTakeoffStrategy;
	}
	
	public abstract void display();
}
