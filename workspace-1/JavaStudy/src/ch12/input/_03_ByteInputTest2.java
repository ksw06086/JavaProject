package ch12.input;

import java.io.IOException;

public class _03_ByteInputTest2 {
	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������.");
		try {
			int i;
			while((i = System.in.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
