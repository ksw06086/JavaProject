package domain;

import java.io.Serializable;

/**
 * 참고
 * - Serializable(직렬화) : 우리가 만든 클래스가 파일에 읽거나 쓸 수 있도록 하거나, 
 * 									다른 서버로 보내거나 받을 수 있도록 할 때(JVM이 객체를 저장하거나 다른 서버로 전송할 수 있도록 해줌)
 * <개발을 하다보면 아래 경우가 발생함 이럴 때 필요함>
 * 1) 생성한 객체를 파일로 저장할 일이 있을 수도 있음
 * 2) 저장한 객체를 읽을 일이 생길 수 있음
 * 3) 다른 서버에서 생성한 객체를 받을 일도 있을 수 있음
 * * 직렬화 : 객체(또는 데이터)를 외부의 자바 시스템에서도 사용할 수 잇도록 바이트 형태로 데이터 변환
 * * 역직렬화 : 바이트로 변환된 데이터를 다시 객체로 변환하는 기술
 * <> serialVersionUID 값을 지정해주는 것이 좋음 / ex) private static final long serialVersionUID = 362498820763181265L;
 * ㄴ 이걸 해주면 좋은 점 1) 같은 객체 이름이라도 번호 다르면 다른 객체로 인식 2) 같은 번호라도 내용이 다르면 다르게 인식
 * <> 변수에 transient라는 예약어를 접근자 전에 넣어주면 직렬화에서 제외됨
 * <> 상속 : 부모가 직렬화면 자식의 부모 값도 직렬화됨, 부모가 없고 자식만 직렬화면 자식 것만 직렬화됨
 * <> 캐스팀 되지 않은 Object 객체를 직렬화 해당 객체에 생성하면 에러가 생김 객체의 조상이기 때문에
 * 
 * 
 * 작성일 : 2023.02.06. / 2023.03.09
 * 작성자 : 김선우
 * 개요 : 책 데이터 호출 용도
 * **/
public class Book implements Serializable{
	// 직렬화 객체 번호
	private static final long serialVersionUID = 100L;
	private static int serialCode = 1000;
	
	// 멤버 변수
	private String bookTitle; 						// 책 제목
	private String bookAuthor;					// 책 저자
	private int bookPrice;							// 책 가격
	private int bookCount;							// 책 수량
	private int bookCode;							// 책 코드
	
	// 생성자 : 책 생성시 제목, 저자, 가격, 수량, 코드 입력
	public Book(String bookTitle, String bookAuthor, int bookPrice, int bookCount, int bookCode) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookCount = bookCount;
		this.bookCode = bookCode;
	}
	
	public Book(Book book) {
		this.bookTitle = book.getBookTitle();
		this.bookAuthor = book.getBookAuthor();
		this.bookPrice = book.getBookPrice();
		this.bookCount = book.getBookCount();
		this.bookCode = book.getBookCode();
	}

	public static int getCodeNumber() {
		return serialCode++;
	}

	// Getter, Setter
	// 책 제목
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	// 책 저자
	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	// 책 가격
	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	// 책 수량
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
	
	// 책 수량*가격(총 가격)
	public int getBookTotalPrice() {
		return (bookPrice * bookCount);
	}
	
	// 책 코드
	public int getBookCode() {
		return bookCode;
	}
	
	@Override
	public String toString() {
		return bookCode + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookPrice + "\t" + bookCount;
	}
	
	
}