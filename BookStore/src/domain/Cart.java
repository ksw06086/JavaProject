package domain;

import java.io.Serializable;
import java.util.HashMap;

/*
 * �ۼ��� : 2023.02.06.
 * �ۼ��� : �輱��
 * ���� : ��ٱ��� ��� ������ ȣ�� �뵵
 * **/
public class Cart implements Serializable{
	// ����ȭ ��ü ��ȣ
	private static final long serialVersionUID = 300L;
	
	// ��ٱ��� ���
	public static HashMap<Integer, Book> cartList = new HashMap<Integer, Book>();
	
	// ������
	public Cart() {}
}
