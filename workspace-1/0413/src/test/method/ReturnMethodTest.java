package test.method;

public class ReturnMethodTest {
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
	
	public static void main(String[] args) {
		int n1 = 120;
		int n2 = 50;
		int result = sum(n1,n2);
		
		System.out.printf("%d + %d = %d\n",n1, n2, result);
	}
}
