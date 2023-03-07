package ch05;

public class _05_ArrayCopy {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		System.arraycopy(array, 0, array2, 0, 5);
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i] + " ");
		}
	}
}
