package domain;

import java.util.HashMap;

/*
 * �ۼ��� : 2023.03.06.
 * �ۼ��� : �輱��
 * ���� : �ֹ�(���Ž��ο�û) ��� ������ ȣ�� �뵵
 * **/
public class Order {
	// ����ȭ ��ü ��ȣ
	private static final long serialVersionUID = 400L;
	
	// id�� �ֹ�(���Ž��ο�û)�� å ��� 
	public static HashMap<String, HashMap<Integer, Book>> idOrderList = new HashMap<String, HashMap<Integer,Book>>();
	
	// ������
	public Order() {}
	
	// ID�� ���� ������ �ش� ID�� �ֹ��ٱ��� ����
	public static HashMap<Integer, Book> getOrderList(){
		return new HashMap<Integer, Book>();
	}
}
