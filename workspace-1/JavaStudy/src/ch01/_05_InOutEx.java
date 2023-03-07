package ch01;

import java.util.Scanner;

public class _05_InOutEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름입력 : ");
		String name = scan.next();
		
		System.out.print("핸드폰 번호 입력 : ");
		String phoNo = scan.next();
		
		System.out.println("당신의 이름은 " + name + "이고, 핸드폰 번호는 " + phoNo + "입니다.");
		System.out.println("프로그램 종료~~~~");
		scan.close();
		
	}
}
