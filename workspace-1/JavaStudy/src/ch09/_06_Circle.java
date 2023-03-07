package ch09;
														// 마커 인터페이스 구현할 메소드가 없다.
public class _06_Circle implements Cloneable{
	_06_Point point;
	int radius;
	
	public _06_Circle(int x, int y, int radius) {
		point = new _06_Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다."; 
	}
	
												// clone() 호출 시 Cloneable 인터페이스를 구현해주지 않으면 예외 발생
	@Override								// 클론이 지원이 되지 않았을 때 에외
	public Object clone() throws CloneNotSupportedException {
		// Object의 clone() 메소드가 protected 접근제어자로 잇어서 다른 클래스에서 바로 사용 못함
		// Object 클래스의 clone() 메소드를 호출함
		return super.clone();
	}
}
