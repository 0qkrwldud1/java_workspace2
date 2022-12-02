package ch05_test;

public class Person {
	 private String name;
	 //접근지정자 외부에서 해당 속성을 볼 수 없게 함
	 //데이터 은닉 목적. 민감한 데이터는 직접 접근 불가하게 만듦.
	 //get, set함수 이용해서 해당 데이터에 우회해서 접근함.
	  float height;
	  float weight;
	
	  //자동으로 생성된 get, set 함수.
	  public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	// 기본생성자. 멤버변수를 초기화해줌.
	// 기본 생성자는 해당 클래스내에 아무런 생성자가 없다면 시스템에서 기본으로 만들어줌.
	// 만약 하나 이상의 생성자가 있다면 안만들어줌.
	public Person() {}
	 
	 //매개변수가 1개인 생성자.
	 public Person(String pname) {
	 name = pname;
	  }
	 
	  public Person(String pname, float pheight, float pweight){
		   name = pname;
		   height = pheight;
		   weight = pweight;
	  }//매개변수가 3개인 생성자.
	  
	  public void showInfo() {
		System.out.println("이름: "+name+
				"키: "+height+
				"몸무게: "+weight);
	}
}   

