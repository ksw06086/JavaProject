package ch07;

public abstract class _04_Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// ���ø� �޼ҵ� : Ʋ�� �ִ� �޼ҵ��̸�, ������ ���� �ʵ��� final�� ����
	// �ڵ����� �޸��� ����� ������� ����
	public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
