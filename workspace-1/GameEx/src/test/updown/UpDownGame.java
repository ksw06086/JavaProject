package test.updown;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	
	public static void gameStart() {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean isSuccess = false;//7������ ���ߴ��� Ȯ���ϱ� ���� ����
		int restart;		
		
		// ���ѷ����� ���� ����
		while (true) {
			// 1~100 ������ ��������
			int computerNum = random.nextInt(10000) % 100 + 1;
			// ���� ���ӽÿ��� �ּ�ó�� �ϼ���. Ȯ�ο��Դϴ�.
			System.out.println("��ǻ�Ͱ� ������ ����:"+ computerNum);
			// ������ 7�� ����
			for (int i = 1; i <= 7; i++) {
				System.out.print("1~100���� ���ڸ� �Է��ϼ���:");
				int userNum = scanner.nextInt();
					
				// �� & �ٿ� �Ǵ��� ���
				if (userNum > computerNum) {
					System.out.println("Down, �� ���� �����Դϴ�.");
				}
				else if (userNum < computerNum) {
					System.out.println("Up, �� ���� �����Դϴ�.");
				}
				else {
					//���ڰ� ��ġ�ϸ� ����
					System.out.println("��ġ�մϴ�.");
					System.out.println(i+"�� �ȿ� �����߽��ϴ�.");
					System.out.println("-----------------------");					
					//������ true�� ���� 
					isSuccess = true;					
					//for�� Ż��
					break;					 
				}
			}
			
			//7������ ������ ���� ��� ���и� ���
			if(isSuccess == false) {
				System.out.println("����");
			}
			
			//�ѹ��� ������ ������ ����� ���� Ȯ��
			while(true) {
				System.out.println("-----------------------");
				System.out.println("���������(1), ����(0) ");
				System.out.print("����ۿ��θ� �Է��ϼ���:");
				restart = scanner.nextInt();
				// 0,1 �� �ԷµǾ����� Ż��
				if (restart == 0) {
					return;
				} 
				else if (restart == 1) {
					System.out.println("���� �����!");
					break;
				} 
				else {
					System.out.println("�߸��Է��ؾ�..");						
				}
			}	 
		}// while end		
	}// gameStart end
	
	public static void main(String[] args) {
		//���α׷��� ����Ǹ� ��� �޼��� ȣ��
		gameStart();		
	}
}
