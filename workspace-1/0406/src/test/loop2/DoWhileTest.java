package test.loop2;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* �ݺ�Ƚ�� �Է� : ");
		int iterationNum = s.nextInt();
		
		int i = 0;
		do {
			System.out.println(i + 1 + "��° ���� �����.");
			i++;
		}while(i < iterationNum);
		s.close();
	}
}
