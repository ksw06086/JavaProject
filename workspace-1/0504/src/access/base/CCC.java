package access.base;

public class CCC {
//	AccessBase(������ ���ϴ� Ŭ����)�� ���� ��Ű��
//	public �� �� ���� ����
	public void test() {
		AccessBase base = new AccessBase();
		base.a = 10;//public
		base.b = 20;//default
		base.c = 30;//protected
//		base.d = 40;//private�� ���� ��Ű���� ���� �Ұ���
	}
	
}
