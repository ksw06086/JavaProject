package ch06;

public class _04_VIPCustomer extends _04_Customer{
	private int agentID;
	private double saleRatio;
	
	public _04_VIPCustomer() {
		agentID = 10030;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		super.price = (int)(price - price*saleRatio);
		return (int)(price - price*saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n" +
						customerName + "님의 상담원 ID는 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
}
