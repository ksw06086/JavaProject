package ch12.input;

import java.io.IOException;

public class _02_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������.");
		try {
			while (true) {
				int i = System.in.read();
				if(i == -1) {
					System.out.println("��¿Ϸ�");
					break;
				}
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
