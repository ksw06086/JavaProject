package test.loop2;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* 반복횟수 입력 : ");
		int iterationNum = s.nextInt();
		
		for (int i = 0; i < iterationNum; i++) {
			System.out.println(i+1+"번째 문장이 실행됨.");
		}
		
		s.close();
	}
}
