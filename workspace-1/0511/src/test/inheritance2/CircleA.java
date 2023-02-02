package test.inheritance2;

public class CircleA {
	private double area;
	private int r;

	public double getArea() {
		return area;
	}

	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	
}
