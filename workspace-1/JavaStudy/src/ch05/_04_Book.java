package ch05;

public class _04_Book {
	// 멤버변수
	private String bookName;				// 책이름
	private String author;					// 저자
	
	// 디폴트 생성자
	public _04_Book() {}
	// 매개변수 생성자
	public _04_Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("제목 : " + bookName + ", 저자 : " + author);
	}
	
}
