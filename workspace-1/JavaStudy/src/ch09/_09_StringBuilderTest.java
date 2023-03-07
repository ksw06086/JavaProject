package ch09;

public class _09_StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 :" + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 주소 값 : " + System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("연산 후 buffer 주소 값 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr));
	}
}
