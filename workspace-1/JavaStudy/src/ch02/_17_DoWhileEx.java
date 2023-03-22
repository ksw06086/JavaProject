package ch02;

import java.util.Scanner;

/*
 * 월을 먼저 입력하고 해당 월이 잘못 입력되었으면 오류 출력 아니면 계속 진행
 * */
public class _17_DoWhileEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		do {
			System.out.print("입력하세요[1~12] : ");
			month = sc.nextInt();
			System.out.println("입력값 : " + month);
		} while((month < 13) && (month > 0));
		System.out.println(month + "월은 잘못된 월입니다.");
	}
}