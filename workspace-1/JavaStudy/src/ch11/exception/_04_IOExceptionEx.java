package ch11.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_IOExceptionEx {
	public static void main(String[] args) {
		FileInputStream fis = null; 	// ����
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
			System.out.println("finally �����̹Ƿ� �׻� ����˴ϴ�.");
		}
		System.out.println("���⵵ ����˴ϴ�.");	// return�� ���� ��� �ȵ�
	}
}
