package test.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("* ����(����,���������� ��) �Է� : ");
			int n1 = s.nextInt();
			System.out.print("* ����(����,������ ��) �Է� : ");
			int n2 = s.nextInt();
			
			int result = n1/n2;
			
			System.out.printf("%d / %d = %d\n", n1, n2, result);
		} catch(ArithmeticException e) {
			System.out.print("������ ���� 0�� �Է����� ������!");
		} catch(NullPointerException e) {
			System.out.print("������ ��ĳ�� ��ü�� �������� �ʾƼ� �Է��� �� �� �����ϴ�.");
		} catch(Exception e) {
			System.out.print("�Է��� �ݵ�� ������ �Է��ϼ���!");
		} finally {
			try {
				s.close();
			} catch(NullPointerException e) {
				System.out.print("������ ��ĳ�� ��ü�� �������� �ʾƼ� ���� �� �����ϴ�.");
			}
			
		}
	}
}
