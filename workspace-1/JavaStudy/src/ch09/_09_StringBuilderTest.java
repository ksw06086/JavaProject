package ch09;

public class _09_StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� �� :" + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("���� �� buffer �ּ� �� : " + System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("���� �� buffer �ּ� �� : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� �� : " + System.identityHashCode(javaStr));
	}
}
