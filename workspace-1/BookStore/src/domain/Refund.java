package domain;

import java.io.Serializable;
import java.util.HashMap;

/*
 * �ۼ��� : 2023.03.06.
 * �ۼ��� : �輱��
 * ���� : ȯ�ҿ�û ����� ���̵𺰷� ������ ȣ���ϴ� �뵵
 * **/
public class Refund implements Serializable{
	// ����ȭ ��ü ��ȣ
	private static final long serialVersionUID = 500L;
	
	// id�� ȯ�� ��û ����Ʈ // ??? �� �̷��� �������? ����Ʈ�� ���� ����� Id ���� �ϸ� ���� �ʳ�?
	public static HashMap<String, HashMap<Integer, Book>> idRefundList = new HashMap<String, HashMap<Integer,Book>>();
	
	// ������
	public Refund() {}
	
	// ID�� ���� ������ �ش� ID�� ȯ�ҳ����ٱ��� ����
	public static HashMap<Integer, Book> getRefundList(){
		return new HashMap<Integer, Book>();
	}
}
