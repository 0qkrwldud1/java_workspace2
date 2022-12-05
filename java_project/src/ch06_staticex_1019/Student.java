package ch06_staticex_1019;

public class Student {
	
	//static -> 전역변수, resource, 객체 생성x
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//none static, instance 객체 생성
	//해당 메서드의 리턴타입이 문자형 -> 사용할 때도 문자형으로 사용.
	//ex) student pjy = new student;
	// string s1 = pjy.getStudentName(); 
	//이렇게 사용.
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
