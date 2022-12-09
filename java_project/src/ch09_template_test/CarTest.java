package ch09_template_test;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {	
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run();
			System.out.println("======================");
		}
	}
	
	public void runCar(Car car) {
		car.run();
	}
}
