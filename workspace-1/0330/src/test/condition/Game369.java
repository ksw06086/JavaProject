package test.condition;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 369 Game ========");
		System.out.print("1~100사이 숫자 입력 : ");
		int score = sc.nextInt();

		if(score > 100) {
			System.out.println("1부터 100까지의 정수 값을 입력해야만 합니다.");
		} else if((score%10)%3 == 0 || ((score/10)%3 == 0 && score/10 > 0)) {
			System.out.println("박수 짝!");
		} else {
			System.out.println(score);
		}
		
		sc.close();
		
	}
}
