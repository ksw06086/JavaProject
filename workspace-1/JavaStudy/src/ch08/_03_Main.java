package ch08;

public class _03_Main {
	public static void main(String[] args) {
		_03_MyClass mClass = new _03_MyClass();
		
		//  ������
		_03_XImpl x = mClass;
		x.x();
		
		System.out.println("-----------------------------");
		
		_03_YImpl y = mClass;
		y.y();
		
		System.out.println("-----------------------------");
		
		// ������ �������̽��� ������ �����ϸ� �������̽��� ����� ��� ���ҵ� ȣ�� ����
		_03_MyImpl my = mClass;
		my.myMethod();
		my.x();
		my.y();
	}
}
