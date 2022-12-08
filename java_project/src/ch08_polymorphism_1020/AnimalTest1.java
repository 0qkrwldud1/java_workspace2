package ch08_polymorphism_1020;

import java.util.ArrayList;

class Animal{
	//좋아하는 동물 클래스 만들기
	//각 동물들의 공통기능 하나 추가. 소리내는 기능.
	//애니멀과 각 하위 클래스에서 재정의해서 사용.
	//좋아하는 동물 클래스를 무브, 잇, 사운드 실행.
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}
	
	public void eat()
	{
		System.out.println("동물이 먹는다.");
	}
	public void sound()
	{
		System.out.println("동물이 소리낸다.");
	}
	
}

class Human extends Animal{
	public void move()
	{
		System.out.println("사람이 두 발로 걷습니다. ");
	}
	
	public void readBook()
	{
		System.out.println("사람이 책을 읽습니다. ");
	}
	
	public void eat()
	{
		System.out.println("사람이 먹는다.");
	}
	public void sound()
	{
		System.out.println("사람이 말한다.");
	}
}

class Tiger extends Animal{
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
	
	public void hunting() 
	{
		System.out.println("호랑이가 사냥을 합니다. ");
	}
	
	public void eat()
	{
		System.out.println("고기를 먹는다.");
	}
	public void sound()
	{
		System.out.println("호랑이 울음소리");
	}
}

class Eagle extends Animal{
	public void move()
	{
		System.out.println("독수리가 하늘을 납니다 ");
	}
	
	public void flying() 
	{
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
	public void eat()
	{
		System.out.println("독수리가 먹는다.");
	}
	public void sound()
	{
		System.out.println("독수리 울음소리");
	}
	
}

class Lsy extends Animal{
	public void move()
	{
		System.out.println("이상용 걸어감.");
	}
	
	public void read() 
	{
		System.out.println("이상용 책 봄.");
	}
	public void eat()
	{
		System.out.println("상용이 밥 먹는다.");
	}
	public void sound()
	{
		System.out.println("말한다.");
	}
}

class Cat extends Animal{
	public void move()
	{
		System.out.println("고양이가 걸어감.");
	}
	
	public void play() 
	{
		System.out.println("고양이가 놀고있다.");
	}
	public void eat()
	{
		System.out.println("사료를 먹는다.");
	}
	public void sound()
	{
		System.out.println("야옹");
	}
}

public class AnimalTest1 {
	//상속이라는 개념이 
	// 재사용성, 중복제거. 
	// 다형성 -> 재할당을 할 때 , 받을 수 있는 매개변수의 범위를 넓히자. 
	// 한계 , 상속이 한번만, 그러면, 기능을 다르게 매번 구현을 할려면, 
	// 자식 클래스에서 구현 하고 싶은 기능이 다양함, 하지만, 반드시 이기능은 꼭 써주세요 라는 부분이 있더라. 
	// 강제성이 필요할 때가 있음. 
	// 해당 기능을 각 자식 클래스에서 다르게 구현을 유연하게 하기 위해서 -> 인터페이스, 추상클래스. 
	
	 public static void main(String[] args) {
		 Cat cat1 = new Cat();
		 cat1.play(); //다형성을 이용하지 않고 객체를 만들어서 출력.
		 
		  AnimalTest1 aTest = new AnimalTest1();//aniaml에서 객체를 만들어서 하위클래스를 바로사용.
		  Human h1 = new Human();
		  aTest.moveAnimal(h1);			//1번
		  aTest.moveAnimal(new Human());//2번
		  								//1번과 2번은 같은 결과가 출력된다.
		  aTest.moveAnimal(new Tiger());
		  aTest.moveAnimal(new Eagle());
		  aTest.moveAnimal(new Lsy());	
		  aTest.moveAnimal(new Animal());
		  aTest.eatFood(new Lsy());
		  aTest.eatFood(new Tiger());
		  aTest.animalSound(new Cat());
		  aTest.animalSound(new Human());
	 }
	 										 
	 											
	 public void moveAnimal(Animal animal) { 	//animal타입으로 선언.->human, tiger, eagle 다 들어올수 있음.
		 										//매개 변수의 자료형이 상위 클래스
		  animal.move();                     	//재정의 된 메서드 호출
	 }   
	 
	 public void eatFood(Animal animal) {
		 animal.eat();							
	}
	 
	 public void animalSound(Animal animal) {
		 animal.sound();							
	}
}



