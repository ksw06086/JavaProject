package ch04;

public class _04_Bus {
	// �������
	int busNumber;				// ���� ��ȣ
	int passengerCount;		// �°� ��
	int money;					// ���� ����
	
	public _04_Bus() {}
	public _04_Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// ����޼ҵ�
	// ������ Ÿ�� ���� ���� ����, �°� �� ����
	public void take(int money) {
		this.money += money;				// �������� ����
		this.passengerCount++;			// �°� �� ����
	}
	// ��� ����
	public void showInfo() {
		System.out.println(busNumber + "���� �°��� " + passengerCount + "��");
		System.out.println("������ " + money + "���Դϴ�.");
	}
}
