package ch04;

public class _01_Student {
	/**
	 * Ŭ���� : ��ü�� ���� ���赵, ������, û����(�̷��� ���� ������� ��ȹ�̳� ����)
	 * 		- �������(�Ӽ�, �ʵ�) + ����޼ҵ�(���, ����) + ������
	 * 
	 * Ŭ������ ���赵(������)�̸�, ��ü�� �� ���赵�� �������� ������� ���޸� �����̴�.
	 * �� ��� �ּҰ��� ���������, ���������� �Ҵ�ȴ�.(���Եȴ�.)
	 * **/
	int studentID; 									// �й�
	String studentName;							// �̸�
	int grade;											// �г�
	String address;									// �ּ�
	String e_mail;									// �̸���
	int score;											// ����
	
	// ������
	public _01_Student() {
		
	}
	
	// ����޼ҵ� - ���
	public void showStudentInfo() {
		System.out.println("studentID : " + studentID);
		System.out.println("studentName : " + studentName);
		System.out.println("grade : " + grade);
		System.out.println("address : " + address);
		System.out.println("e_mail : " + e_mail);
		System.out.println("score : " + score);
	}
	
	
	
	
}
