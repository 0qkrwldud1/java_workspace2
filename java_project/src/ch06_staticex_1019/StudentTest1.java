package ch06_staticex_1019;

public class StudentTest1 {

	public static void main(String[] args) {
		
		//학번
		Student1 pjy3Student = new Student1();
		System.out.println("pjy3Student의 학번: " + pjy3Student.serialNum);
		
		Student1 pjy4Student = new Student1();
		System.out.println("pjy4Student의 학번: " + pjy4Student.serialNum);
		
		Student1 pjy5Student = new Student1();
		System.out.println("pjy5Student의 학번: " + pjy5Student.serialNum);
		
		
		
		//인스탄스 또는 해당 클래스명으로 접근할 수 있다.
		Student pjyStudent = new Student();
		pjyStudent.setStudentName("박지영"); 
		System.out.println(pjyStudent.serialNum);
		System.out.println(Student.serialNum);
		pjyStudent.serialNum++;
		
		Student pjy2Student = new Student();
		

		
		
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

