package test.loop2;

import java.util.Scanner;

public class ForTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("* �հ踦 ���� ������ ���� �Է�(-1:����): ");
			int lastNum = s.nextInt();
			int sum = 0;
			if(lastNum == -1) {
				break;
			}
			for (int i = 1; i < lastNum; i++) {
				sum += i;
			}
			
			System.out.println("1~" + lastNum + "������ ���� " + sum + "�Դϴ�.");
		}
		s.close();
	}
}
