package ch04;

public class _04_Subway {
	String lineNumber; 		// 지하철 노선 번호
	int passengerCount;		// 승객 수
	int money;					// 지하철 수입
	
	public _04_Subway() {}
	public _04_Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명");
		System.out.println("수입은 " + money + "원입니다.");
	}
	
}