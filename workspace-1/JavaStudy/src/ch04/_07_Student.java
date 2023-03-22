package ch04;

public class _07_Student {
	/*
	 * static 변수 = 정적변수 = 공유변수 = 클래스변수
	 * static 변수 : 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 데이터영역 메모리 공간에 할당된다.
	 * 				그 값은 모든 인스턴스가 공유한다.
	 * 				따라서 모든 인스턴스가 동일한 static 변수를 가리킨다.
	 * - static 메소드나 변수는 static 메소드에서 호출가능
	 *   (정적메소드에서 인스턴스 변수나 메소드를 호출할 경우 컴파일 오류가 난다.)
	 * - static 메소드는 실행시 자동으로 메모리에 올라가나, 일반 메소드는 객체를 생성해야 메모리에 올라간다.
	 * 					1 - 데이터영역 그 후 2 - 힙과 스택메모리 생성
	 * */
	// 멤버변수
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	
	public _07_Student() {}
	
	//serialNum
	public static int getSerialNum() {
		int i = 10; // 지역변수
		// String studentName = "홍길동"; // 로컬변수
		
		// 멤버변수 studentName은 객체생성을 안했으므로 메모리에 안올라간 상태임
		// 따라서 static 메소드에서 일반 멤버변수에 접근불가
		// studentName = "홍길동";
		return serialNum;
	}

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