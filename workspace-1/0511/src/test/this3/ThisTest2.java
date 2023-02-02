package test.this3;

public class ThisTest2 {
	public ThisTest2() {
		// TODO Auto-generated method stub
		System.out.println("ThisTest3() 기본생성자가 호출됨");
	}
	
	public ThisTest2(int n) {
		System.out.println("ThisTest3(int n) 생성자 호출됨 : " + n);
	}
	
	public static void main(String[] args) {
		new ThisTest2();
	}
}
