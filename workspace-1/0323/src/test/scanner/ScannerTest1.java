package test.scanner;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">> �ּ� �Է� : ");
		String add = sc.nextLine(); 
		// ������� �Է��� ��ٸ��ٰ� ����ڰ� ���ڸ� �Է��ϰ� ����Ű�� ������ ����Ű 
		// �������� �Էµ� ���� Ŭ������ �����ͼ� �޼ҵ� ȣ���� �ڸ��� ��ȯ
		
		System.out.print(">> ���� �Է� : ");
		String name = sc.nextLine();
		
		System.out.print(">> �����ϴ� ��� �� ����� �Է�(���ٷ�) : ");
		String f1 = sc.next();
		String f2 = sc.next();
		String f3 = sc.next();
		
		System.out.println("# �ּ� : " + add);
		System.out.println("# ���� : " + name);
		System.out.printf("# ���� �����ϴ� ������� %s, %s, %s �Դϴ�. ", f1, f2, f3);
		
		sc.close();
	}
}
