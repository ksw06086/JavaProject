package test;

public class Main5 {
	public static void main(String[] args) {
		Lendable marshmallow = new AppCDInfo(1001, "���ø�� �̾߱�");
		marshmallow.checkOut("����", 20190410);
		System.out.println("======================");
		marshmallow.checkOut("���̽�", 20190501);
		System.out.println("======================");
		marshmallow.checkIn();
		marshmallow.checkIn();
	}
}
