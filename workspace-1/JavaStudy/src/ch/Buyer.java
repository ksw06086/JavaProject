package ch;

public class Buyer {
	private int myMoney = 10000;
	private int bonusPoint = 0;
	
	public void buy(ElectroProduct product) {
		if(myMoney - product.getPrice() < 0) {
			System.out.println("잔액이 부족합니다.");
		} else {
			if(product instanceof Tv) {
				Tv t = (Tv)product;
				t.print();
			} else if(product instanceof NoteBook) {
				NoteBook n = (NoteBook)product;
				n.print();
			} else {
				System.out.println("현재 판매 중인 제품이 아닙니다.");
			}
			System.out.println("제품금액 : " + product.getPrice() + " 잔액 : " + (myMoney -= product.getPrice()));
			System.out.println("보너스 포인트 : " + (bonusPoint += product.getBonusPoint()));
		}
	}
}