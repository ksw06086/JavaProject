package test.condition;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 369 Game ========");
		System.out.print("1~100���� ���� �Է� : ");
		int score = sc.nextInt();

		if(score > 100) {
			System.out.println("1���� 100������ ���� ���� �Է��ؾ߸� �մϴ�.");
		} else if((score%10)%3 == 0 || ((score/10)%3 == 0 && score/10 > 0)) {
			System.out.println("�ڼ� ¦!");
		} else {
			System.out.println(score);
		}
		
		sc.close();
		
	}
}
