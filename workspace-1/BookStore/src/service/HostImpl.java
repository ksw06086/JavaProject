package service;

import java.util.Iterator;

import domain.Stock;
import view.Console;

/**
 * @fileName		: BookStore
 * @project		: ���� ���� ���α׷�
 * @date				: 2023.03.07.
 * @author			: �輱��
 * @summary		: ������ ���� ��� ȣ�� �뵵
 */
public class HostImpl implements Host{
	/*
	 * �̱���
	 * 
	 * private static HostImpl guest = new GuestImpl(); 
	 * private HostImpl() {} 
	 * public static HostImpl getGuest() { return guest; }
	 */
	
	public HostImpl() {}
	
	// ������ �α���
	@Override
	public boolean hostLogin() {		
		System.out.print("������ ID : ");
		String id = Console.strInput();
		System.out.print("������ PW : ");
		String pw = Console.strInput();
		if(id.equals(ID) && pw.equals(PASSWORD)) {
			System.out.println("=================================");
			System.out.println("�α��� �Ǿ����ϴ�.");
			System.out.println("=================================");
			return true;
		} else if(id.equals(ID)) {
			System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
		} else if(id.equals(PASSWORD)) {
			System.out.println("���̵� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("���̵�� ��й�ȣ �� �� ���� �ʽ��ϴ�.");
		}
		return false;
	}

	// å ���
	@Override
	public void bookList() {
		System.out.println("********* ���� ��� *********");
		System.out.println("��ȣ\t������\t����\t����\t����\t����");
		System.out.println("*************************");
		Iterator<Integer> ir = Stock.stockList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			System.out.println(Stock.stockList.get(key));
		}
	}

	// å �߰�
	@Override
	public void bookAdd() {
		System.out.println("============ ���� ��� =============");
	}

	@Override
	public void bookUpdate() {
		
	}

	@Override
	public void bookDel() {
		
	}

	@Override
	public void orderList() {
		
	}

	@Override
	public void orderConfirm() {
		
	}

	@Override
	public void orderCancel() {
		
	}

	@Override
	public void saleTotal() {
		
	}

}
