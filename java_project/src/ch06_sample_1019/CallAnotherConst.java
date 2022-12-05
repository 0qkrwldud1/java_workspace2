package ch06_sample_1019;

import ch05_test_1205.person;

class Person{
	String name;
	int age;
	
	//반화하는 형이 문자형
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//반환하는 형이 기본형(정수형)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	Person(){
		this("이름없음", 1);  // Person(String, int) 생성자 호출
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//정체가 메서드, 반환하는 형이 클래스 형 -> person
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.getName());
		System.out.println(noName.getAge());
		
		//변수를 선언하는데 형이 참조형, person이라는 형에 p는 참조형 변수.
		//ctrl누른 상태에서 해당 메서드명을 클릭하면 메서드가 정의된 곳으로 간다.
		//메서드명 앞에 반환타입이 this -> 자기자신의 객체, 주소값
		//noname은 결과값의 형은 person형, 선언도 person형으로 해야함.
		//returnItSelf()는 같은 타입의 형으로 받아야함.
		Person p = noName.returnItSelf();
		
		//만약, 해당 형이 아닌 다른 형으로 받는 방법은 없을까?
		// 있음. 가장 큰 형인 최상위 클래스라고 함. Object 
		// Object 로 받을수 있고, 원래의 형으로 되돌릴수도 있습니다. 
		// 형변을 통해서.
		Object p3 = noName.returnItSelf();
		Person p4 = (Person)p3;
		
		System.out.println("p 출력");
		System.out.println(p);
		System.out.println("p3 출력");
		System.out.println(p3);
		System.out.println("p4 출력");
		System.out.println(p4);
		System.out.println(noName);
		
	}
}
