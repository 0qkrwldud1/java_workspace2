package ch10_interfaceex_1021;

public class Customer implements Buy, Sell, Returned{

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	

	@Override
	public void returned() {
		System.out.println("환불하기");
	}
	

	@Override
	public void order() {
		System.out.println("Customer 고객 판매 주문");
	}
}


