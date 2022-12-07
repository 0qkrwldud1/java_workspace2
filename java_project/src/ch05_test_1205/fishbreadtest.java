package ch05_test_1205;

public class fishbreadtest {
		//실행할 수 있는 메인 메서드가 있는 파일.
	
	public static void main(String[] args) {
		
		//클래스명 객체명(참조형 번수) = new 클래스명()
		fishbread fishBread1 = new fishbread();
		// 기본 생성자 : FishBread();
		// 해당 변수에 처음에 값을 할당하는 역할, 초기화라고 이야기함. 
		// 변수, powder : String, redBean : String, 기본적으로 
		// 값을 할당을 하지 않아서, 기본값이 null -> 해당 참조형(주솟값) 할당이 안되었음.
		fishBread1.setPowder("박지영 기법의 반죽 ");
		fishBread1.setRedbean("설탕을 추가한 팥 ");
		fishBread1.showInfo();
		System.out.println("붕어빵 1번의 참조형 번수가 가르키는 값: " + fishBread1);
		
		
		fishbread fishBread2 = new fishbread("빵가루2 ","설탕 팥 ");
		fishBread2.showInfo();
		System.out.println("붕어빵 2번의 참조형 번수가 가르키는 값: " + fishBread2);
	
	}

}
