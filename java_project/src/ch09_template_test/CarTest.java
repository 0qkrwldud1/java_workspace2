package ch09_template_test;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		
//		Sonata sonata = new Sonata();
//		sonata.run();
		CarTest cartest = new CarTest();
		cartest.runCar(Sonata);
		
//		
//		ArrayList<Car> carList = new ArrayList<Car>();
//		
//		carList.add(new Sonata());
//		carList.add(new Grandeur());
//		carList.add(new Avante());
//		carList.add(new Genesis());
//		
//		carList.
//		
//		for(Car car : carList) {
//			car.run();
//			System.out.println("======================");
//		}
	}
	
	public void runCar(Car car) {
		car.run();
	}
}
