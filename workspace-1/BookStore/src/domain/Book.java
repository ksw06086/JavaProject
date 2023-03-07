package domain;

import java.io.Serializable;

/**
 * ����
 * - Serializable(����ȭ) : �츮�� ���� Ŭ������ ���Ͽ� �аų� �� �� �ֵ��� �ϰų�, 
 * 									�ٸ� ������ �����ų� ���� �� �ֵ��� �� ��(JVM�� ��ü�� �����ϰų� �ٸ� ������ ������ �� �ֵ��� ����)
 * <������ �ϴٺ��� �Ʒ� ��찡 �߻��� �̷� �� �ʿ���>
 * 1) ������ ��ü�� ���Ϸ� ������ ���� ���� ���� ����
 * 2) ������ ��ü�� ���� ���� ���� �� ����
 * 3) �ٸ� �������� ������ ��ü�� ���� �ϵ� ���� �� ����
 * * ����ȭ : ��ü(�Ǵ� ������)�� �ܺ��� �ڹ� �ý��ۿ����� ����� �� �յ��� ����Ʈ ���·� ������ ��ȯ
 * * ������ȭ : ����Ʈ�� ��ȯ�� �����͸� �ٽ� ��ü�� ��ȯ�ϴ� ���
 * <> serialVersionUID ���� �������ִ� ���� ���� / ex) private static final long serialVersionUID = 362498820763181265L;
 * �� �̰� ���ָ� ���� �� 1) ���� ��ü �̸��̶� ��ȣ �ٸ��� �ٸ� ��ü�� �ν� 2) ���� ��ȣ�� ������ �ٸ��� �ٸ��� �ν�
 * <> ������ transient��� ���� ������ ���� �־��ָ� ����ȭ���� ���ܵ�
 * <> ��� : �θ� ����ȭ�� �ڽ��� �θ� ���� ����ȭ��, �θ� ���� �ڽĸ� ����ȭ�� �ڽ� �͸� ����ȭ��
 * <> ĳ���� ���� ���� Object ��ü�� ����ȭ �ش� ��ü�� �����ϸ� ������ ���� ��ü�� �����̱� ������
 * 
 * 
 * �ۼ��� : 2023.03.06.
 * �ۼ��� : �輱��
 * ���� : å ������ ȣ�� �뵵
 * **/
public class Book implements Serializable{
	// ����ȭ ��ü ��ȣ
	private static final long serialVersionUID = 100L;
	private static int serialCode = 1000;
	
	// ��� ����
	private String bookTitle; 						// å ����
	private String bookAuthor;					// å ����
	private int bookPrice;							// å ����
	private int bookCount;							// å ����
	private int bookCode;							// å �ڵ�
	
	// ������ : å ������ ����, ����, ����, ����, �ڵ� �Է�
	public Book(String bookTitle, String bookAuthor, int bookPrice, int bookCount, int bookCode) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookCount = bookCount;
		this.bookCode = bookCode;
	}

	public static int getCodeNumber() {
		return serialCode++;
	}

	// Getter, Setter
	// å ����
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	// å ����
	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	// å ����
	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	// å ����
	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public void addBookCount(int bookCount) {
		this.bookCount += bookCount;
	}
	public void subBookCount(int bookCount) {
		this.bookCount -= bookCount;
	}
	
	// å �ڵ�
	public int getBookCode() {
		return bookCode;
	}
	
	@Override
	public String toString() {
		return bookCode + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookPrice + "\t" + bookCount;
	}
	
	
}
