package ch06_staticex_1019;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student2 pjy6Student = new Student2();
		System.out.println(Student2.getSerialNum());
		Student2.setSerialNum(2000);
		System.out.println(Student2.getSerialNum());
		
		
		
		
		//student1 클래스로 객체를 생성해서, 자동으로 학번이 어떻게 부여되는지 확인.
		Student1 pjy3Student = new Student1();
		System.out.println("pjy3Student의 학번: " + pjy3Student.studentID);
		
		Student1 pjy4Student = new Student1();
		System.out.println("pjy4Student의 학번: " + pjy4Student.studentID);
		
		Student1 pjy5Student = new Student1();
		System.out.println("pjy5Student의 학번: " + pjy5Student.studentID);
		
		
		
		//인스턴스 또는 해당 클래스명으로 접근할 수 있다.
		Student pjyStudent = new Student();
		pjyStudent.setStudentName("박지영"); 
		System.out.println(pjyStudent.serialNum); //객체로 접근
		System.out.println(Student.serialNum);    //클래스명으로 접근. 이 방법이 주로사용됨.
		pjyStudent.serialNum++; //학번을 1씩 올린다.
		System.out.println(pjyStudent.serialNum);  //객체로 접근
		System.out.println(Student.serialNum);     //클래스명으로 접근. 이 방법이 주로사용됨.
		
		
		System.out.println("pjy2student의 정보");
		Student pjy2Student = new Student();
		System.out.println(pjy2Student.serialNum);
		
		

		
		
//
//		Student studentLee = new Student();
//		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum); // 초깃값 출력
//		studentLee.serialNum++;					// static 변수 증가
//		System.out.println("현재 값 : " + studentLee.serialNum);
//		
//		Student studentSon = new Student();
//		studentSon.setStudentName("손수경");
//		studentSon.serialNum++;	
//		System.out.println("한번더 클래스 변수 값 증가하기. ");
//		System.out.println("studentSon 의 값" + studentSon.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee);
//		System.out.println("studentSon 의 값" + studentSon);
	}
}

