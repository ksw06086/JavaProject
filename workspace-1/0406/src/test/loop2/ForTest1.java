package test.loop2;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* �ݺ�Ƚ�� �Է� : ");
		int iterationNum = s.nextInt();
		
		for (int i = 0; i < iterationNum; i++) {
			System.out.println(i+1+"��° ������ �����.");
		}
		
		s.close();
	}
}
