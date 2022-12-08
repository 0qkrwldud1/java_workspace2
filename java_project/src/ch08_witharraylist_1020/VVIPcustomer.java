package ch08_witharraylist_1020;

public class VVIPcustomer extends Customer{

	private int agentID;
	private int parking;
	double saleRatio;
	
	
	public VVIPcustomer(int customerID, String customerName, int agentID, int parking){
		super(customerID, customerName);
	
		customerGrade = "VVIP";
		bonusRatio = 0.15;
		saleRatio = 0.2;
		this.agentID = agentID;
		this.parking = parking;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다."+"발렛파킹 번호는 "+parking+ " 입니다.";  
	}

	public int getAgentID(){
		return agentID;
	}
}

