package test;

public class AppCDInfo extends CDInfo implements Lendable{
	private String borrower = "";
	private int checkOutDate;
	private int state = 0;
	
	public AppCDInfo(int registerNo, String title) {
		super(registerNo, title);
	}
	
	// 대출
	@Override
	public void checkOut(String borrower, int checkOutDate) {
		// TODO Auto-generated method stub
		if(state == STATE_BORROWED) {
			System.out.println("이미 대출중입니다.");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_BORROWED;
		System.out.println("대출상태 : 대출중");
		System.out.println(getTitle() + "가 태출되었습니다.");
		System.out.println("대출인 : " + this.borrower);
		System.out.println("대출일 : " + this.checkOutDate);
	}
	
	// 반납
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		if(state == STATE_NORMAL) {
			System.out.println("반납할 수 없습니다.");
			return;
		}
		this.borrower = "";
		this.checkOutDate = 0; // String에서 int로 바꾸지 않음
		System.out.println("대출상태 : 반납중");
		state = STATE_NORMAL;
		System.out.println(getTitle() + "가 반납되었습니다.");
		System.out.println("대출상태 : 대출가능");
	}

	public String getBorrower() {
		return borrower;
	}

	public int getCheckOutDate() {
		return checkOutDate;
	}

	public int getState() {
		return state;
	}
	
	
	
}