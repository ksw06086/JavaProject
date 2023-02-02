package test.array;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = new int[10];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		
		System.out.println();
		// 배열 초기화
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i+1;
		}
		// 배열 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		
		
	}
}
