package domain;

import java.io.Serializable;
import java.util.HashMap;

/*
 * �ۼ��� : 2023.03.06.
 * �ۼ��� : �輱��
 * ���� : ���ſϷ� ��� ������ ȣ�� �뵵
 * **/
public class Buy implements Serializable {
	// ����ȭ ��ü ��ȣ
	private static final long serialVersionUID = 200L;
	
	// ������ å ���
	public static HashMap<Integer, Book> buyList = new HashMap<Integer, Book>();
	
	// ������
	public Buy() {}
}
