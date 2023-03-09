package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.HashMap;

import domain.Book;
import domain.Code;
import domain.MenuList;
import domain.Order;
import domain.Refund;
import domain.Stock;

/*
 * �ۼ��� : 2023.02.11.~2023.02.13.
 * �ۼ��� : �輱��
 * ���� : ����� ��ü �ҷ����� �� Menu Login ȭ�� ȣ�� �뵵
 * **/
public class Console extends MenuImpl{
	public static boolean inputReadSwit = false;		// ���� �Ǵ� ���ڿ� �Է� �� ������ ���� true�� ��ȯ��
	private static BufferedReader reader;				// ��ü �����͸� �������� ���� IO��ü
	
	// ������
	@SuppressWarnings("unchecked")
	public Console() {
		FileInputStream listIn;										// ����Ʈ�� ���� �Ǿ��ִ� ��ü �о���� ����
		try {
			// ���� ��θ� ���ؼ� byte(��ü) �о����
			listIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\hostList.out");
			
			// byte�� ��ü�� ��ȯ
			ObjectInputStream hostListIn = new ObjectInputStream(listIn);
			
			// ������ �α׸� ���� �ֱ�
			Stock.stockList = (HashMap<Integer, Book>) hostListIn.readObject();
			Order.idOrderList = (HashMap<String, HashMap<Integer,Book>>) hostListIn.readObject();
			Refund.idRefundList = (HashMap<String, HashMap<Integer,Book>>) hostListIn.readObject();
		} catch (FileNotFoundException e) {
			// ó������ ���� ������ ���� ������ ��� ���� ����	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��������
		commonMenu(MenuList.SHOP_LOGIN);
	}
	
	// ���ڿ� �Է�
	public static String strInput() {
		inputReadSwit = false;
		reader = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		// ����ó��
		try {
			str = reader.readLine();
		} catch (IOException e) {
			inputReadSwit = true;
			System.out.println("Ű���� �Է� ����~!");
		}
		return str;
	}
	
	// ���� �Է�
	public static int codeInput() {
		inputReadSwit = false;
		reader = new BufferedReader(new InputStreamReader(System.in));
		int code = 0;
		// ����ó��
		try {
			code = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			inputReadSwit = true;
			System.out.println("int ������ ������ϴ�. Ű���� �Է� ����~!");
		} catch (IOException e) {
			inputReadSwit = true;
			System.out.println("Ű���� �Է� ����~!");
		}
		return code;
	}
}
