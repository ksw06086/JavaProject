package ch09;

public class _07_StringTest {
	public static void main(String[] args) {
		/*
		 * 상수풀
		 * 리터럴은 *(프로그램이 시작할 때 시스템에 같이 로딩)되어서 특정 메모리 공간인 상수풀에 들어간다.
		 * 리터럴 -> 로딩 -> 상수풀 -> 대입/복사 -> 변수num
		 * 숫자, 문자, 논리값			3,abc,boolean			3. int num = 3;
		 * 
		 * */
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "asdf";
		String str4 = "asdf";
		
		// 값까지 같아야 true가 나옴
		System.out.println(str3 == str4);
		
		// 새로운 문자가 되면 주소가 달라진다.
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr));
	}
	
}
