package ch11.exception;

import java.util.Scanner;

public class _06_ThrowException {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.println("¶±±¹ ¸ÔÀº È½¼ö : " + age + "¹ø ¸Ô¾úÀ½.");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	public static int readAge() throws ArithmeticException {
		System.out.println("¶±±¹ ¸î¹ø µå¼Ì½À´Ï±î? ");
		int age = sc.nextInt();
		if(age < 0) {
			throw new ArithmeticException("³ªÀÌ´Â 0¼¼ ÀÌ»óÀÔ´Ï´Ù.");
		} else {
			return age;
		}
	}
}
