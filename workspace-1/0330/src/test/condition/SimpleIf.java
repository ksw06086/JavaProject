package test.condition;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڹټ��� �Է� : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("����� �����Դϴ�.");
		} else {
			System.out.println("�� �� ����ϸ� ���� ����� ���� �� �ֽ��ϴ�.");
		}
		
		System.out.println("������ "+ "������ " + score + "�Դϴ�.");
		
		
		
		
		
		
		sc.close();
	}
}
