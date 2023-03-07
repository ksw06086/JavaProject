package domain;

/*
 * <������>
 * *** ��������� �ϴ� �Ͱ� ������ Ŭ���� �ϴ� �Ϳ� ������ ***
 * - DAY �������̽��� monday = 1
 * - MONTH �������̽��� january = 1
 * �� ��� : ���� �ٸ� ������ ����� ���ϸ� �ȵ� 
 * �� ������ �� ���� ������ �� ������ ���� ���� -> ��ü�� �����ϰ� ���־ �ϸ� switch�� ������ ����
 * (����)
 * 1) �ڵ尡 �ܼ������� �������� ����
 * 2) �ν��Ͻ� ������ ����� ������
 * 3) Ű���� enum�� ����ϱ� ������ ������ �ǵ��� �������� �и��ϰ� ��Ÿ�� �� ����
 * 
 * **/
/*
 * �ۼ��� : 2023.03.06.
 * �ۼ��� : �輱��
 * ���� : ����Լ� ȣ�� �� ��� �ڵ�� ��� �뵵
 * **/
public enum MenuList {
	
	SHOP_LOGIN, 									// ����ȭ��(�α���)
	
	// ������ 
	HOST_MENU,									// ������ ���θ޴�

	HOST_STOCK_MENU, 						// ������
	HOST_BOOK_LIST,							// å���
	HOST_BOOK_ADD,							// å�߰�
	HOST_BOOK_UPDATE,						// å����
	HOST_BOOK_DEL,							// å����
	
	HOST_ORDER_MENU,						// �ֹ�����
	HOST_ORDER_LIST,							// �ֹ����

	HOST_ORDER_CONFIRM,					// ��������
	HOST_ORDER_CANCEL,					// �������

	HOST_SALE_TOTAL,							// ���
	
	// ��
	GUEST_MENU,									// �� ���θ޴�

	GUEST_GOODS_LIST,						// ��ǰ���
	GUEST_NOWBUY,							// �ٷα���
	GUEST_CART_ADD,							// ��ٱ��� ���

	GUEST_CART_LIST,							// ��ٱ��� 
	GUEST_CART_DEL,							// ��ٱ��� ����
	GUEST_CART_BUY,							// ��ٱ��� ����
	
	GUEST_REFUND,								// ȯ��
	
	// ȸ������
	GUEST_JOIN									// ȸ������
	;
	
	
	/*
	 * <�������� ���� �־��� ��>
	 * SHOP_LOGIN("����ȭ��");
	 * 
	 * private final String value;
	 * 
	 * MenuList(String value) { this.value = value; }
	 * 
	 * public String getValue() { return value; }
	 */
}
