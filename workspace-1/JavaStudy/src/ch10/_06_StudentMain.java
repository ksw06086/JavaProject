package ch10;

public class _06_StudentMain {
	public static void main(String[] args) {
		_06_StudentArrayList stdList = new _06_StudentArrayList();
		_06_Student hong = new _06_Student("H001", "ȫ����", "hong@naver.com");
		_06_Student lee = new _06_Student("H002", "������", "lee@naver.com");
		_06_Student kim = new _06_Student("H003", "������", "kim@naver.com");
		
		// ȸ�� �߰�
		stdList.addStudent(hong);
		stdList.addStudent(lee);
		stdList.addStudent(kim);
		
		// ����л� ���� ���
		stdList.showStudentInfo();
		
		// �л����� ����
		stdList.deleteStudent("H001");
		// ����л� ���� ���
		stdList.showStudentInfo();
				
	}
}
