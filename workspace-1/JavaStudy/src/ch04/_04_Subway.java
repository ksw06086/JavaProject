package ch04;

public class _04_Subway {
	String lineNumber; 		// ÁöÇÏÃ¶ ³ë¼± ¹øÈ£
	int passengerCount;		// ½Â°´ ¼ö
	int money;					// ÁöÇÏÃ¶ ¼öÀÔ
	
	public _04_Subway() {}
	public _04_Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶ " + lineNumber + "ÀÇ ½Â°´Àº " + passengerCount + "¸í");
		System.out.println("¼öÀÔÀº " + money + "¿øÀÔ´Ï´Ù.");
	}
	
}
