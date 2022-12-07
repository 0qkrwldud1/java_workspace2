package ch07_arraylist_1020;


public class StudentTest {

	public static void main(String[] args) {
		
		//본인이름을 스튜던트형으로 객체생성 숫자는 임의지정.
		//수강하고 싶은 과목3개 등록.
		//해당 정보 출력. 
		
		Student pjy = new Student(1004, "pjy");
		
		pjy.addSubject("자바", 100);
		pjy.addSubject("자바스크립트", 50);
		pjy.addSubject("영어", 50);
		
		//런치메뉴 어레이리스트만들어서 스튜던트 클래스에 추가
		//참고는 서브젝트 참고.
		pjy.addMenu("밥", 4000, "점심");
		
		pjy.showStudentInfo();
		
		
		//이름-> 아이디, 과목, 배열
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		//본인 이름으로 과목 추가해서 , 출력해보기. 시간 3분.
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		Student studentLsy = new Student(1003, "이상용");
		
		//본인 이름으로 과목 추가해서 , 출력해보기. 시간 3분.
		studentLsy.addSubject("국어", 70);
		studentLsy.addSubject("수학", 85);
		studentLsy.addSubject("영어", 100);
		
//		studentLee.showStudentInfo();
//		System.out.println("======================================");
//		studentKim.showStudentInfo();
//		
		System.out.println("======================================");
		studentLsy.showStudentInfo();
		
		
	}
}
