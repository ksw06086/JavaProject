package ch11.exception;

import java.util.Scanner;

public class _02_ArithmeticExceptionEx {
	public static void main(String[] args) {
		System.out.println("=== 두개의 정수를 입력 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값 입력 : ");
		int num2 = sc.nextInt();
		try {
			System.out.println("몫 : " + (num1/num2));
			System.out.println("나머지 : " + (num1%num2));
		} catch (Exception e) {
			System.out.println("장원영 짱 예쁘다!!!!!!!!!!!!");
			System.out.println(e.getMessage());
		}
		System.out.println("정상종료");
	}
}
