package exam._1002;

import java.util.Scanner;

/**
 * 
 * <두 원의 접점의 개수 - 경우의 수>
 * 1) 두 점에서 만남 : r'-r < d < r'+r
 * *(r' > r), *차 < d < 합
 * 2) 한 점에서 만남
 * (1) 외접 : r'+r' = d			(2) 내접 : |r'-r| = d
 * 3) 만나지 않는 경우
 * (1) 외부에서 : d > r' + r		(2) 내부에서 : d < |r'-r|
 * 4) 무수히 많음 : d = 0 and r' = r
 * 
**/
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rootNum = sc.nextInt();
		int x1, x2, y1, y2, r1, r2;
		
		for (int i = 0; i < rootNum; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			int w = x1-x2;
			int h = y1-y2;
			
			// 더 해야함
			
		}
	}
}
