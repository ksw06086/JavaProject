package test.condition;

import java.util.Scanner;

public class MultiIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� �Է�(-1:���α׷�����) : ");
			int score = sc.nextInt();
			if(score == -1) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}
			
			char result = 0;
			
			if(score >= 90) {
				result = 'A';
			} else if(score >= 80) {
				result = 'B';
			} else if(score >= 70) {
				result = 'C';
			} else if(score >= 60) {
				result = 'D';
			} else {
				result = 'F';
			}
			
			System.out.printf("������ ������ %d���̹Ƿ� %c�����Դϴ�.", score, result);
		}
		
		sc.close();
	}
}
