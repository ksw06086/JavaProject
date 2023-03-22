package ch11.exception;

import java.util.Scanner;

public class _06_ThrowException {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.println("떡국 먹은 횟수 : " + age + "번 먹었음.");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	public static int readAge() throws ArithmeticException {
		System.out.println("떡국 몇번 드셨습니까? ");
		int age = sc.nextInt();
		if(age < 0) {
			throw new ArithmeticException("나이는 0세 이상입니다.");
		} else {
			return age;
		}
	}
}