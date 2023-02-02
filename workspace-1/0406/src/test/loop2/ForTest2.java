package test.loop2;

import java.util.Scanner;

public class ForTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("* 합계를 구할 마지막 숫자 입력(-1:종료): ");
			int lastNum = s.nextInt();
			int sum = 0;
			if(lastNum == -1) {
				break;
			}
			for (int i = 1; i < lastNum; i++) {
				sum += i;
			}
			
			System.out.println("1~" + lastNum + "까지의 합은 " + sum + "입니다.");
		}
		s.close();
	}
}
