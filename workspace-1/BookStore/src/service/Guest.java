package service;

/*
 * �ۼ��� : 2023.03.06.
 * �ۼ��� : �輱��
 * ���� : �� ���� ��ɸ���
 * **/
public interface Guest {
	// ��� �׽�Ʈ�� �� �α��� ������
	static String ID = "guest";					// �մ� ���� ID ����
	static String PASSWORD = "guest";		// �ճ� ���� PW ����
	
	// �մ� - ��ٱ��� ��Ͽ��� ����� ���
	boolean guestLogin();							// �α���
	void cartDel();										// ��ٱ��� ����
	void cartBuy();									// ��ٱ��� ����
	
	// �մ� - ��ǰ��Ͽ��� ����� ���
	void nowBuy();									// �ٷα���
	void cartAdd();										// ��ٱ��� �߰�
	
	void refund();										// ȯ��
	
	// ȸ������
	void guestJoin();									// ȸ������				
	void guestLogOut();								// �α׾ƿ�
}