package ch;

public class Main {
	public static void main(String[] args) {
		// ���� : 10000����
		// ���ʽ�����Ʈ 1% ����
		
		Tv tv = new Tv(1000, "tv");
		NoteBook nb = new NoteBook(2000, "��Ʈ��");
		
		Buyer buyer = new Buyer();
		buyer.buy(tv);
		System.out.println("=========================");
		buyer.buy(nb);
	}
}
