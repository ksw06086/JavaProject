package test.constructor;

public class RunConstructor {
	public static void main(String[] args) {
		ConstructorTest ci = new ConstructorTest();
		ConstructorTest co = new ConstructorTest(202107045, "��α�");
		ConstructorTest cu = new ConstructorTest(202107046, "�����");
		
		System.out.println("c1�� �����ϴ� ��ü�� �й� : " + co.getStuId());
		System.out.println("c1�� �����ϴ� ��ü�� �̸� : " + co.getName());
		System.out.println("===============================");
		System.out.println("c2�� �����ϴ� ��ü�� �й� : " + cu.getStuId());
		System.out.println("c2�� �����ϴ� ��ü�� �й� : " + cu.getName());
	}
}
