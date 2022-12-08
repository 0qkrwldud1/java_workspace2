package ch10_interfaceex_1021;

import java.security.PublicKey;

public class CalculatorTest {
	
	public void testInterfaceMethod(Calc calc) {
		//메서드에 올수 있는 매개변수 형은 무엇인가요?
		//calc을 포함한 calc인터페이스를 구현한 하위 클래스 모두가 올 수 있다.
		//APIE
	}

	public static void main(String[] args) {
		

		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		
		//다형성 -> 해당 구현한 인터페이스형으로 받을 수 있다.
		//안터페이스 = 부모클래스와 같은 역할.
		//하위클래스 전부다 인터페이스로 담을 수 있다. 
		
		Calc newCalc = calc; 
		Calculator calculator = calc;
		Calculator calc2 = calc;
		
		Test t1 = new Test();
		Calc calc3 = t1;
		Test t2 = (Test)calc3;
		
		
		calc.description();   //디폴트 메소드 호출
				
	    int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));  //정적 메소드 사용하기

	}
}
