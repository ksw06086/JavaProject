package test;

public interface Lendable {
	int STATE_BORROWED = 1; 	// 대출중
	int STATE_NORMAL = 0; 		// 반납중
	
	void checkOut(String borrower, int checkOutDate);	// 대출
	void checkIn();															// �ݳ�
}
