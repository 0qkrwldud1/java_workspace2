package ch10_interfaceex_1021;

public class MyClass implements MyInterface{ //1타3피 3개의 형으로 사용가능 -> 다형성.

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");		
	}

}
