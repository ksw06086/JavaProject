package ch05;

public class _06_ArrayCopy {
	public static void main(String[] args) {
		// 얕은 복사 : 객체 배열을 복사하면 항상 인스턴스 주소가 복사되어 동일하므로, 원래의 배열값이 변경시 copy된 배열의 값도 변경된다.
		// System.arraycopy(복사할 배열, 복사할 첫 위치, 대상 배열, 붙여넣을 첫 위치, 복사할 요소 갯수);
		// 선언 및 생성
		_04_Book[] book = new _04_Book[3];
		_04_Book[] book2 = new _04_Book[3];
		
		// 배열 초기화
		book[0] = new _04_Book("10년 후", "조정래");
		book[1] = new _04_Book("적을 만들지 않는 대화법", "대화자");
		book[2] = new _04_Book("미움받을 용기", "모름");
		
		// 얕은 복사
		System.arraycopy(book, 0, book2, 0, 3);
		
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