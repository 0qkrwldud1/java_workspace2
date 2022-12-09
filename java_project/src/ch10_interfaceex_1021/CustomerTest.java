package ch10_interfaceex_1021;

public class CustomerTest {

	public static void main(String[] args) {
		
		//환불하는 인터페이스
		//해당고객으로 환불받아보기
		//다형성으로 환불 인터페이스형으로 선언해서 사용해보기.
		Customer customer3 = new Customer();
		Returned returned = customer3;
		returned.returned();

		Customer customer = new Customer();
		//인터페이스의 다형성개념.
		//커스터머를 바이형으로 받아서 바이어변수를 만듦.
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if( seller instanceof Customer){
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		
		customer.order();
	}
}


