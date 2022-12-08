package ch09_template_test;

import ch09_template_1021.Car;

public class Sonata extends Car {
	
	@Override
	public void startCar() {
		System.out.println("Sonata 시동을 켭니다.");
	}
	
	@Override
	public void drive() {
		System.out.println("Sonata 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");		
	}
	
	@Override
	public void turnOff() {
		System.out.println("Sonata 시동을 끕니다.");		
	}
}
