package ch04;

public class _07_StaticEx {
	public static void main(String[] args) {
		_07_Student lee = new _07_Student();
		lee.setStudentID(1001);
		lee.setStudentName("이지민");
		
		System.out.println("학번 : " + lee.getStudentID() + ", 이름 : " + lee.getStudentName());
		// 클래스명.static 변수 ex) 플젝시 콘솔에서 입력받을 때, 스캐너 클래스 사용시
		// Scanner input = new Scanner(System.in);
		// input.next() // 공통으로 생성해야 할 때
		System.out.println("serialNum : " + _07_Student.serialNum);
		System.out.println("serialNum : " + lee.serialNum);
	}
}