package ch;

public class ElectroProduct {
	private int price;					// ����
	private int bonusPoint;		// ���ʽ�����Ʈ
	
	public ElectroProduct() {}
	
	public ElectroProduct(int price) {
		this.price = price;
		bonusPoint = (int)(price * 0.01);
	}

	// ����
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// ���ʽ� ����Ʈ
	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
}
