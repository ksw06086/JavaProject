package test.inheritance1;

public class RunStInfo {
	public static void main(String[] args) {
		SubStInfo s = new SubStInfo();
		s.name = "������";
		s.stuId = 2020001;
		s.age = 22;
		s.addr = "��⵵ ��õ�� ���ȵ�";
		
		System.out.println("* ���� : " + s.name);
		System.out.println("* �й� : " + s.stuId);
		System.out.println("* �ּ� : " + s.addr);
	}
}
