package ch02;

import java.util.Scanner;

/*
 * ���� ���� �Է��ϰ� �ش� ���� �߸� �ԷµǾ����� ���� ��� �ƴϸ� ��� ����
 * */
public class _17_DoWhileEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		do {
			System.out.print("�Է��ϼ���[1~12] : ");
			month = sc.nextInt();
			System.out.println("�Է°� : " + month);
		} while((month < 13) && (month > 0));
		System.out.println(month + "���� �߸��� ���Դϴ�.");
	}
}
