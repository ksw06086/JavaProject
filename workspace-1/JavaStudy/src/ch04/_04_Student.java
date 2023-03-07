package ch04;

public class _04_Student {
	// 멤버변수
	public String studentName;				// 학생이름
	public int grade;								// 학년
	public int money;								// 소지금액
	
	// 생성자
	public _04_Student() {}
	public _04_Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 멤버메소드
	// 버스 탐
	public void takeBus(_04_Bus bus) {
		bus.take(1250);
		money -= 1250;
	}
	
	// 지하철 탐
	public void takeSubway(_04_Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원입니다.");
	}
	
	
	
}
