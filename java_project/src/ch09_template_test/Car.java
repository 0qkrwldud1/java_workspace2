package ch09_template_test;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void startCar();
	public abstract void turnOff();
	
	
	final public void run()
	{
		startCar();
		drive();
		stop();
		turnOff();
	}
}