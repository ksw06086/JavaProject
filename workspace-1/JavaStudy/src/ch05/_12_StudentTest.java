package ch05;

public class _12_StudentTest {
	public static void main(String[] args) {
		_12_Student studentLee = new _12_Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		_12_Student studentKim = new _12_Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("==============================");
		studentKim.showStudentInfo();
		
	}
}
