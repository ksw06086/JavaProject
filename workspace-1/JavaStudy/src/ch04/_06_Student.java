package ch04;

public class _06_Student {
	/*
	 * static 변수 : 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 데이터영역 메모리 공간에 할당된다.
	 * 				그 값은 모든 인스턴스가 공유한다.
	 * 				따라서 모든 인스턴스가 동일한 static 변수를 가리킨다.
	 * 				1 - 데이터 영역 그 후 2 - 힙과 스택메모리 생성
	 * */
	// 멤버변수
	public static int serialNum = 1000;
	public int studentID;							// 학번
	public String studentName;					// 이름
	
	public _06_Student() {}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}