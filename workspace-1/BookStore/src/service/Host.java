package service;

/*
 * �ۼ��� : 2023.02.10.
 * �ۼ��� : �輱��
 * ���� : ������ ���� ��ɸ���
 * **/
public interface Host {
	// ��� �׽�Ʈ�� ������ �α��� ������
	static String ID = "host";								// ������ ����ID ����
	static String PASSWORD = "host";				// ������ ����PW ����
	
	// �α���
	boolean hostLogin();
	
	// ������ - ������
	void bookList();											// å���
	void bookAdd();											// å�߰�
	void bookUpdate();										// å����
	void bookDel();											// å����
	
	// ������ - �ֹ�����
	void orderList();												// �ֹ����
	void orderConfirm();										// ��������
	void orderCancel();											// �������
	void saleTotal();												// ���
}
