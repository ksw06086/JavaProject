package ch04;

public class _06_Student {
	/*
	 * static ���� : ���α׷��� ����Ǿ� �޸𸮿� �ö��� �� �� �ѹ� �����Ϳ��� �޸� ������ �Ҵ�ȴ�.
	 * 				�� ���� ��� �ν��Ͻ��� �����Ѵ�.
	 * 				���� ��� �ν��Ͻ��� ������ static ������ ����Ų��.
	 * 				1 - ������ ���� �� �� 2 - ���� ���ø޸� ����
	 * */
	// �������
	public static int serialNum = 1000;
	public int studentID;							// �й�
	public String studentName;					// �̸�
	
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
