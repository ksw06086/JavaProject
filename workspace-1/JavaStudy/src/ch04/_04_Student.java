package ch04;

public class _04_Student {
	// �������
	public String studentName;				// �л��̸�
	public int grade;								// �г�
	public int money;								// �����ݾ�
	
	// ������
	public _04_Student() {}
	public _04_Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// ����޼ҵ�
	// ���� Ž
	public void takeBus(_04_Bus bus) {
		bus.take(1250);
		money -= 1250;
	}
	
	// ����ö Ž
	public void takeSubway(_04_Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "���Դϴ�.");
	}
	
	
	
}
