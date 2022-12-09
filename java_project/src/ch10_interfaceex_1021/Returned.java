package ch10_interfaceex_1021;

public interface Returned {
	
	void returned();
	
	default void order(){
		System.out.println("Returned 환불 주문");
	}
}
