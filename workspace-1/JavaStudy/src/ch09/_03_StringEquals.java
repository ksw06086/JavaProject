package ch09;

public class _03_StringEquals {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1.equals(str2));
		
	}
}
