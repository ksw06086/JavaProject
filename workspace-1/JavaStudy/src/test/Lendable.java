package test;

public interface Lendable {
	int STATE_BORROWED = 1; // 대출중
	int STATE_NORMAL = 0; 		//비대출
	
	void checkOut(String borrower, int checkOutDate);		// 대출
	void checkIn();															// 반납
}
