package ch10_scheduler_1021;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("전화 상담 할당 방식을 선택 하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		
		//in -> 해당하는 문자를 읽어서 ch(한문자)에 대입. ch는 아스키코드로 변환가능. ch를 int형으로 자동으로 형변환.
		//인터페이스형으로 선언 -> 인터페이스를 구현한 3개의 클래스를 다담을 수 있다.
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r'){
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l'){
			scheduler = new LeastJob();
		}
		else if(ch == 'P'|| ch == 'p'){
			scheduler = new PriorityAllocation();
		}
		else{
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
