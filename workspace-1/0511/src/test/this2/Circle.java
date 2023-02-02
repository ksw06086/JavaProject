package test.this2;

public class Circle {
	public static final double PI = 3.141592;
	private int r;
	private double circum;
	private double area;
	
	public Circle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public double getCircum() {
		return circum;
	}

	public double getArea() {
		return area;
	}

	public void calcCircum() {
		circum = 2*PI*r;
	}
	
	public void calcArea() {
		area = PI*Math.pow(r, 2);
	}
	
	public void print() {
		PrintCircle.ShowResult(this);
	}
}
