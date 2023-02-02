package test.overloading;

public class RunOverTest2 {
	public static void main(String[] args) {
		OverLoadingTest2 o2 = new OverLoadingTest2();
		
		System.out.println("calc(22,33)호출 결과 : " + o2.calc(22, 33));
		System.out.println("calc(22.0,33.0)호출 결과 : " + o2.calc(22.0, 33.0));
	}
}
