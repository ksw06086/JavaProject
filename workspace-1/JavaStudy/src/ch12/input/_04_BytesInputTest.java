package ch12.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_BytesInputTest {
	public static void main(String[] args) {
		try {
			InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Dev50\\fileTest\\inputStream.txt"));
			while(true) {
				int i = in.read();
				if(i == -1) {
					System.out.println("출력완료");
					break;
				}
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}