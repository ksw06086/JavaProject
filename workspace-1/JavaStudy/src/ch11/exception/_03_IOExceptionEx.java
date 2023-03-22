package ch11.exception;

import java.io.FileInputStream;

public class _03_IOExceptionEx {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("여기도 수행됩니다.");
	}
}
