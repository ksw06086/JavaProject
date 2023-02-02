package test.except;

public class NumberFormatTest {
	public static void main(String[] args) {
		int num = Integer.parseInt("777a");
		System.out.println(num + 222);
	}
}
