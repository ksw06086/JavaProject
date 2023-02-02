package test.except;

public class ArrayIndexTest {
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		for (int i = 0; i <= nums.length; i++) {
			try {
				nums[i] = i+1;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호가 범위를 벗어났습니다.");
			}
		}
		
		
		
		
		
		
		
	}
}
