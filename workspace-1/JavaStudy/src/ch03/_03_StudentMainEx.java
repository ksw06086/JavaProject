package ch03;

public class _03_StudentMainEx {
	public static void main(String[] args) {
		_03_Student st = new _03_Student();
		
		// ��� 1. set�޼ҵ带 ���ؼ� �л����� ����
		st.setStudentID(25);
		st.setStudentName("����Ÿ��");
		st.setGrade(232);
		st.setAddress("F�� ����");
		
		// ��¸޼ҵ� ȣ��
		System.out.println("setter �޼ҵ带 �̿��� ���");
		st.printInfo();
		
		System.out.println();
		
		// ��� 2. �Ű����� �����ڸ� ���ؼ� �л����� ����
		_03_Student st2 = new _03_Student(2000, "�輱��", 3, "����� ������");
		System.out.println("�Ű����� �����ڸ� �̿��ؼ� ���");
		st2.printInfo();
		
	}
}
