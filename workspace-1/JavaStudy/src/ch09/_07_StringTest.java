package ch09;

public class _07_StringTest {
	public static void main(String[] args) {
		/*
		 * ���Ǯ
		 * ���ͷ��� *(���α׷��� ������ �� �ý��ۿ� ���� �ε�)�Ǿ Ư�� �޸� ������ ���Ǯ�� ����.
		 * ���ͷ� -> �ε� -> ���Ǯ -> ����/���� -> ����num
		 * ����, ����, ����			3,abc,boolean			3. int num = 3;
		 * 
		 * */
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "asdf";
		String str4 = "asdf";
		
		// ������ ���ƾ� true�� ����
		System.out.println(str3 == str4);
		
		// ���ο� ���ڰ� �Ǹ� �ּҰ� �޶�����.
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� �� : " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� �� : " + System.identityHashCode(javaStr));
	}
	
}
