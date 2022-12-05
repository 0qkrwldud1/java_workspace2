package ch06_cooperation_1019;

public class TakeTrans {

	public static void main(String[] args) {
		
		//객체 생성 매개변수가 2개
		Student pjyStudent = new Student("박지영", 20000);
		
		Bus bus2 = new Bus(2);
		Subway subway1 = new Subway("1");
		Taxi taxi3 = new Taxi(3);
		
		pjyStudent.takeBus(bus2);
		System.out.println("버스 2번 타고 남은 잔액");
		pjyStudent.showInfo();
		System.out.println("2번 버스의 정보");
		bus2.showInfo();

		
		Student pjy2Student = new Student("박지영2", 20000);
		pjy2Student.takeSubway(subway1);
		System.out.println("지하철 1호선 타고 남은 잔액");
		pjy2Student.showInfo();
		System.out.println("지하철 1호선의 정보");
		subway1.showInfo();
		
		Student pjy3Student = new Student("박지영3",10000);
		pjy3Student.takeTaxi(taxi3);
		pjy3Student.takeTaxi(new Taxi(4));
		System.out.println("3번 택시 타고 남은 잔액");
		pjy3Student.showInfo();
		System.out.println("3번 택시의 정보");
		taxi3.showInfo();
		  
		
		// 두 명의 학생을 생성
		//Student studentJames = new Student("James", 5000);   
		//Student studentTomas = new Student("Tomas", 10000);
		//디버깅 한번 수행하고 ㅇ
		//본인 이름으로 생성하기. ㅇ
		// 버스, 지하철 타보기.
		// 택시 만들어서 타보세요.
		//Student lsy = new Student("이상용씨", 20000);
		//Bus bus103 = new Bus(103);
		//lsy.takeBus(bus103);     // james가 100번 버스를 탐
		//lsy.showInfo();           // james 정보 출력
		//bus103.showInfo();                // 버스 정보 출력
		//		  
		//Subway subwayOrange = new Subway("1호선");  
		//lsy.takeSubway(subwayOrange);  // Tomas가 2호선을 탐
		//lsy.showInfo();                 // Tomas 정보 출력
		//subwayOrange.showInfo(); 
		   
		//Bus bus100 = new Bus(100);
		//studentJames.takeBus(bus100);     // james가 100번 버스를 탐
		//studentJames.showInfo();           // james 정보 출력
		//bus100.showInfo();                // 버스 정보 출력
		//		  
		//Subway subwayGreen = new Subway("2호선");  
		//studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
		//studentTomas.showInfo();                 // Tomas 정보 출력
		//subwayGreen.showInfo();   
	}
}
