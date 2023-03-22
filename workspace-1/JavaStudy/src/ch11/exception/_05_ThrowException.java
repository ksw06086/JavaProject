package ch11.exception;

import java.util.Scanner;

public class _05_ThrowException {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			String name = readName();
			System.out.println("후아유 : " + name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		System.out.println("정상종료");
	}
	
	public static String readName() throws Exception {	// 2, 예외 처리 미루는 throws
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		
		System.out.print("이름을 입력하세요.");
		String name2 = sc.nextLine();
		System.out.println("sdfdfsfd" + name2);
		
		// 1. 강제 예외 발생 : throw new Exception();
		if(name.length() < 2) {
			throw new Exception("이름은 2자 이상입니다.");
		} else {
			return name;
		}
	}
}