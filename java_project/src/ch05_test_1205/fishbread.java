package ch05_test_1205;
	//실행 할 수 있는 메인메서드 x -> 설계도면으로서 사용.
	public class fishbread {
	private String powder; //반죽
	private String redbean; //팥
	
	public String getPowder() {
		return powder;
	}
	public void setPowder(String powder) {
		this.powder = powder;
	}
	public String getRedbean() {
		return redbean;
	}
	public void setRedbean(String redbean) {
		this.redbean = redbean;
	}
	//실제 데이터에 접근하는 방법.
	//직접접근 or set, get 이용.
	//예) 직접접근 -> getpowder()메서드로 접근.
	//set 지정하기, get 가져오기.
	//자동으로 해당 멤버들에 대해서 set, get을 만듦. -> 이클립스 툴
	//우클릭 -> 소스 -> 제너레이트 게터, 세터 : 메서드 자동으로 만듦.
	
	//기본생성자를 만들어준다.->  JVM이 자동으로 만들어줌. 조건) 해당 생성자가 하나도 없을 경우.
	//매개변수가 없는 기본생성자 만들기 -> 추가로 직접 만듦.
	//우클릭 -> 소스 -> 제너레이트 컨스트럭터 : 생성자 자동으로 만듦.
	public fishbread() {
		
	}
	
	//오버로드 -> 매개 변수가 2개인 생성자를 만들기. 짐을 싣는다.
	public fishbread(String powder, String redbean) {
		super();
		this.powder = powder;
		this.redbean = redbean;
	}
	//super-> 부모클래스 값을 초기화함. 나중에 종속에서 사용.
	
	//화면에 출력하는 메서드 만들기 -> showInfo()
	public void showInfo() {
		System.out.println("현재 반죽은 "+powder+"현재 팥은 "+redbean);
		
	}
	
	
	
	
	
	
}
