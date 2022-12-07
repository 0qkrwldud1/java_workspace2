package ch07_arraylist_1020;

import java.util.ArrayList;

public class Student {
	
	//인스턴스 변수
	int studentID;
	String studentName;
	
	// 제너릭으로 유효성 검사처럼, 데이터 형이 , Subject이라는 형으로만 들어 갈수 있다. 이 ArrayList 의 원소 타입
	// Subject 타입의 참조형 변수(인스턴스)
	ArrayList<Subject> subjectList; //여러개를 담는 그릇 ->어레이보다 업그레이드, 값을 추가하거나 삭제가 가능.
	ArrayList<Menu> LunchMenu;		//<>안에 해당타입만 담을 수 있다 -> 제너릭.
	
		
	public Student(int studentID, String studentName){ //매개변수가 2개인 객체를 생성하게 되면-> 아이디, 이름, 과목을담는 리스트, 메뉴를 담는 리스트로 구성.
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		LunchMenu = new ArrayList<Menu>();
	}
	
	public void addMenu(String name, int price, String description){
		Menu menu = new Menu();
		
		menu.setName(name);
		menu.setPrice(price);
		menu.setDescription(description);
		LunchMenu.add(menu);
	}
	
	public void addSubject(String name, int score){
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	
	public void showStudentInfo()
	{
		int total = 0;
		
		for(Subject s : subjectList){
			
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + 
			        s.getScorePoint() + "입니다.");
		}
			
			System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
		
		for(Menu menu : LunchMenu) {
			
			System.out.println("학생 " + studentName + "의 점심메뉴는 " + 
			       menu.getName()+"가격은 "+menu.getPrice() +", "+ menu.getDescription());
		}
	}
}
