package ch05;

public class _08_EnHancedFor {
	public static void main(String[] args) {
		/*
		 * ���� for��
		 * - �迭��� ���� ������� �ϳ��� �����ͼ� ������ ������
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
