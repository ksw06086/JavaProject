package ch02;

import java.util.Scanner;

public class _18_DoWhileEx {
	public static void main(String[] args) {
		// �޴� ���� : 'q'�� 'Q'�� ������ '����' ���
		Scanner sc = new Scanner(System.in);
		String num;
		do {
			System.out.println("�޴� ���� : ");
			num = sc.next();
			System.out.println(num.length());
		} while((num.toUpperCase().charAt(0) != 'Q'));
		System.out.println("����!");
	}
}
