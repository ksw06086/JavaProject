package ch01;

import java.util.Scanner;

public class _05_InOutEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��Է� : ");
		String name = scan.next();
		
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phoNo = scan.next();
		
		System.out.println("����� �̸��� " + name + "�̰�, �ڵ��� ��ȣ�� " + phoNo + "�Դϴ�.");
		System.out.println("���α׷� ����~~~~");
		scan.close();
		
	}
}
