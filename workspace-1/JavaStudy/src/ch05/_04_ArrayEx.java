package ch05;

public class _04_ArrayEx {
	public static void main(String[] args) {
		_04_Book library = new _04_Book("아기돼지 삼형제", " 늑대");
		library.showBookInfo();
		
		_04_Book[] books = new _04_Book[5];
		// 배열초기화
		books[0] = new _04_Book("10년 후", "조정래");
		books[1] = new _04_Book("적을 만들지 않는 대화법", "대화자");
		books[2] = new _04_Book("미움받을 용기", "모름");
		books[3] = new _04_Book("마음의 주인", "이기주");
		books[4] = new _04_Book("언어의 온도", "이기주");
		
		// 주소값 호출
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
		// 값 호출
		for(int i = 0; i < books.length; i++) {
			books[i].showBookInfo();
		}
	}
}