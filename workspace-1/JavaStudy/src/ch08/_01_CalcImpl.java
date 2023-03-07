package ch08;

/**
 * <인터페이스>
 * - 기능정의서(표준 작업 명세서)이다. - 강제성과 통일성
 * - 설계(선언)와 구현을 분리시키는 것을 가능하게 한다.(설계 : 인터페이스에서 하고, 구현 : 자식클래스에서 한다.)
 * - 객체생성 불가하며, 객체 Type으로 사용가능하다.(다형성 적용)
 * - 인터페이스의 멤버는 상수, 추상메소드만 올 수 잇다.(abstract 생략 가능)
 * - 단 static 메소드와 디폴트 메소드는 예외(JDK 1.8부터)
 * - 인터페이스를 inplements(=구현)한 자식클래스에서 추상메소드를 재정의한다.
 * 
 * 1. 인터페이스 작성
 * interface 인터페이스명 {
 * 		// 상수
 * 	public static final 데이터타입 대문자상수 = 값;
 * 
 * 	// 반환형 추상메소드명();
 * 	public 반환형 메소드명(매개변수1, 매개변수2, ...);
 * }
 * 
 * 2. 인터페이스 구현 : 인터페이스에 정의된 추상메소드의 몸체를 정의한다는 의미
 * class 클래스명 implements 인터페이스명 {
 * 	@Override
 * 	public 반환형 메소드명 (매개변수1, 매개변수2, ..) {
 * 		// 인터페이스에 정의된 추상메소드를 구현해야한다.
 * 	}
 * }
 * 
 * 3. 인터페이스는 다중상속가능 cf) 클래스는 단일상속만 가능
 * interface 인터페이스명 extends 인터페이스명1, 인터페이스명2,.. {
 * 
 * }
 * 
 * 4. 상속과 구현을 동시
 * class 클래스명 extends 부모클래스명 implements 인터페이스1, 인터페이스명2, .. {
 * 	// 인터페이스에 정의된 추상메소드를 구현해야한다.
 * }
 * */
public interface _01_CalcImpl {
	// 인터페이스는 상수와 추상메소드로 구성
	// JDK 1.8버전부터 static 메소드, default 메소드가 올 수 잇다.
	// 상수
	// 컴파일 과정에서 값이 변하지 않는 변수로 자동 변환된다. public static final은 생략가능
	double PI = 3.14;
	int ERROR = -999999999;
	
	// 추상메서드
	// 컴파일 과정에서 자동으로 추상메소드로 변환 public abstract는 생략 가능
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
