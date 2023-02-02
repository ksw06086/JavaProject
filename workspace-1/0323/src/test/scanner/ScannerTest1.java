package test.scanner;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">> 주소 입력 : ");
		String add = sc.nextLine(); 
		// 사용자의 입력을 기다리다가 사용자가 문자를 입력하고 엔터키를 누르면 엔터키 
		// 직전까지 입력된 값을 클래스로 가져와서 메소드 호출한 자리에 반환
		
		System.out.print(">> 성명 입력 : ");
		String name = sc.nextLine();
		
		System.out.print(">> 좋아하는 사람 세 사람을 입력(한줄로) : ");
		String f1 = sc.next();
		String f2 = sc.next();
		String f3 = sc.next();
		
		System.out.println("# 주소 : " + add);
		System.out.println("# 성명 : " + name);
		System.out.printf("# 님이 좋아하는 사람들은 %s, %s, %s 입니다. ", f1, f2, f3);
		
		sc.close();
	}
}
