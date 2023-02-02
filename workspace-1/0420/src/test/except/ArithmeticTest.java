package test.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("* 정수(분자,나누어지는 수) 입력 : ");
			int n1 = s.nextInt();
			System.out.print("* 정수(분자,나누는 수) 입력 : ");
			int n2 = s.nextInt();
			
			int result = n1/n2;
			
			System.out.printf("%d / %d = %d\n", n1, n2, result);
		} catch(ArithmeticException e) {
			System.out.print("나누는 수는 0을 입력하지 마세요!");
		} catch(NullPointerException e) {
			System.out.print("참조할 스캐너 객체가 존재하지 않아서 입력을 할 수 없습니다.");
		} catch(Exception e) {
			System.out.print("입력은 반드시 정수로 입력하세요!");
		} finally {
			try {
				s.close();
			} catch(NullPointerException e) {
				System.out.print("참조할 스캐너 객체가 존재하지 않아서 닫을 수 없습니다.");
			}
			
		}
	}
}
