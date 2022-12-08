package ch09_abstractex_1020;

public abstract class Computer { // abstract : 추상클래스입니다.

	public abstract void display(); // abstract : 추상메서드입니다. -> {} 몸체가 없다.
	public abstract void typing();  // 추상메서드입니다. 클래스안에 하나라도 있다면 abstract class 넣어줘야한다.
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}
