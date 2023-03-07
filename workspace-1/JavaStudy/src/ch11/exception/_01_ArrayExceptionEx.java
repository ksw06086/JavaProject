package ch11.exception;

public class _01_ArrayExceptionEx {
	public static void main(String[] args) {
		/**
		 * 예외처리 목적 : 정상종료
		 * try{
		 * 	예외가 발생할 수 있는 코드 부분
		 * } catch(처리할 예외 타입 e) {
		 * 	try 블록 안에서 예외가 발생했을 때 예외를 처리하는 부분
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
			System.out.println("에러 발생");
		}
		System.out.println("종료");
	}
}
