package ch11.exception;

import java.util.Scanner;

public class _05_ThrowException {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			String name = readName();
			System.out.println("�ľ��� : " + name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		System.out.println("��������");
	}
	
	public static String readName() throws Exception {	// 2, ���� ó�� �̷�� throws
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.next();
		
		System.out.print("�̸��� �Է��ϼ���.");
		String name2 = sc.nextLine();
		System.out.println("sdfdfsfd" + name2);
		
		// 1. ���� ���� �߻� : throw new Exception();
		if(name.length() < 2) {
			throw new Exception("�̸��� 2�� �̻��Դϴ�.");
		} else {
			return name;
		}
	}
}
