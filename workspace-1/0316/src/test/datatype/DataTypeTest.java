package test.datatype;

public class DataTypeTest {

	public static void main(String[] args) {
//		������ 
//		������
		byte b = 127; // -128~127
		short s = b; // ������(�ڵ�) ����ȯ
		int i = s + 5;
		long l = 1000000000;
		l = b;
		
//		�Ǽ���
		float f = 107.7f; // ����� ����ȯ
		f = (float)303.3; // ����� ����ȯ
		f = 100;
		f = 1; // �Ǽ��� ������ �����ϱ� ������ ������ ���̳� ������ ������ ���� ������ �� �ִ�.
		double d = f;
		d = 1000000;
		d = 22.777;
		d = 1;
		d = s;
		
//		������ ������ ���� ���� ����� ����ȯ�� �ʿ��ϴ�.
		int a1 = 55;
		int a2 = 33;
		double result = a1 / a2;
		System.out.println(result);
		result = a1 / (a2 * 1.0);
		System.out.println(result);
		System.out.printf("%.2f\n", result);
		
//		���ڰ� �ƴ� ��(Non-Numeric Type)
		char ch = 'T';
		ch = 65; // ������ ����ȯ
		System.out.println(ch);
		System.out.println(ch+7);
		System.out.println((char)(ch + 7));
		
		boolean bb = false;
		if(bb)
			System.out.println("boolean���� ���� true �� ���� ����˴ϴ�.");
	}
}
