package ch07;

public class _04_Main {
	public static void main(String[] args) {
		_04_Car my = new _04_AICar();
		System.out.println("=== �������� �ڵ��� ===");
		my.run();
		
		_04_Car his = new _04_ManualCar();
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		his.run();
	}
}
