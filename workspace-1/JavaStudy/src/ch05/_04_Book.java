package ch05;

public class _04_Book {
	// �������
	private String bookName;				// å�̸�
	private String author;					// ����
	
	// ����Ʈ ������
	public _04_Book() {}
	// �Ű����� ������
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
		System.out.println("���� : " + bookName + ", ���� : " + author);
	}
	
}
