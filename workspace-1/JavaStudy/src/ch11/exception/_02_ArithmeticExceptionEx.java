package ch11.exception;

import java.util.Scanner;

public class _02_ArithmeticExceptionEx {
	public static void main(String[] args) {
		System.out.println("=== �ΰ��� ������ �Է� ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		try {
			System.out.println("�� : " + (num1/num2));
			System.out.println("������ : " + (num1%num2));
		} catch (Exception e) {
			System.out.println("����� ¯ ���ڴ�!!!!!!!!!!!!");
			System.out.println(e.getMessage());
		}
		System.out.println("��������");
	}
}
