package test.inheritance2;

public class RunCircle {
	
	public static void showResult(CircleB c) {
		System.out.println("* ���� ������: " + c.getR() + "cm");
		System.out.printf("* ���� �ѷ�: %.1fcm\n", c.getCircum());
		System.out.printf("* ���� ����: %.1fcm", c.getArea());
	}
	
	public static void main(String[] args) {
		CircleB c = new CircleB();
		c.setR(9);
		c.calcArea();
		c.calcCircum();
		showResult(c);	
	}
}
