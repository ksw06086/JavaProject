package service;

import java.util.Iterator;

import domain.Book;
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
		System.out.println("å ���� : ");
		String name = Console.strInput();
		System.out.println("å ���� : ");
		String author = Console.strInput();
		System.out.println("å ���� : ");
		int price = Console.codeInput();
		System.out.println("å ���� : ");
		int count = Console.codeInput();
		
		// Ű���� ����, ���� ������, ���� �����Խ� ��� ����ϰ� ������ ȭ������ ���ư�
		if(Console.inputReadSwit) {
			System.out.println("Ű���� ������ ���� ����� ��ҵ˴ϴ�.");
			return ;
		} else if(price < 0) {
			System.out.println("������ 0���̻��Դϴ�.");
		} else if(count < 1) {
			System.out.println("�߰��� å�� 1�� �̻�����Դϴ�.");
		}
		
		// ��� ���� ������ �ٸ� �� ���� �߰��� �ϱ�
		Iterator<Integer> ir = Stock.stockList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			if(Stock.stockList.get(key).getBookTitle().equals(name) && 
					Stock.stockList.get(key).getBookAuthor().equals(author) &&
					Stock.stockList.get(key).getBookPrice() == price) {
					Stock.stockList.get(key).addBookCount(count);
					System.out.println("===========================");
					System.out.println("������ �ٸ��⿡ �ش� ������ ������ �߰��Ǿ����ϴ�.");
					System.out.println("===========================");
					return;
			}
		}
		
		// �ڵ� �����ؼ� ���� ����ϱ�
		int code = Book.getCodeNumber();
		Stock.stockList.put(code, new Book(name, author, price, count, code));
		System.out.println("===========================");
		System.out.println("������ ��ϵǾ����ϴ�.");
		System.out.println("===========================");
	}

	// å ����
	@Override
	public void bookUpdate() {
		bookList();
		System.out.print("������ å�� �ڵ带 �Է����ּ���. [���� : 0] : ");
		int code = Console.codeInput();
		if(Stock.stockList.containsKey(code)) {
			while(true) {
				System.out.print("������ �����Ͻðڽ��ϱ�?. [���� : 1, ���� : 2, ���� : 3, ���� : 4, �������� : 0] : ");
				int swit = Console.codeInput();
				switch (swit) {
					case 1:
						System.out.print("���� ���� : " + Stock.stockList.get(code).getBookTitle() + 
								", �����ϰ� ������ ������ �Է����ּ���. : ");
						Stock.stockList.get(code).setBookTitle(Console.strInput());
						break;
					case 2:
						System.out.print("���� ���� : " + Stock.stockList.get(code).getBookAuthor() + 
								", �����ϰ� ������ ���ڸ� �Է����ּ���. : ");
						Stock.stockList.get(code).setBookAuthor(Console.strInput());
						break;
					case 3:
						System.out.print("���� ���� : " + Stock.stockList.get(code).getBookPrice() + 
								", �����ϰ� ������ ������ �Է����ּ���. : ");
						int price = Console.codeInput();
						if(price < 0) {
							System.out.println("0��(��¥)���� �� ���� �ݾ��� �����ϴ�.");
							return;
						}
						Stock.stockList.get(code).setBookPrice(price);
						break;
					case 4:
						System.out.print("���� ���� : " + Stock.stockList.get(code).getBookCount() + 
								", �����ϰ� ������ ������ �Է����ּ���. : ");
						int count = Console.codeInput();
						if(count < 0) {
							System.out.println("������ 1�� �̻��Դϴ�.");
							return;
						}
						Stock.stockList.get(code).setBookCount(count);
						break;
					case 0:
						return;
					default:
						System.out.println("0~4������ ���� �� �ϳ��� �Է��� �ּ���.");
						break;
				}
				if(Console.inputReadSwit) {
					System.out.println("Ű���� ������ ���� ������ ��ҵ˴ϴ�.");
					return;
				}
				System.out.println("=================================");
				System.out.println(code + "�� �ڵ带 ���� ������ �����Ǿ����ϴ�.");
				System.out.println("=================================");
			} 
		} else if(code == 0) {
			return ;		// ����
		} else {
			System.out.println("=================================");
			System.out.println(code + "�� �ڵ带 ���� ������ ��Ͽ� ���� �ʽ��ϴ�. ����� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�. ");
			System.out.println("=================================");
		}
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
