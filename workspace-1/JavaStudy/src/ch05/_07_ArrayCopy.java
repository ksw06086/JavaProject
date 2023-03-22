package ch05;

public class _07_ArrayCopy {
	public static void main(String[] args) {
		// 깊은 복사 : 직접 인스턴스를 만들고 값을 복사해야 한다.
		// 배열 선언 및 생성
		_04_Book[] book = new _04_Book[3];
		_04_Book[] book2 = new _04_Book[3];
		
		// 배열 초기화
		book[0] = new _04_Book("10년 후", "조정래");
		book[1] = new _04_Book("적을 만들지 않는 대화법", "대화자");
		book[2] = new _04_Book("미움받을 용기", "모름");
		
		// 추가 시작
		// 디폴트 생성자로 book2 배열 인스턴스 생성
		book2[0] = new _04_Book();
		book2[1] = new _04_Book();
		book2[2] = new _04_Book();
		for(int i = 0; i<book2.length; i++) {
			book2[i].setBookName(book[i].getBookName());
			book2[i].setAuthor(book[i].getAuthor());
		}
		// 추가 종료
		
		System.out.println("=== 변경 전 book2 ===");
		for(int i = 0; i < book2.length; i++) {
			book2[i].showBookInfo();
		}
		
		// book의 값을 변경
		System.out.println("=== 변경 후 book ===");
		book[0].setBookName("아낌없이 주는 나무");
		book[1].setAuthor("나무받은 사람");
		for(int i = 0; i < book.length; i++) {
			book[i].showBookInfo();
		}
		
		System.out.println("=== 변경 후 book2 ===");
		for(int i = 0; i < book2.length; i++) {
			book2[i].showBookInfo();
		}
	}
}