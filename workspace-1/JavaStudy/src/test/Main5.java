package test;

public class Main5 {
	public static void main(String[] args) {
		Lendable marshmallow = new AppCDInfo(1001, "마시멜로 이야기");
		marshmallow.checkOut("찰리", 20190410);
		System.out.println("======================");
		marshmallow.checkOut("제이슨", 20190501);
		System.out.println("======================");
		marshmallow.checkIn();
		marshmallow.checkIn();
	}
}