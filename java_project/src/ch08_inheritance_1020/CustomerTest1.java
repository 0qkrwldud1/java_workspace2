package ch08_inheritance_1020;

import java.security.PublicKey;

import ch11_classex_1024.NewInstanceTest;

public class CustomerTest1 {
	
	public static void main(String[] args) {
		//모든 클래스는 부모 클래스가 : Object 최고 상위 클래스가 암묵적으로 
		// 생성자 호출하는 부분이 생략. 
		
		//상속을 배워서, 자식클래스라고 말하는 것은 부모클래스가 있다는 것.
		//. VIPCustomer extends Customer 
		//자식클래스가 자기의 멤버를 초기화하기 전에 먼저 부모클래스를 생성자 호출을 한다. 
		// -> 부모클래스 생성자 초기화를 먼저함 super()
		//상속은 한번만. 
		
		Customer customerLee = new Customer(10010, "이순신");
		//Customer customerLee = new Customer();
		//customerLee.setCustomerID(10010);
		//customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("===============================");
		
		//VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer lsy = new VIPCustomer();
		//매개변수의 자식클래스인 vipcustomer만 사용이되고
		
		VIPCustomer lsy7 = (VIPCustomer)lsy;
		//메서드를 통해서 다형성의 특징설명
		//다형성에서 부모클래스 형으로 받으면, 부모클래스만 보인다.
		//원래의 자식클래스형으로 변환-> 다운캐스팅 = 명시적형변환을 하면 이것을 받을 형은 원래자식인 클래스형이고,
		//자식클래스와 부모클래스가 전부 보인다.
		//상속에서 자식보다는 부모가 먼저 초기화되므로 1타2피로 사용이 가능하다.
		
		VIPCustomer lsy2 = new VIPCustomer();
		//매개변수의 자식클래스인 vipcustomer와 부모클래ㄴ스인 customer가 같이사용된다.
		
		Object lsy3 =  new Object();
		//매개변수의 최고 상위 클래스인 object라서 모두 사용가능하다. 
		//항상 암묵적으로 상속을 받고있다.
		//오브젝트로 받고 커스터머로 사용하고 싶으면 다운캐스팅 ->명시적 형변환하여 사용한다.
		
		
		
		
		
		
		
		
	}
}
