package ch04;

public class _04_Bus {
	// 멤버변수
	int busNumber;				// 버스 번호
	int passengerCount;		// 승객 수
	int money;					// 버스 수입
	
	public _04_Bus() {}
	public _04_Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 멤버메소드
	// 버스를 타면 버스 수입 증가, 승객 수 증가
	public void take(int money) {
		this.money += money;				// 버스수입 증가
		this.passengerCount++;			// 승객 수 증가
	}
	// 출력 정보
	public void showInfo() {
		System.out.println(busNumber + "번의 승객은 " + passengerCount + "명");
		System.out.println("수입은 " + money + "원입니다.");
	}
}