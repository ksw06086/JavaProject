package ch09;

public class _06_Point {
	int x;
	int y;
	
	_06_Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}
