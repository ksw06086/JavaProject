package domain;

/*
 * �ۼ��� : 2023.03.06.
 * �ۼ��� : �輱��
 * ���� : ����Լ� ȣ�� �� ��� �ڵ�� ��� �뵵
 * **/
public interface Code {
	// ���
	static final int SHOP_LOGIN = 999;							//  �α���
	
	// ������
	static final int HOST_MENU = 100;							// ������
	
	// ������ - ������
	static final int HOST_STOCK_MENU = 110;				// ������
	static final int HOST_BOOK_LIST = 111;					// å���
	static final int HOST_BOOK_ADD = 112;					// å�߰�
	static final int HOST_BOOK_UPDATE = 113;				// å����
	static final int HOST_BOOK_DEL = 114;						// å����
	
	// ������ - �ֹ�����
	static final int HOST_ORDER_MENU = 120;				// �ֹ�����
	static final int HOST_ORDER_LIST = 121;					// �ֹ����
	// ������ - �������
	static final int HOST_ORDER_CONFIRM = 122;			// ��������
	static final int HOST_ORDER_CANCEL = 123;			// �������
	// ������ - ���
	static final int HOST_SALE_TOTAL = 124;					// ���
	
	// �մ�
	static final int GUEST_MENU = 200;							// �մ�
	
	// �մ� - ��ǰ���
	static final int GUEST_GOODS_LIST = 210;				// ��ǰ���
	static final int GUEST_NOWBUY = 211;						// �ٷα���
	static final int GUEST_CART_ADD = 212;					// ��ٱ��� ���
	
	// �մ� - ��ٱ���
	static final int GUEST_CART_LIST = 220;					// ��ٱ���
	static final int GUEST_CART_DEL = 221;					// ��ٱ��� ����
	static final int GUEST_CART_BUY = 222; 					// ��ٱ��� ����
			
	static final int GUEST_REFUND = 230;						// ȯ��
	
	// ȸ������
	static final int GUEST_JOIN = 300;							// ȸ������
}
