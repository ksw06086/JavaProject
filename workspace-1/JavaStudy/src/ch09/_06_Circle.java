package ch09;
														// ��Ŀ �������̽� ������ �޼ҵ尡 ����.
public class _06_Circle implements Cloneable{
	_06_Point point;
	int radius;
	
	public _06_Circle(int x, int y, int radius) {
		point = new _06_Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "������ " + point + "�̰�, �������� " + radius + "�Դϴ�."; 
	}
	
												// clone() ȣ�� �� Cloneable �������̽��� ���������� ������ ���� �߻�
	@Override								// Ŭ���� ������ ���� �ʾ��� �� ����
	public Object clone() throws CloneNotSupportedException {
		// Object�� clone() �޼ҵ尡 protected ���������ڷ� �վ �ٸ� Ŭ�������� �ٷ� ��� ����
		// Object Ŭ������ clone() �޼ҵ带 ȣ����
		return super.clone();
	}
}
