package test.except;

public class ArrayIndexTest {
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		for (int i = 0; i <= nums.length; i++) {
			try {
				nums[i] = i+1;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� �ε��� ��ȣ�� ������ ������ϴ�.");
			}
		}
		
		
		
		
		
		
		
	}
}
