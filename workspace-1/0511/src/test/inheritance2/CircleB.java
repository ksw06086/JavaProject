package test.inheritance2;

public class CircleB extends CircleA{
	private double circum;

	public double getCircum() {
		return circum;
	}
	
	public void calcCircum() {
		circum = 2 * Math.PI * getR();
	}
}
