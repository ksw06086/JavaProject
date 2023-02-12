package exam._1003;

import java.util.Scanner;

/**
 * �Ǻ���ġ ���� ����Լ��� �θ� �� 0�� 1�� ���� ����� �θ�����
 * ��Ģ => 0, 1�� ������ �ش� ���� �Ǻ���ġ ���� ������ 2���� �� ��
 * **/
public class Main {
	// static int[] twoNum = {0,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rootNum = sc.nextInt();
		
		for(int i = 0; i < rootNum; i++) {
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println(1 + " " + 0);
			} else if (num == 1) {
				System.out.println(0 + " " + 1);
			} else {
				int result1 = 1;			// ���� ���������� 1�� �� ��
				int result2 = 1;			// ���� ������ ��
				
				for(int j = 0; j < num - 2; j++) {		// �Ǻ���ġ ���� ���ϱ�
					int temp = result1+result2;
					result1 = result2;
					result2 = temp;
				}
				
				System.out.println(result1 + " " + result2);
			}
			// fibonacci(sc.nextInt());
			// System.out.println(twoNum[0] + " " + twoNum[1]);
			// twoNum[0] = 0;	twoNum[1] = 0;
		}
	}
}
