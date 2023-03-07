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

import domain.Book;
import domain.Buy;
import domain.Cart;
import view.Console;

/**
 * @date				: 2023.03.06.-2023.03.07
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
			
			// ���̵�� ����� �Է��Ѱ� �´��� Ȯ��
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
		} catch (FileNotFoundException e) {
			System.out.println("�����ϴ� ���̵� �ƴմϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void cartDel() {
		
	}

	@Override
	public void cartBuy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nowBuy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cartAdd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		
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
