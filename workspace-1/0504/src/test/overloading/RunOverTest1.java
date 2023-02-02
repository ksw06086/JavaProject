package test.overloading;

public class RunOverTest1 {
	public static void main(String[] args) {
		OverLoadingTest1 o1 = new OverLoadingTest1();
		
		System.out.println("calc(5,7)호출 결과 : " + o1.calc(5, 7));
		System.out.println("calc(3, 5,7)호출 결과 : " + o1.calc(3, 5, 7));
	}
}
