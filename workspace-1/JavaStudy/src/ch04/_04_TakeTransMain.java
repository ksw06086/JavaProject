package ch04;

public class _04_TakeTransMain {
	public static void main(String[] args) {
		_04_Student kim = new _04_Student("���ϳ�", 5000);
		_04_Student park = new _04_Student("������", 5000);
		
		_04_Bus bus100 = new _04_Bus(100);
		kim.takeBus(bus100);
		kim.showInfo();
		bus100.showInfo();
		
		_04_Subway subwayRed = new _04_Subway("�źд缱");
		park.takeSubway(subwayRed);
		park.showInfo();
		subwayRed.showInfo();
	}
}
