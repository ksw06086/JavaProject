package service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
import domain.Cart;
import domain.Order;
import domain.Refund;
import domain.Stock;
import view.Console;

/**
 * @date				: 2023.02.16.-2023.03.10
 * @author			: �輱��
 * @summary		: �� ���� ��� ȣ�� �뵵
 */
public class GuestImpl implements Guest{
	// �̱���
	// private static GuestImpl guest = new GuestImpl();
	
	public GuestImpl() {}
	
	// public static GuestImpl getGuest() {
	//	return guest;
	// }
	
	// List���� key�� id�� ����
	public static String Id;
	
	// ȸ�� �α���
	@SuppressWarnings("unchecked")					// Ÿ�� ĳ������ �� �� ������ �� �� �ִµ� �װ� üũ ���ϰڴ�.
	@Override
	public boolean guestLogin() {
		System.out.print("�մ� ID : ");
		String id = Console.strInput();
		System.out.print("�մ� PW : ");
		String pw = Console.strInput();
		try {
			// ȸ�������� ���� ������ ������ �о�帲(������ȭ)
			FileInputStream fileMemberIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + ".txt");
			DataInputStream memberIn = new DataInputStream(fileMemberIn);
			
			// ID�� PASSWORD�� �´��� Ȯ��
			if(id.equals(memberIn.readUTF())) {
				if(pw.equals(memberIn.readUTF())) {
					Id = id;
					System.out.println("=============================");
					System.out.println("�α��� �Ǿ����ϴ�.");
					System.out.println("=============================");
					
					//ȸ���� ���� ����� ��ٱ���, ���ų����� �ִ��� Ȯ����
					// listIn : �� ����Ʈ ������ �о��
					// cartListin, buyListin : �� ��ü�� �ҷ���
					FileInputStream listIn;			
					try {
						listIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + "cartList.out");
						ObjectInputStream cartListIn = new ObjectInputStream(listIn);
						Cart.cartList = (HashMap<Integer, Book>) cartListIn.readObject();
						listIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + "buyList.out");
						ObjectInputStream buyListIn = new ObjectInputStream(listIn);
						Buy.buyList = (HashMap<Integer, Book>) buyListIn.readObject();
					
					} catch (FileNotFoundException e) {
						System.out.println(id+"���� ù�湮�� ȯ���մϴ�~!");
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return true;
				} else {
					// ��й�ȣ�� ���� ����
					System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
					return false;
				}
			}
		} catch (FileNotFoundException e) {			// ���̵� ������ �ȸ����������
			System.out.println("�����ϴ� ���̵� �ƴմϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	// ��ٱ��� ����
	@Override
	public void cartDel() {
		// ������ å �ڵ� �Է�
		System.out.print("�����Ϸ��� å�� �ڵ带 �Է��ϼ���. [ ���� : 0 ] : ");
		int code = Console.codeInput();
		
		// ��ٱ��� �ȿ� �Է��� �ڵ� å�� �ִ��� Ȯ��
		if(Cart.cartList.containsKey(code)) {
			System.out.println("=================================");
			System.out.println("��Ͽ��� �����Ǿ����ϴ�.");
			System.out.println("=================================");
			Cart.cartList.remove(code);
		} else if(code == 0) {
			
		} else {
			System.out.println("=================================");
			System.out.println(code + "�� �ڵ带 ���� ������ ��ٱ��Ͽ� ���� �ʽ��ϴ�. ����� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�.");
		}
	}

	// ��ٱ��� ����
	@Override
	public void cartBuy() {
		// ��ٱ��� �ȿ��� ������ �׸� �Է�
		System.out.print("������ å�� �ڵ带 �Է��ϼ���. [���� : 0] : ");
		int code = Console.codeInput();
		
		// �Է��� �ڵ�� �´� å�� ��ٱ��Ͽ� �ִ��� Ȯ��
		if(Cart.cartList.containsKey(code)) {
			// ������ ���� �Է�
			System.out.println("������ å�� ������ �Է��ϼ���. [���� : 0] : ");
			int count = Console.codeInput();
			
			// count�� ��ٱ��� �� �������� ���ų� ��� �������� ���� ��
			if(count > Cart.cartList.get(code).getBookCount()) {
				System.out.println("�Է��Ͻ� ������ ��ٱ��Ͽ� �ִ� �������� �����ϴ�. ����� �ٽ� Ȯ���� �ֽñ� �ٶ��ϴ�.");
			} else if(	count > Stock.stockList.get(code).getBookCount()) {
				System.out.println("�Է��Ͻ� ������ ���������� �����ϴ�. " + Stock.stockList.get(code).getBookCount() + 
						"������ ������ �Է����ֽñ� �ٶ��ϴ�.");
			} else {
				System.out.println("=================================");
				System.out.println("���ſ�û �Ǿ����ϴ�.");
				System.out.println("=================================");
				
				// ���� ��û ��� �߰� 
				// �ѹ��̶� ���Ÿ� ���߾��ٸ� �ش� ID�� ����Ʈ ���� �����ϱ�
				if(!Order.idOrderList.containsKey(Id)) {
					Order.idOrderList.put(Id, Order.getOrderList());
				}
				
				// �ش� å�� ������ ���� ��û�ߴ� �̷��� ������ count++ / ������ new add 
				if(Order.idOrderList.get(Id).containsKey(code)) {
					Order.idOrderList.get(Id).get(code).addBookCount(count);
				} else {
					Order.idOrderList.get(Id).put(code, new Book(Stock.stockList.get(code)));
				}
				
				// ��ٱ���/����� ����
				// Buy count == Cart count => remove / != => count--
				if(Cart.cartList.get(code).getBookCount() - count == 0) {
					Cart.cartList.remove(code);
				} else {
					Cart.cartList.get(code).subBookCount(count);
				}
				// Buy count == Stock count => remove / != => count--
				if(Stock.stockList.get(code).getBookCount() - count == 0) {
					Stock.stockList.remove(code);
				} else {
					Stock.stockList.get(code).subBookCount(count);
				}
			} 
		} else if(code == 0) {
			return ;
		} else {
			System.out.println("==============================");
			System.out.println(code + "�� �ڵ带 ���� ������ ��ٱ��Ͽ� ���� �ʽ��ϴ�. ����� �ٽ� Ȯ���� �ֽñ� �ٶ��ϴ�.");
		}
	}

	// �ٷ� ����
	@Override
	public void nowBuy() {
		// ������ å �ڵ� �Է�
		System.out.print("������ å�� �ڵ带 �Է��ϼ���. [���� : 0] : ");
		int code = Console.codeInput();
		
		// ��� �����ִ� å���� Ȯ��
		if(Stock.stockList.containsKey(code)) {
			// ���� ���� �Է�
			System.out.print("������ å�� ������ �Է��ϼ���. [���� : 0] : ");
			int count = Console.codeInput();
			
			// �Է��� ������ ��� �������� ū�� Ȯ��
			if(count > Stock.stockList.get(code).getBookCount()) {
				System.out.println("�Է��Ͻ� ������ ��� �������� �����ϴ�. " 
						+ Stock.stockList.get(code).getBookCount()
						+ "������ ������ �Է����ּ���.");
			} else {
				System.out.println("==================================");
				System.out.println("���ſ�û �Ǿ����ϴ�.");
				System.out.println("==================================");
				
				// ���� ��û ��� �߰� 
				// �ѹ��̶� ���Ÿ� ���߾��ٸ� �ش� ID�� ����Ʈ ���� �����ϱ�
				if(!Order.idOrderList.containsKey(Id)) {
					Order.idOrderList.put(Id, Order.getOrderList());
				}
				
				// �ش� å�� ������ ���� ��û�ߴ� �̷��� ������ count++ / ������ new add 
				if(Order.idOrderList.get(Id).containsKey(code)) {
					Order.idOrderList.get(Id).get(code).addBookCount(count);
				} else {
					Order.idOrderList.get(Id).put(code, new Book(Stock.stockList.get(code)));
				}
				
				// ����� ����
				// Buy count == Stock count => remove / != => count--
				if(Stock.stockList.get(code).getBookCount() == count) {
					Stock.stockList.remove(code);
				} else {
					Stock.stockList.get(code).subBookCount(count);
				}
			}
		} else if(code == 0) {		// ����
			return ;
		} else {							// �ڵ� �߸� �Է�
			System.out.println("==============================");
			System.out.println(code + "�� �ڵ带 ���� ������ ��� ���� �ʽ��ϴ�. ����� �ٽ� Ȯ���� �ֽñ� �ٶ��ϴ�.");
		}
	}

	// ��ٱ��� �߰�
	@Override
	public void cartAdd() {
		// �߰��� ���� �ڵ� �Է�
		System.out.println("��ٱ��Ͽ� �߰��� å�� �ڵ带 �Է��ϼ���. [���� : 0] : ");
		int code = Console.codeInput();
		
		// ��� �ִ� å���� Ȯ��
		if(Stock.stockList.containsKey(code)) {
			// �߰��� ���� �Է�
			System.out.print("������ å�� ������ �Է��ϼ���. [���� : 0] : ");
			int count = Console.codeInput();
			
			// �Է��� ������ ��� �������� ū�� Ȯ��
			if(count > Stock.stockList.get(code).getBookCount()) {
				System.out.println("�Է��Ͻ� ������ ��� �������� �����ϴ�. " 
						+ Stock.stockList.get(code).getBookCount()
						+ "������ ������ �Է����ּ���.");
			} else {
				System.out.println("==================================");
				System.out.println("��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
				System.out.println("==================================");
				
				// ��ٱ��� ��� �߰� 
				// �ش� å�� ������ ��ٱ��Ͽ� �߰��� �̷��� ������ count++ / ������ new add 
				if(Cart.cartList.containsKey(code)) {
					Cart.cartList.get(code).addBookCount(count);
				} else {
					Cart.cartList.put(code, new Book(Stock.stockList.get(code)));
				}
			}
		} else if(code == 0) {		// ����
			return ;
		} else {							// �ڵ� �߸� �Է�
			System.out.println("==============================");
			System.out.println(code + "�� �ڵ带 ���� ������ ��� ���� �ʽ��ϴ�. ����� �ٽ� Ȯ���� �ֽñ� �ٶ��ϴ�.");
		}
	}

	// ���� �Ϸ� ��� ����Ʈ
	public void buyBookList() {
		System.out.println("*********** ���� �Ϸ� ��� *********");
		System.out.println("��ȣ\t������\t����\t����\t����");
		System.out.println("**************************");
		Iterator<Integer> ir = Buy.buyList.keySet().iterator();
		while (ir.hasNext()) {
			int code = ir.next();
			System.out.println(Buy.buyList.get(code));
		}
	}
	
	// ȯ�� ��û
	@Override
	public void refund() {
		// ������ ���� ��� ���
		buyBookList();
		
		// ȯ���� å �ڵ� �Է�
		System.out.print("ȯ���� å�� ������ �Է��ϼ���. [���� : 0] : ");
		int code = Console.codeInput();
		
		// å�� ���� �߾����� Ȯ��
		if(Buy.buyList.containsKey(code)) {
			// ȯ���� ���� �Է�
			System.out.print("ȯ���� å�� ������ �Է��ϼ���. [���� : 0] : ");
			int count = Console.codeInput();
			
			// �Է��� ������ ������ �������� ū�� Ȯ��
			if(count > Buy.buyList.get(code).getBookCount()) {
				System.out.println("�Է��Ͻ� ������ �����ߴ� å�� �������� �����ϴ�. " 
						+ Buy.buyList.get(code).getBookCount()
						+ "������ ������ �Է����ּ���.");
			} else {
				System.out.println("==================================");
				System.out.println(count + "���� å�� ȯ�� ��û�Ͽ����ϴ�.");
				System.out.println("==================================");
				
				// ȯ�� ��û��� �߰� 
				// �ѹ��̶� ȯ�� ��û�� ���߾��ٸ� �ش� ID�� ����Ʈ ���� �����ϱ�
				if(!Refund.idRefundList.containsKey(Id)) {
					Refund.idRefundList.put(Id, Refund.getRefundList());
				} 
				// �ش� å�� ������ ȯ�ҿ�û�� �̷��� ������ count++ / ������ new add 
				if(Refund.idRefundList.get(Id).containsKey(code)) {
					Refund.idRefundList.get(Id).get(code).addBookCount(count);
				} else {
					Refund.idRefundList.get(Id).put(code, new Book(Buy.buyList.get(code)));
				}
				
				// ���� ��� ����
				// Buy count == Refund count => remove / != => count--
				if(Buy.buyList.get(code).getBookCount() == count) {
					Buy.buyList.remove(code);
				} else {
					Buy.buyList.get(code).subBookCount(count);
				}
			}
		} else if(code == 0) {		// ����
			return ;
		} else {							// �ڵ� �߸� �Է�
			System.out.println("==============================");
			System.out.println(code + "�� �ڵ带 ���� ������ �������� �ʾҽ��ϴ�. ����� �ٽ� Ȯ���� �ֽñ� �ٶ��ϴ�.");
		}
	}

	// ȸ������
	@Override
	public void guestJoin() {
		System.out.println("=============================");
		System.out.println("ȸ������");
		System.out.println("=============================");
		
		System.out.print("ID : ");
		String id = Console.strInput();
		System.out.print("PW : ");
		String pw = Console.strInput();
		try {
			// �̹� ȸ�������ؼ� ������ ���̵� ������ �ִ��� Ȯ��
			FileInputStream fileMemberIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + ".txt");
			System.out.println("�̹� ����ϰ� �ִ� ���̵� �Դϴ�.");
			return;
		} catch (FileNotFoundException e) {
			// ������ ���Ӱ� ȸ������ ����(����ȭ)
			try {
				// FileOutputStream : ������ �ԷµǾ� �ִ� ���Ͽ� ������ ����ϴ� ��Ʈ�� Ŭ����
				// DataOutputStream : ����,���ڿ��� �ƴ� �Ϲ� ������(����, Bool, �Ǽ� ��)�� ����� �� ����ϴ� ��Ʈ�� Ŭ����
				/*
				 * ������ �޼ҵ� : Short, Byte, int, double, float, long
				 * ������ �޼ҵ� : UTF, Char
				 * ������ �޼ҵ� : Boolean
				 */
				FileOutputStream fileMemberOut = new FileOutputStream("C:\\Users\\Happy\\Downloads\\" + id + ".txt");
				DataOutputStream memberOut = new DataOutputStream(fileMemberOut);
				memberOut.writeUTF(id);
				memberOut.writeUTF(pw);
				System.out.println("=============================");
				System.out.println("ȸ������ �Ϸ�");
				System.out.println("=============================");
			} catch (FileNotFoundException e1) {			// ������ ã�� �� ���� �� ������ ��Ȳ
				e1.printStackTrace();
			} catch (IOException e1) {							// ������� �� ������ ��Ȳ
				e1.printStackTrace();
			}
		}
	}

	// �α׾ƿ� : ��ٱ��Ͽ� ���ſϷ� ��� ���Ͽ� ����
	@Override
	public void guestLogOut() {
		try {
			// ��ٱ��� ���� ���Ͽ� ���
			FileOutputStream fileCart = new FileOutputStream("C:\\Users\\Happy\\Downloads\\" + Id + "cartList.out");
			ObjectOutputStream cartList = new ObjectOutputStream(fileCart);
			// ������ �ִٸ� �ֱ�
			if(Cart.cartList != null) {
				cartList.writeObject(Cart.cartList);
				Cart.cartList.clear();
			}
			
			// ���� ���� ���Ͽ� ���
			FileOutputStream fileBuy = new FileOutputStream("C:\\Users\\Happy\\Downloads\\" + Id + "buyList.out");
			ObjectOutputStream buyList = new ObjectOutputStream(fileBuy);
			// ������ �ִٸ� �ֱ�
			if(Buy.buyList != null) {
				cartList.writeObject(Buy.buyList);
				Buy.buyList.clear();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
