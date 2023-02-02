package test.array;

import java.util.Scanner;

public class ScoreTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* 학생수 입력 : ");
		int count = s.nextInt();
		String[] subject = {"Java", "Linux", "PHP", "DB", "C++"};
		int[][] score = new int[count][subject.length];
		int[] sum = new int[count];
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("[ 학생 " + (i+1) + "성적 입력]");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("* %s 성적 입력 : ", subject[j]);
				score[i][j] = s.nextInt();
				sum[i] += score[i][j];
			} 
			
		}
		
		
		for (int i = 0; i < count; i++) {
			double avg = (double)sum[i]/subject.length;
			System.out.print("학생 "+(i+1)+" :: ");
			for (int j = 0; j < subject.length; j++) {
				System.out.printf("%s : %d ", subject[j],score[i][j]);
			}
			System.out.printf("\n합계 : %d점, 평균 : %.2f점\n", sum[i], avg);
		}
		
		s.close();
	}
}
