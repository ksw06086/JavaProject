package ch10;

public class _06_StudentMain {
	public static void main(String[] args) {
		_06_StudentArrayList stdList = new _06_StudentArrayList();
		_06_Student hong = new _06_Student("H001", "홍서윤", "hong@naver.com");
		_06_Student lee = new _06_Student("H002", "이지민", "lee@naver.com");
		_06_Student kim = new _06_Student("H003", "김희진", "kim@naver.com");
		
		// 회원 추가
		stdList.addStudent(hong);
		stdList.addStudent(lee);
		stdList.addStudent(kim);
		
		// 모든학생 정보 출력
		stdList.showStudentInfo();
		
		// 학생정보 삭제
		stdList.deleteStudent("H001");
		// 모든학생 정보 출력
		stdList.showStudentInfo();
				
	}
}
