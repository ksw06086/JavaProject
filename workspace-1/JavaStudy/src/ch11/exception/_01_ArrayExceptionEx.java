package ch11.exception;

public class _01_ArrayExceptionEx {
	public static void main(String[] args) {
		/**
		 * ����ó�� ���� : ��������
		 * try{
		 * 	���ܰ� �߻��� �� �ִ� �ڵ� �κ�
		 * } catch(ó���� ���� Ÿ�� e) {
		 * 	try ��� �ȿ��� ���ܰ� �߻����� �� ���ܸ� ó���ϴ� �κ�
		 * } finally {
		 * 
		 * }
		 * */
		try {
			int [] array = new int[5];
			for (int i = 0; i <= array.length; i++) {
				array[i] = i;
				System.out.println(array[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("���� �߻�");
		}
		System.out.println("����");
	}
}
