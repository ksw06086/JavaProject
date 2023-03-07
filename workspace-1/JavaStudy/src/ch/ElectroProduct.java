package ch;

public class ElectroProduct {
	private int price;					// 가격
	private int bonusPoint;		// 보너스포인트
	
	public ElectroProduct() {}
	
	public ElectroProduct(int price) {
		this.price = price;
		bonusPoint = (int)(price * 0.01);
	}

	// 가격
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 보너스 포인트
	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
}
