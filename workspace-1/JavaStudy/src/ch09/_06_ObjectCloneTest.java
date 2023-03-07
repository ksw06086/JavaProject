package ch09;

public class _06_ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * Object�� clone() �޼ҵ�� Ŭ������ �ν��Ͻ��� ���� �����Ͽ� ������ ��
		 * ��������� ������ �ν��Ͻ��� �ٸ� �޸𸮿� ���� ������
		 * ��°�� �ν��Ͻ��� ������� ���� ����, �ּҰ��� �ٸ� copyCircle�� ������
		 * **/
		_06_Circle circle = new _06_Circle(10, 20, 30);
		
		// clone() �޼ҵ带 ����� circle �ν��Ͻ��� copyCircle�� ������
		_06_Circle copyCircle = (_06_Circle)circle.clone();
		
		// ������ x = 10, y = 20�̰�, �������� 30�Դϴ�.
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
	}
}
