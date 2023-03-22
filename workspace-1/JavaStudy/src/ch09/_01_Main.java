package ch09;

public class _01_Main {
	public static void main(String[] args) {
		// 매개변수 생성자
		_01_Book book = new _01_Book(100, "아주 작은 외딴 섬");
		System.out.println(book);
		
		System.out.println(book.toString());
	}
}
