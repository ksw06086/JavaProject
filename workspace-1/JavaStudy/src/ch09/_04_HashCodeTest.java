package ch09;

public class _04_HashCodeTest {
	public static void main(String[] args) {
		
		// Integer와 String의 equals와 hashCode 함수는 재정의 되어있다.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
