package test.loop2;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* 반복횟수 입력 : ");
		int iterationNum = s.nextInt();
		
		int i = 0;
		do {
			System.out.println(i + 1 + "번째 문장 실행됨.");
			i++;
		}while(i < iterationNum);
		s.close();
	}
}
