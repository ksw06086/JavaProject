package ch11.exception;

import java.util.Scanner;

public class _06_ThrowException {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.println("���� ���� Ƚ�� : " + age + "�� �Ծ���.");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	public static int readAge() throws ArithmeticException {
		System.out.println("���� ��� ��̽��ϱ�? ");
		int age = sc.nextInt();
		if(age < 0) {
			throw new ArithmeticException("���̴� 0�� �̻��Դϴ�.");
		} else {
			return age;
		}
	}
}
