package ch04;

public class _07_StaticEx {
	public static void main(String[] args) {
		_07_Student lee = new _07_Student();
		lee.setStudentID(1001);
		lee.setStudentName("������");
		
		System.out.println("�й� : " + lee.getStudentID() + ", �̸� : " + lee.getStudentName());
		// Ŭ������.static ���� ex) ������ �ֿܼ��� �Է¹��� ��, ��ĳ�� Ŭ���� ����
		// Scanner input = new Scanner(System.in);
		// input.next() // �������� �����ؾ� �� ��
		System.out.println("serialNum : " + _07_Student.serialNum);
		System.out.println("serialNum : " + lee.serialNum);
	}
}
