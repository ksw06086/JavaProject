package test.circle;

public class RunCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setR(5);
		c1.calcCircum();
		c1.calcArea();
		
		c2.setR(12);
		c2.calcCircum();
		c2.calcArea();
		
		System.out.printf("�������� %d���� ���� �ѷ��� %.2f���Դϴ�.\n", c1.getR(), c1.getCircum());
		System.out.printf("�������� %d���� ���� �ѷ��� %.2f���ϴ�.\n", c1.getR(), c1.getArea());
		
		System.out.printf("�������� %d���� ���� �ѷ��� %.2f���Դϴ�.\n", c2.getR(), c2.getCircum());
		System.out.printf("�������� %d���� ���� �ѷ��� %.2f���ϴ�.\n", c2.getR(), c2.getArea());
		
		
	}
}

// �߰���� 30%

// 1. �������
// - 1~4�� ���α׷� 4-3����
// - 11���� => 1~3���� 10���� 4�� 1���� 10��
// - total 30��
// - �������� : 10������ - ������, �ܴ��, ª�� ������
// - TV �Ǵ� Circle�� ��ü���� ����� ����Ͽ� �����ϴ� ����
// - ���� ������ ���������� �÷��� �� �ű⿡���� ������ ���� �� �ٸ� ������ ������ ����


