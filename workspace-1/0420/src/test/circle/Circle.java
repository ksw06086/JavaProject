package test.circle;

public class Circle {
	private int r;
	private double circum, area;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getCircum() {
		return circum;
	}

	public void calcCircum() {
		circum = 2*Math.PI*r;
	}
	
	public double getArea() {
		return area;
	}
	
	public void calcArea() {
		area = Math.pow(r,2)*Math.PI;
	}
	
	
	
}
