package ch04;

public class _07_Student {
	/*
	 * static ���� = �������� = �������� = Ŭ��������
	 * static ���� : ���α׷��� ����Ǿ� �޸𸮿� �ö��� �� �� �ѹ� �����Ϳ��� �޸� ������ �Ҵ�ȴ�.
	 * 				�� ���� ��� �ν��Ͻ��� �����Ѵ�.
	 * 				���� ��� �ν��Ͻ��� ������ static ������ ����Ų��.
	 * - static �޼ҵ峪 ������ static �޼ҵ忡�� ȣ�Ⱑ��
	 *   (�����޼ҵ忡�� �ν��Ͻ� ������ �޼ҵ带 ȣ���� ��� ������ ������ ����.)
	 * - static �޼ҵ�� ����� �ڵ����� �޸𸮿� �ö󰡳�, �Ϲ� �޼ҵ�� ��ü�� �����ؾ� �޸𸮿� �ö󰣴�.
	 * 					1 - �����Ϳ��� �� �� 2 - ���� ���ø޸� ����
	 * */
	// �������
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	
	public _07_Student() {}
	
	//serialNum
	public static int getSerialNum() {
		int i = 10; // ��������
		// String studentName = "ȫ�浿"; // ���ú���
		
		// ������� studentName�� ��ü������ �������Ƿ� �޸𸮿� �ȿö� ������
		// ���� static �޼ҵ忡�� �Ϲ� ��������� ���ٺҰ�
		// studentName = "ȫ�浿";
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
