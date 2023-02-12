package exam._1003;

import java.util.Scanner;

/**
 * 피보나치 수열 재귀함수를 부를 때 0과 1을 각각 몇번씩 부르는지
 * 규칙 => 0, 1의 개수가 해당 수의 피보나치 식의 마지막 2개의 수 임
 * **/
public class Main {
	// static int[] twoNum = {0,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rootNum = sc.nextInt();
		
		for(int i = 0; i < rootNum; i++) {
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println(1 + " " + 0);
			} else if (num == 1) {
				System.out.println(0 + " " + 1);
			} else {
				int result1 = 1;			// 식의 마지막에서 1번 전 수
				int result2 = 1;			// 식의 마지막 수
				
				for(int j = 0; j < num - 2; j++) {		// 피보나치 수열 구하기
					int temp = result1+result2;
					result1 = result2;
					result2 = temp;
				}
				
				System.out.println(result1 + " " + result2);
			}
			// fibonacci(sc.nextInt());
			// System.out.println(twoNum[0] + " " + twoNum[1]);
			// twoNum[0] = 0;	twoNum[1] = 0;
		}
	}
}
