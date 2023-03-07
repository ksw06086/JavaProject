package ch04;

public class _06_StaticEx {
	public static void main(String[] args) {
		_06_Student lee = new _06_Student();
		lee.setStudentID(1001);
		lee.setStudentName("이지민");
		
		System.out.println("학번 : " + lee.getStudentID() + ", 이름 : " + lee.getStudentName());
		
		System.out.println("serialNum : " + _06_Student.serialNum);
		System.out.println("serialNum : " + lee.serialNum);
		_06_Student.serialNum++; // 1001
		
		System.out.println();
		
		_06_Student son = new _06_Student();
		son.setStudentID(1002);
		son.setStudentName("손석구");
		
		System.out.println("학번 : " + son.getStudentID() + ", 이름 : " + son.getStudentName());
		
		System.out.println("serialNum : " + _06_Student.serialNum);
		System.out.println("serialNum : " + lee.serialNum);
		System.out.println("serialNum : " + son.serialNum);
		
	}
}
