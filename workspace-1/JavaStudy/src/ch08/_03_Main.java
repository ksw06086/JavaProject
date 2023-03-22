package ch08;

public class _03_Main {
	public static void main(String[] args) {
		_03_MyClass mClass = new _03_MyClass();
		
		//  다형성
		_03_XImpl x = mClass;
		x.x();
		
		System.out.println("-----------------------------");
		
		_03_YImpl y = mClass;
		y.y();
		
		System.out.println("-----------------------------");
		
		// 구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 데소드 호출 가능
		_03_MyImpl my = mClass;
		my.myMethod();
		my.x();
		my.y();
	}
}