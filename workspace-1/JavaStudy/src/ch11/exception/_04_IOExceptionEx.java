package ch11.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_IOExceptionEx {
	public static void main(String[] args) {
		FileInputStream fis = null; 	// 선언
		try {
			fis = new FileInputStream("a.txt");
		} catch (Exception e) {
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println("finally 문장이므로 항상 수행됩니다.");
		}
		System.out.println("여기도 수행됩니다.");	// return에 의해 출력 안됨
	}
}
