package test.overloading;

public class RunOverTest2 {
	public static void main(String[] args) {
		OverLoadingTest2 o2 = new OverLoadingTest2();
		
		System.out.println("calc(22,33)ȣ�� ��� : " + o2.calc(22, 33));
		System.out.println("calc(22.0,33.0)ȣ�� ��� : " + o2.calc(22.0, 33.0));
	}
}
