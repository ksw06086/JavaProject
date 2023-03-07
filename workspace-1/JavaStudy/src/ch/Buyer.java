package ch;

public class Buyer {
	private int myMoney = 10000;
	private int bonusPoint = 0;
	
	public void buy(ElectroProduct product) {
		if(myMoney - product.getPrice() < 0) {
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			if(product instanceof Tv) {
				Tv t = (Tv)product;
				t.print();
			} else if(product instanceof NoteBook) {
				NoteBook n = (NoteBook)product;
				n.print();
			} else {
				System.out.println("���� �Ǹ� ���� ��ǰ�� �ƴմϴ�.");
			}
			System.out.println("��ǰ�ݾ� : " + product.getPrice() + " �ܾ� : " + (myMoney -= product.getPrice()));
			System.out.println("���ʽ� ����Ʈ : " + (bonusPoint += product.getBonusPoint()));
		}
	}
}
