package ch04;

public class _08_Company {
	/**
	 * 고정된 메모리 영역을 사용하도록 단 한번 new 연산자로 인스턴스를 얻어오기 때문에 메모리의 낭비를 줄입니다.
	 * 전역변수로 선언되고 전역메서드로 호출하기 때문에 다른 클래스에서 사용하기 쉽습니다.
	 * ** 공통된 객체를 사용해야하는 코딩에서 매번 객체를 생성하지 않고 같은 객체를 사용하도록 하면 성능면에서 훌륭해진다.
	 * 캐릭터가 이동 뒤로 앞으로 옆으로 메소드를 실행할 때
	 * 캐릭터2가 이동 뒤로 앞으로 옆으로 메소드를 실행할 때
	 * 캐릭터3이 이동 뒤로 앞으로 옆으로 메소드를 실행할 때 지속적으로 새로 만들것이냐
	 * 싱글톤 패턴(면접)
	 * - 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * - static을 응용하여 프로그램 전반에서 사용하는 인스턴스를 하나만 구현하는 방식
	 *    하나의 클래스내 여러 메소드가 있을 때, 각각의 메소드에 접근할 때마다 객체를 생성할 필요없이
	 *    한번만 객체생성한 후, 이후부터는 getInstance()를 통해 주소값만 리턴받아 접근한다.
	 * */
	// 2단계 : 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static _08_Company company = new _08_Company();
	
	// 디폴트 생성자
	// 1단계 : 생성자를 private로 만들기
	// 객체생성을 한번만 하도록 하기 위함, 즉 static으로 객체생성을 할 때만 디폴트 생성자를 호출하기 위해서 디폴트 생성자를 private로 한다.
	private _08_Company() {
		System.out.println("디폴트 생성자 호출");
	}
	// 3단계 : 외부에서 참조할 수 있는 public 메소드 만들기
	public static _08_Company getInstance() {
		System.out.println("getInstance 호출");
		if(company == null) {
			company = new _08_Company();
		}
		return company;
	}
	
	
}