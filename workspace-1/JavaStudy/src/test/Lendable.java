package test;

public interface Lendable {
	int STATE_BORROWED = 1; // ������
	int STATE_NORMAL = 0; 		//�����
	
	void checkOut(String borrower, int checkOutDate);		// ����
	void checkIn();															// �ݳ�
}
