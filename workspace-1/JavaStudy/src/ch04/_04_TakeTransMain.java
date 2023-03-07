package ch04;

public class _04_TakeTransMain {
	public static void main(String[] args) {
		_04_Student kim = new _04_Student("김하나", 5000);
		_04_Student park = new _04_Student("박은지", 5000);
		
		_04_Bus bus100 = new _04_Bus(100);
		kim.takeBus(bus100);
		kim.showInfo();
		bus100.showInfo();
		
		_04_Subway subwayRed = new _04_Subway("신분당선");
		park.takeSubway(subwayRed);
		park.showInfo();
		subwayRed.showInfo();
	}
}
