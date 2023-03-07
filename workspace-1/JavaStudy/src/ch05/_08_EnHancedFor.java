package ch05;

public class _08_EnHancedFor {
	public static void main(String[] args) {
		/*
		 * 향상된 for문
		 * - 배열요소 값을 순서대로 하나씩 가져와서 변수에 대입함
		 * */
		String[] langArray = {"java", "jsp", "spring", "Android", "Python"};
		
		for(String lang : langArray) {
			System.out.println(lang);
		}
		System.out.println();
		
		int[] numArray = {1,2,3,4,5,6,7,8,9,10};
		for(int num : numArray) {
			System.out.println(num);
		}
		
	}
}
