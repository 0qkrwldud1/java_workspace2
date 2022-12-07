package ch06_staticex_1019;

import ch05_test.Person;

public class Student {
	
	//static -> 전역변수 = 정적변수 = resource, 객체 생성x
	public static int serialNum = 1000;
	//non static -> 객체를 생성해서 접근 -> 인스턴스 변수.
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//해당 메서드의 리턴타입이 문자타입 -> 활용할 때도 문자형으로 사용.
	//ex) student pjy = new student;
	//    string s1 = pjy.getStudentName(); 
	//->해당 메서드의 반환값이 스트링이므로 변수를 선언할때 스트링 타입으로 선언.							
	public String getStudentName(){
		return studentName;
	}
	
	//예를들어
	public Person getPersonInfo() {
		return new Person();
	}
	//이라는 메서드를 만들었을때
	//Person p1 = getPersonInfo(); 이 경우와
	//person p2 = new Person(); 이 경우
	//참조형 변수를 만든다는 결과는 같다.
	
	public void setStudentName(String name){
		studentName = name;
	}//studentName앞에 .this를 붙이는게 더 정확하다.

	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
