package ch06_cooperation_1019;

class Person{
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	//매개변수가 2개인 생성자에서 값을 가져오는데 접근지정자로 가져오는 경우. 보안문제가 없음.

	Person(){
		this("이름없음", 1);  // 첫번째로 호출 -> this 자기자신에 매개변수가 2개있음.
							// 매개변수가 2개인 생성자로 이동.
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	} 	//메서드, 반환하는 형이 클래스형
		//void가 아닌 참조형을 사용.]
		//리턴값도 같은 형(타입)으로만 받을 수 있다.
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.getName());
		System.out.println(noName.getAge());
		
		//변수를 선언하는데 형이 참조형
		//p는 참조형 변수.
		//noName이란 참조변수가 도트연산자를 이용해 메서드를 사용하는데
		//메서의 반환 값이 person형 이기 때문에 받을 변수 형또한 person으로 받는다.
		Person p = noName.returnItSelf();
		
		//person형이 아닌 다른 형으로 받는 경우.
		//최상위 클래스인 오브젝트로 받은 후
		//형변환을 통해 다시 person으로 값을 받는다.
		Object p2 = noName.returnItSelf();
		Person p4 = (Person)p2;
		
		System.out.println(p);
		System.out.println(noName);
	}
}
