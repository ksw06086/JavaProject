package test.darr;

public class DynamicArrayTest {
	public static void main(String[] args) {
		int[] col = {2,3,1,7};
		int [][] arr = new int[col.length][];
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[col[i]];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++cnt;
			}
			
		}
		
//		Ãâ·Â
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
