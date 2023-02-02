package test.inheritance3;

public class ClsC extends ClsB {
	public ClsC() {
		System.out.println("ClsC() 기본 생성자 호출");
	}
	
	public ClsC(int a) {
		super(10);
		System.out.println("ClsC(int a) 기본 생성자 호출: " + a);
	}
}
