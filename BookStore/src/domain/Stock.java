package domain;

import java.io.Serializable;
import java.util.HashMap;

/*
 * �ۼ��� : 2023.02.06.
 * �ۼ��� : �輱��
 * ���� : ��� ��� ������ ȣ��
 * **/
public class Stock implements Serializable{
	// ����ȭ ��ü ��ȣ
	private static final long serialVersionUID = 600L;
	
	// å ��� ���
	public static HashMap<Integer, Book> stockList = new HashMap<Integer, Book>();
	
	// ������
	public Stock() {}
}
