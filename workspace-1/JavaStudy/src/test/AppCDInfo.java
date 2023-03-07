package test;

public class AppCDInfo extends CDInfo implements Lendable{
	private String borrower = "";
	private int checkOutDate;
	private int state = 0;
	
	public AppCDInfo(int registerNo, String title) {
		super(registerNo, title);
	}
	
	// ����
	@Override
	public void checkOut(String borrower, int checkOutDate) {
		// TODO Auto-generated method stub
		if(state == STATE_BORROWED) {
			System.out.println("�̹� �������Դϴ�.");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_BORROWED;
		System.out.println("������� : ������");
		System.out.println(getTitle() + "�� ����Ǿ����ϴ�.");
		System.out.println("������ : " + this.borrower);
		System.out.println("������ : " + this.checkOutDate);
	}
	
	// �ݳ�
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		if(state == STATE_NORMAL) {
			System.out.println("�ݳ��� �� �����ϴ�.");
			return;
		}
		this.borrower = "";
		this.checkOutDate = 0; // String���� int�� �ٲ��� ����
		System.out.println("������� : �ݳ���");
		state = STATE_NORMAL;
		System.out.println(getTitle() + "�� �ݳ��Ǿ����ϴ�.");
		System.out.println("������� : ���Ⱑ��");
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
