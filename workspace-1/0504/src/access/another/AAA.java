package access.another;

import access.base.AccessBase;

public class AAA {
//	AccessBase(������ ���ϴ� Ŭ����)�� �ٸ� ��Ű��
//	public �� �� ���� ����
	public void test() {
		AccessBase base = new AccessBase();	
		base.a = 10;//public
//		base.b = 20;//default
//		base.c = 30;//protected
//		base.d = 40;//private�� ���� ��Ű���� ���� �Ұ���
	}
	
	
	
}
