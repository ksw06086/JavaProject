package ch02;

import java.util.Scanner;

public class _18_DoWhileEx {
	public static void main(String[] args) {
		// 메뉴 선택 : 'q'나 'Q'를 만나면 '종료' 출력
		Scanner sc = new Scanner(System.in);
		String num;
		do {
			System.out.println("메뉴 선택 : ");
			num = sc.next();
			System.out.println(num.length());
		} while((num.toUpperCase().charAt(0) != 'Q'));
		System.out.println("종료!");
	}
}