package ch05_test_1018;

public class AniTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를 생성.
		//클래스명 참조형_변수 = new 클래스의 기본 생성자();
		//dog라는 이름의 (참조형) 변수를 선언.
		//객체를 생성했음.
		Animal dog = new Animal();
		//강아지의 이름, 나이 설정.
		dog.name = "강아지 ";
		dog.age =1;
		//기본 메서드 하나 출력.
		dog.ShowInfo();
		System.out.println("dog의 주소값");
		System.out.println(dog);
		
		//고양이 객체 생성.
		Animal cat = new Animal();
		cat.name = "고양이 ";
		cat.age = 2;
		cat.ShowInfo();
		System.out.println("cat의 주소값");
		System.out.println(cat);
	}

}

