package test.this2;

public class PrintCircle {
	public static void ShowResult(Circle c) {
		System.out.println("���� ������: " + c.getR() + ", ���� �ѷ�: " 
		+ String.format("%.2f", c.getCircum()) + ", ���� ����: " + 
		String.format("%.2f", c.getArea()));
		
		
	}
}
