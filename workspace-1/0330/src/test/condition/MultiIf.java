package test.condition;

import java.util.Scanner;

public class MultiIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("성적 입력(-1:프로그램종료) : ");
			int score = sc.nextInt();
			if(score == -1) {
				System.out.println("프로그램이 종료됩니다.");
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
			
			System.out.printf("귀하의 성적은 %d점이므로 %c학점입니다.", score, result);
		}
		
		sc.close();
	}
}
