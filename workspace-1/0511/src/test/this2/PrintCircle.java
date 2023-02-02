package test.this2;

public class PrintCircle {
	public static void ShowResult(Circle c) {
		System.out.println("원의 반지름: " + c.getR() + ", 원의 둘레: " 
		+ String.format("%.2f", c.getCircum()) + ", 원의 넓이: " + 
		String.format("%.2f", c.getArea()));
		
		
	}
}
