package test;

public class Main5 {
	public static void main(String[] args) {
		Lendable marshmallow = new AppCDInfo(1001, "¸¶½Ã¸á·Î ÀÌ¾ß±â");
		marshmallow.checkOut("Âû¸®", 20190410);
		System.out.println("======================");
		marshmallow.checkOut("Á¦ÀÌ½¼", 20190501);
		System.out.println("======================");
		marshmallow.checkIn();
		marshmallow.checkIn();
	}
}
