package test.inheritance3;

public class ClsC extends ClsB {
	public ClsC() {
		System.out.println("ClsC() �⺻ ������ ȣ��");
	}
	
	public ClsC(int a) {
		super(10);
		System.out.println("ClsC(int a) �⺻ ������ ȣ��: " + a);
	}
}
