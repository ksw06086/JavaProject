package ch04;

public class _01_StudentMainEx {
	public static void main(String[] args) {
		/**
		 * ������������ ������ ��ü�� ���޸𸮰��� �ּҰ��� ����ִ�.
		 * ���� Ŭ�������� ������Ÿ���̰�, ���������� ������ �� ����Ѵ�.
		 * ���� Ŭ�������� *�޸𸮿� ��ü������ ���Ǵ� �������̴�.
		 * */
		_01_Student st = new _01_Student();
		st.studentID = 1001;
		st.studentName = "�輱��";
		st.grade = 1;
		st.address = "����� ������";
		st.e_mail = "k-sunwo@naver.com";
		st.score = 100;
		st.showStudentInfo();
		
		System.out.println();
		
		_01_Student st2 = new _01_Student();
		st2.studentID = 1002;
		st2.studentName = "�輱��B";
		st2.grade = 2;
		st2.address = "����� ������";
		st2.e_mail = "k-sunwo@naver.com";
		st2.score = 99;
		st2.showStudentInfo();
	}
}
