package ch07;

public class _04_Main {
	public static void main(String[] args) {
		_04_Car my = new _04_AICar();
		System.out.println("=== 자율주행 자동차 ===");
		my.run();
		
		_04_Car his = new _04_ManualCar();
		System.out.println("=== 사람이 운전하는 자동차 ===");
		his.run();
	}
}
