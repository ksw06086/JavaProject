package test.array;

import java.util.Scanner;

public class ScoreTest1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] subject = {"Java", "Linux", "PHP", "DB", "C++"};
		int[] score = new int[subject.length];
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("* %s 성적 입력 : ", subject[i]);
			score[i] = s.nextInt();
			sum += score[i];
		}
		
		double avg = (double)sum/subject.length;
		
		for (int j = 0; j < score.length; j++) {
			System.out.printf("%s : %d ", subject[j],score[j]);
			
		}
		
		System.out.printf("\n합계 : %d점, 평균 : %.2f점", sum, avg);
		
		s.close();
	}
}
