package ch05;

public class _12_StudentTest {
	public static void main(String[] args) {
		_12_Student studentLee = new _12_Student(1001, "Lee");
		studentLee.addSubject("이지민", 100);
		studentLee.addSubject("이지민", 50);
		
		_12_Student studentKim = new _12_Student(1002, "Kim");
		studentKim.addSubject("김지원", 70);
		studentKim.addSubject("김지원", 85);
		studentKim.addSubject("김지원", 100);
		
		studentLee.showStudentInfo();
		System.out.println("==============================");
		studentKim.showStudentInfo();
		
	}
}
