package ch05;

import java.util.Scanner;

public class _10_TwoArray {
	public static void main(String[] args) {
		/**
		 * *** 성적표 ***
		 * ===================
		 * 번호 국어 영어 수학 총점 평균
		 * ===================
		 * 1		100 100 100 300 100
		 * 2        90   90   90
		 * 3        80   80   80
		 * 4        70   70   70
		 * 5        60   60   60
		 * ===================
		 * 합계 : 400  400  400
		 * 평균 : 소수점 이하 둘째자리
		 * scores 2차원 배열 : 국, 영, 수
		 * 총점, 평균, 과목합계는 직접계산
		 * */
		int[][] scores = new int[5][3];
		int[] GwamokTotal = new int[3];
		float[] GwamokAvg = new float[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.print(i+1 + "번의 국어점수 : ");
			scores[i][0] = sc.nextInt();
			GwamokTotal[0] += scores[i][0];
			System.out.print(i+1 + "번의 영어점수 : ");
			scores[i][1] = sc.nextInt();
			GwamokTotal[1] += scores[i][1];
			System.out.print(i+1 + "번의 수학점수 : ");
			scores[i][2] = sc.nextInt();
			GwamokTotal[2] += scores[i][2];
		}
		System.out.println("*** 성적표 ***");
		System.out.println("=====================");
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=====================");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(i + "   ");
			System.out.print(scores[i][0] + "   ");
			System.out.print(scores[i][1] + "   ");
			System.out.print(scores[i][2] + "   ");
			System.out.print((scores[i][0]+scores[i][1]+scores[i][2]) + "   ");
			System.out.println((scores[i][0]+scores[i][1]+scores[i][2])/scores[i].length);
		}
		System.out.println("=====================");
		System.out.println("합계 : " + GwamokTotal[0] + "  " + GwamokTotal[1] + "  " + GwamokTotal[2] + "  ");
		System.out.print("평균 : ");
		for(int i = 0; i<GwamokTotal.length; i++) {
			System.out.printf("%.2f  ", GwamokTotal[i]/(scores.length * 1.0));
		}
		
	}
}