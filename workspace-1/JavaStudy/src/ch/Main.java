package ch;

public class Main {
	public static void main(String[] args) {
		// 원금 : 10000가정
		// 보너스포인트 1% 누적
		
		Tv tv = new Tv(1000, "tv");
		NoteBook nb = new NoteBook(2000, "노트북");
		
		Buyer buyer = new Buyer();
		buyer.buy(tv);
		System.out.println("=========================");
		buyer.buy(nb);
	}
}
