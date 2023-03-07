package ch09;

public class _01_Book {
	// ¸â¹öº¯¼ö
	private int bookNumber;
	private String bookTitle;
	
	public _01_Book() {}
	
	public _01_Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
}
