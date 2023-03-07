package ch06;

public class _04_Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	protected int price;
	
	// ����Ʈ ������.. �ʱ�ȭ
	public _04_Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		this.price = price;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "(" + customerID + ")" + " ���� ����� " + customerGrade + 
				"�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + ", ���� : " + price + "�Դϴ�.";
	}
	
	
}
