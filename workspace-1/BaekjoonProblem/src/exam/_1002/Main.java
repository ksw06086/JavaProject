package exam._1002;

import java.util.Scanner;

/**
 * 
 * <�� ���� ������ ���� - ����� ��>
 * 1) �� ������ ���� : r'-r < d < r'+r
 * *(r' > r), *�� < d < ��
 * 2) �� ������ ����
 * (1) ���� : r'+r = d			(2) ���� : |r'-r| = d
 * 3) ������ �ʴ� ���
 * (1) �ܺο��� : d > r' + r		(2) ���ο��� : d < |r'-r|
 * 4) ������ ���� : d = 0 and r' = r
 * 
**/
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rootNum = sc.nextInt();
		int x1, x2, y1, y2, r1, r2;
		
		for (int i = 0; i < rootNum; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			int w = x1-x2;
			int h = y1-y2;
			int maxR = (r1 > r2) ? r1 : r2;
			int minR = (r1 > r2) ? r2 : r1;
			
			double d = Math.sqrt((w*w+h*h));
			
			if(maxR == minR && d == 0.0) {														// ������ ���� ���� ���� ��
				System.out.println(-1);
			}else if(maxR-minR < d && d < maxR + minR) {								// �� ������ ������ ��
				System.out.println(2);
			} else if(maxR+minR == d || Math.abs(maxR-minR) == d) {			// �� ������ ������ ��
				System.out.println(1);
			} else if(maxR+minR < d || Math.abs(maxR-minR) > d) {				// �ϳ��� ������ ���� ��
				System.out.println(0);
			}
			
		}
	}
}
