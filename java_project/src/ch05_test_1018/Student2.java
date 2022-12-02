package ch05_test_1018;

public class Student2 {
	//클래스 가본적인 멤버 변수를 선언만 했음.
	//기본형을 제외하고는 참조형 변수 예) student2, string
	String studentName; //이름
	int studentNumber; //학번
	String email; //메일
	String location; //사는곳
	
	public void studentGetInfo() {
		System.out.println("이름은"+studentName);
	}


	public void sum(int num1, int num2 ) { //void -> 리턴의 결과값이 없다.
		System.out.println(num1 + num2);
	
	}
	
	public static int sum2 (int num1, int num2 ) {
		System.out.println("sum 함수를 호출한 결괏값 출력: "+num1 + num2);
		return num1+num2;//결괏값의 반환 타입이 int임을 나타냄.
		//해당 매서드 선언부에서 확인이 가능함.
	}
	
	public static void sum3(int num1, int num2) {
		System.out.println("sum 함수를 호출한 결괏값 출력"+num1+num2);
	}
	
	public static void main(String[] args) {  //void 리턴의 결괏값이 없다.
		Student2 Pjy = new Student2(); //Pjy 객체 생성
		Student2 Pjy2 = new Student2(); //pjy2 객체 생성
		Pjy.studentName = "박지영1";
		Pjy2.studentName = "박지영2";
		Pjy.sum(10,20);
		Pjy.studentGetInfo();
		Pjy2.studentGetInfo();
		//student2: 클래스이름
		//pjy: 참조형 변수 이름
		//new: 키워드를 통해서 해당 객체를 생성
		//student2(): 매개변수가 없는 기본 생성자라고 함
		//역할은 기본값을 초기화하는 역할
		
		//해당 객체를 통해서 함수를 호출.
		Pjy.sum (10,20);
		
		//지금은 객체 없이 해당 클래스 명으로 함수를 호출.
		int result = Student2.sum2(10,20);
		//두번째 sum2함수 (매서드) 호출하는 부분.
	}
	
}
