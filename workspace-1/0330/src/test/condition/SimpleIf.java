package test.condition;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자바성적 입력 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("우수한 성적입니다.");
		} else {
			System.out.println("좀 더 노력하면 좋은 결과를 얻을 수 있습니다.");
		}
		
		System.out.println("귀하의 "+ "성적은 " + score + "입니다.");
		
		
		
		
		
		
		sc.close();
	}
}
