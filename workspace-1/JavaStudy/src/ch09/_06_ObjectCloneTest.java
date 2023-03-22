package ch09;

public class _06_ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * Object의 clone() 메소드는 클래스의 인스턴스를 새로 복제하여 생성해 줌
		 * 멤버변수가 동일한 인스턴스가 다른 메모리에 새로 생성됨
		 * 출력결과 인스턴스의 멤버변수 값은 같고, 주소값은 다른 copyCircle이 생성됨
		 * **/
		_06_Circle circle = new _06_Circle(10, 20, 30);
		
		// clone() 메소드를 사용해 circle 인스턴스를 copyCircle에 복제함
		_06_Circle copyCircle = (_06_Circle)circle.clone();
		
		// 원점은 x = 10, y = 20이고, 반지름은 30입니다.
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
	}
}