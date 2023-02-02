package test.inheritance3;

public class ClsB extends ClsA {
	public ClsB() {
		System.out.println("ClsB() 기본 생성자 호출");
	}
	
	public ClsB(int a) {
		System.out.println("ClsB(int a) 기본 생성자 호출: " + a);
	}
}
