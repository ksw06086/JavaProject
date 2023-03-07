package ch12.input;

import java.io.IOException;

public class _02_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		try {
			while (true) {
				int i = System.in.read();
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
