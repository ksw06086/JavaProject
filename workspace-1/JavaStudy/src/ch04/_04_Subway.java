package ch04;

public class _04_Subway {
	String lineNumber; 		// ����ö �뼱 ��ȣ
	int passengerCount;		// �°� ��
	int money;					// ����ö ����
	
	public _04_Subway() {}
	public _04_Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����ö " + lineNumber + "�� �°��� " + passengerCount + "��");
		System.out.println("������ " + money + "���Դϴ�.");
	}
	
}
