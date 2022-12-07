package ch05_test;

public class PersonTest {
   
	 public static void main(String[] args) {
		  Person pjy = new Person();
		  //pjy.name ="박지영";
		  pjy.height =160F;
		  pjy.weight =52F; 
		  //set메서드를 이용해서 name값 설정하기.
		  pjy.setName("박지영");
		  pjy.showInfo();
		  //get 메서드를 이용해서 name값 출력.
		  System.out.println("get메서드로 이름호출: "+pjy.getName());
		  
		  Person pjy2 = new Person("박지영");
		  pjy2.height =160F;
		  pjy2.weight =52F;
		  pjy2.showInfo();
				  
		  Person pjy3 = new Person("박지영",160 ,52 );
		  pjy3.showInfo();
				 
//		  personKim.name = "김유신";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("이순신", 175, 75);
		  
	 }
}
