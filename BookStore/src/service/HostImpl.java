package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;

import domain.Book;
import domain.Buy;
import domain.Order;
import domain.Refund;
import domain.Settlement;
import domain.Stock;
import view.Console;

/**
 * @fileName		: BookStore
 * @project		: ���� ���� ���α׷�
 * @date				: 2023.02.16.~2023.03.09
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
		System.out.println("��ȣ\t������\t����\t����\t����");
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

	// å ����
	@Override
	public void bookDel() {
		System.out.print("������ å�� �ڵ带 �Է��ϼ���. [���� : 0] : ");
		int code = Console.codeInput();
		if(Stock.stockList.containsKey(code)) {	// �ڵ忡 �´� å�� ����Ͽ� �ִ��� Ȯ��
			Stock.stockList.remove(code);
			System.out.println("===========================");
			System.out.println(code + "�� �ڵ带 ���� ������ �����Ǿ����ϴ�.");
			System.out.println("===========================");
		} else if(code == 0) {
			return ;		// ����
		} else {
			System.out.println("===========================");
			System.out.println(code + "�� �ڵ带 ���� ������ ��Ͽ� ���� �ʽ��ϴ�. ����� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�.");
			System.out.println("===========================");
		}
	}

	// �ֹ����
	@Override
	public void orderList() {
		System.out.println("********** ���� ��û ��� *********");
		System.out.println("ID\t��ȣ\t������\t����\t����\t����");
		System.out.println("*************************");
		Iterator<String> ir = Order.idOrderList.keySet().iterator();
		while (ir.hasNext()) {			// ID�� �ֹ��� ���� ��ϵ� ��������
			String key = ir.next();
			Iterator<Integer> ir2 = Order.idOrderList.get(key).keySet().iterator();
			while (ir2.hasNext()) {		// code�� ���� ��ü ��������
				int code = ir2.next();
				System.out.println(key + "\t" + Order.idOrderList.get(key).get(code));
			}
			
		}
	}

	// ��������
	@Override
	public void orderConfirm() {
		System.out.print("���� ������ ID�� �Է��ϼ���. [���� : 0] : ");
		String id = Console.strInput();
		System.out.print("���� ������ å�� �ڵ带 �Է��ϼ���. [���� : 0] : ");
		int code = Console.codeInput();
		if(Order.idOrderList.containsKey(id)) {			// �ش� ���̵� �ִ��� Ȯ��
			// ���� �α׾ƿ� �� ���ſϷ� ����� ����ȭ�� �Ǿ ���⼭ ������ ���ָ� �� ���Ͽ� �߰��� �Ǿ����
			// ���ſϷ�, ��ٱ��ϸ� �ֹ�ó�� ID �� Map�� ������ ���� �ϼ� �� �����ؼ� �����غ���� ��
			try {
				FileInputStream listIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + "buyList.out");
				ObjectInputStream buyList = new ObjectInputStream(listIn);
				Buy.buyList = (HashMap<Integer, Book>) buyList.readObject();
			} catch (FileNotFoundException e) {
				System.out.println(id + "�� BuyList ������ �����ϴ�.");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			// ���� ��û ��Ͽ� �Է��� �ڵ忡 �´� å�� �ִ��� Ȯ��
			if(Order.idOrderList.get(id).containsKey(code)) {
				// ��� ��ü�� �ݾ� +
				int totalPrice = Order.idOrderList.get(id).get(code).getBookTotalPrice();
				if(!Settlement.totalList.containsKey(id)) {				// ��� ��Ͽ� ��ϵ� ���̵����� Ȯ��
					Settlement.totalList.put(id, totalPrice);
				} else {
					Settlement.totalList.put(id, Settlement.totalList.get(id) + totalPrice);
				}
				
				// ���� �Ϸ� ��Ͽ� �߰� �� ���ſ�û ��Ͽ��� ����
				Buy.buyList.put(code , Order.idOrderList.get(id).get(code));
				Order.idOrderList.get(id).remove(code);
				System.out.println("================================");
				System.out.println("���� ���� �Ǿ����ϴ�.");
				System.out.println("================================");
			} else if(code == 0) {
				
			} else {
				System.out.println("================================");
				System.out.println(code + "�� �ڵ带 ���� ������ ������ ����� �����ϴ�. ����� �ٽ� Ȯ���� �ֽñ� �ٶ��ϴ�.");
			}
			
			// ���� �Ϸ� ��� �ٽ� ���Ͽ� ����
			try {
				FileOutputStream listOut = new FileOutputStream("C:\\Users\\Happy\\Downloads\\" + id + "buyList.out");
				ObjectOutputStream buyList = new ObjectOutputStream(listOut);
				if(Buy.buyList != null) {
					buyList.writeObject(Buy.buyList);
					Buy.buyList.clear();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�Է��Ͻ� ���̵� ���� ���� ���ſ�û�� �� ���� �����ϴ�.");
		}
	}

	// ȯ�ҽ���
	@Override
	public void orderCancel() {
		System.out.println("********* ȯ�� ��û ��� **********");
		System.out.println("ID\t��ȣ\t������\t����\t����\t����");
		System.out.println("**************************");
		// ���̵� �� ��� ���
		Iterator<String> ir = Refund.idRefundList.keySet().iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			Iterator<Integer> ir2 = Refund.idRefundList.get(key).keySet().iterator();
			while (ir2.hasNext()) {
				Integer code = ir2.next();
				System.out.println(key + "\t" + Refund.idRefundList.get(key).get(code));
			}
		}
		
		// ���� ó�� ����
		System.out.println("ȯ�� ������ ID�� �Է��ϼ���. [���� : 0]");
		String id = Console.strInput();
		System.out.print("ȯ�� ������ å�� �ڵ带 �Է��ϼ���. [���� : 0] : ");
		int code = Console.codeInput();
		if(Refund.idRefundList.containsKey(id)) {					// �ش� ���̵� ȯ���ߴ��� Ȯ��
			// ȯ�� ��û ��Ͽ� �Է��� �ڵ忡 �´� å�� �ִ��� Ȯ��
			if(Refund.idRefundList.get(id).containsKey(code)) {
				if(Stock.stockList.containsKey(code)) {			// ȯ���Ϸ��� å�� ��� ������ ���� �߰�
					Stock.stockList.get(code).setBookCount(
							Stock.stockList.get(code).getBookCount() + 
							Refund.idRefundList.get(id).get(code).getBookCount());
				} else {
					Stock.stockList.put(code, new Book(Refund.idRefundList.get(id).get(code)));
				}
				
				// ��� ��ü ���� �� �ش� ��� ȯ�� ��ü���� ����
				Settlement.totalList.put(id, Settlement.totalList.get(id) - 
															Refund.idRefundList.get(id).get(code).getBookTotalPrice());
				Refund.idRefundList.get(id).remove(code);
				System.out.println("================================");
				System.out.println("ȯ�� ó�� �Ǿ����ϴ�.");
				System.out.println("================================");
			} else if(code == 0) {
				
			} else {
				System.out.println("================================");
				System.out.println(code + "�� �ڵ带 ���� ������ ȯ�� ��û�� ����� �����ϴ�. ����� �ٽ� Ȯ���� �ֽñ� �ٶ��ϴ�.");
			}
		} else {
			System.out.println("�Է��Ͻ� ���̵� ȯ�ҿ�û ��Ͽ� �����ϴ�.");
		}
	}

	// ���
	@Override
	public void saleTotal() {
		// ���̵� ��� ���
		if(!Settlement.totalList.isEmpty()) {
			Iterator<String> ir = Settlement.totalList.keySet().iterator();
			while (ir.hasNext()) {
				String id = ir.next();
				System.out.print(id + "�� �� ���ž��� : ");
				System.out.printf("%,d�� �Դϴ�.\n", Settlement.totalList.get(id));
			}
		} else {
			System.out.println("���� å�� ������ ���̵� ���ų� ���������� ���� �ʾҽ��ϴ�.");
		}
	}
}
