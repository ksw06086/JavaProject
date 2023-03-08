package view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

import domain.Book;
import domain.Cart;
import domain.MenuList;
import domain.Order;
import domain.Refund;
import domain.Settlement;
import domain.Stock;
import service.Guest;
import service.GuestImpl;
import service.Host;
import service.HostImpl;

/*
 * �ۼ��� : 2023.03.06.~2023.03.09
 * �ۼ��� : �輱��
 * ���� : �ش� ��ɿ� ���� ȭ�� ȣ��
 * **/
public class MenuImpl implements Menu{
	private Guest guest = new GuestImpl();
	private Host host = new HostImpl();

	@Override
	public void commonMenu(MenuList code) {		// ����޴�
		switch (code) {
			case SHOP_LOGIN : 									// ����ȭ��(�α���)
				loginMenu(); break;
			case HOST_MENU :									// ������ �޴�
				hostMenu(); break;
			case HOST_STOCK_MENU :						// ������
				stockMenu(); break;
			case HOST_BOOK_LIST :							// å���
				host.bookList(); break;
			case HOST_BOOK_ADD :							// å�߰�
				host.bookAdd();; break;
			case HOST_BOOK_UPDATE :						// å����
				host.bookUpdate(); break;
			case HOST_BOOK_DEL :							// å����
				host.bookDel(); break;
			case HOST_ORDER_MENU :						// �ֹ�����
				orderMenu(); break;
			case HOST_ORDER_LIST :						// �ֹ����
				host.orderList(); break;
			case HOST_ORDER_CONFIRM :				// ��������
				host.orderConfirm(); break;
			case HOST_ORDER_CANCEL :					// �������
				host.orderCancel(); break;
			case HOST_SALE_TOTAL :						// ���
				host.saleTotal(); break;
			case GUEST_MENU :									// �� �޴�
				guestMenu(); break;
			case GUEST_GOODS_LIST :						// ��ǰ���
				goodsMenu(); break;
			case GUEST_NOWBUY :								// �ٷα���
				guest.nowBuy(); break;
			case GUEST_CART_ADD :							// ��ٱ��� ���
				guest.cartAdd(); break;
			case GUEST_CART_LIST :							// ��ٱ��� ���
				cartMenu(); break;
			case GUEST_CART_DEL :							// ��ٱ��� ����
				guest.cartDel(); break;
			case GUEST_CART_BUY :							// ��ٱ��� ����
				guest.cartBuy(); break;
			case GUEST_REFUND :								// ȯ��
				guest.refund(); break;
			case GUEST_JOIN :									// ȸ������
				guest.guestJoin(); break;
			default:
				break;
		}
	}

	// �α��θ޴� ��� ó���� ���⼭
	@Override
	public void loginMenu() {		
		boolean loginErrorSwit = false;		// �α��� �� �� ������ ����� �ٽ� �α������� ���ƿ��� ���� ����ġ
		System.out.println("======= �α��� =======");
		System.out.println("1.������\t2.������\t3.ȸ������\t4.����");
		System.out.println("�޴���ȣ�� �Է��ϼ���. : ");
		switch (Console.codeInput()) {
			case	 1:
				loginErrorSwit = guest.guestLogin();
				if(loginErrorSwit)
					commonMenu(MenuList.GUEST_MENU);
				break;
			case 2:
				loginErrorSwit = host.hostLogin();
				if(loginErrorSwit)
					commonMenu(MenuList.HOST_MENU);
				break;
			case 3:
				commonMenu(MenuList.GUEST_JOIN);
				break;
			case 4:
				// �ý��� ���� �� ���, ���ſ�û, ȯ�ҿ�û, ���(������) ���� ���� // ����ȭ
				try {
					FileOutputStream memberFile = new FileOutputStream("C:\\Users\\Happy\\Downloads\\hostList.out");
					ObjectOutputStream memberObject = new ObjectOutputStream(memberFile);
					if(Stock.stockList != null) {
						memberObject.writeObject(Stock.stockList);
					}
					if(Order.idOrderList != null) {
						memberObject.writeObject(Order.idOrderList);
					}
					if(Refund.idRefundList != null) {
						memberObject.writeObject(Refund.idRefundList);
					}
					if(Settlement.totalList != null) {
						memberObject.writeObject(Settlement.totalList);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.exit(0);
				break;
			default:
				inputError();
		}
		commonMenu(MenuList.SHOP_LOGIN);
	}

	// ������ �޴�
	@Override
	public void hostMenu() {		
		System.out.println("======= ������ �޴� =======");
		System.out.println("1.������\t2.�ֹ�����\t3.�α׾ƿ�");
		System.out.println("�޴���ȣ�� �Է��ϼ���. : ");
		switch (Console.codeInput()) {
			case 1:
				commonMenu(MenuList.HOST_STOCK_MENU);
				break;
			case 2:
				commonMenu(MenuList.HOST_ORDER_MENU);
				break;
			case 3:
				commonMenu(MenuList.SHOP_LOGIN);
				break;
			default:
				inputError();
		}
		commonMenu(MenuList.HOST_MENU);
	}
	
	// ������ �������޴�
	@Override
	public void stockMenu() {		
		System.out.println("======= ������ =======");
		System.out.println("1.���\t2.�߰�\t3.����\t4.����\t5.����");
		System.out.println("�޴���ȣ�� �Է��ϼ���. : ");
		switch (Console.codeInput()) {
			case 1:
				commonMenu(MenuList.HOST_BOOK_LIST);
				break;
			case 2:
				commonMenu(MenuList.HOST_BOOK_ADD);		
				break;
			case 3:
				commonMenu(MenuList.HOST_BOOK_UPDATE);
				break;
			case 4:
				commonMenu(MenuList.HOST_BOOK_DEL);
				break;
			case 5:
				commonMenu(MenuList.HOST_MENU);
				break;
			default:
				inputError();
		}
		commonMenu(MenuList.HOST_STOCK_MENU);
	}
	
	// ������ �ֹ����� �޴�
	@Override
	public void orderMenu() {		
		System.out.println("======= �ֹ����� =======");
		System.out.println("1.�ֹ����\t2.��������\t3.�������\t4.���\t5.����");
		System.out.println("�޴���ȣ�� �Է��ϼ���. : ");
		switch (Console.codeInput()) {
			case 1:
				commonMenu(MenuList.HOST_ORDER_LIST);
				break;
			case 2:
				commonMenu(MenuList.HOST_ORDER_CONFIRM);		
				break;
			case 3:
				commonMenu(MenuList.HOST_ORDER_CANCEL);
				break;
			case 4:
				commonMenu(MenuList.HOST_SALE_TOTAL);
				break;
			case 5:
				commonMenu(MenuList.HOST_MENU);
				break;
			default:
				inputError();
		}
		commonMenu(MenuList.HOST_ORDER_MENU);
	}

	// �� �޴�
	@Override
	public void guestMenu() {		
		System.out.println("======= ���޴� =======");
		System.out.println("1.��ǰ���\t2.��ٱ���\t3.ȯ��\t4.�α׾ƿ�");
		System.out.println("�޴���ȣ�� �Է��ϼ���. : ");
		switch (Console.codeInput()) {
			case 1:
				commonMenu(MenuList.GUEST_GOODS_LIST);
				break;
			case 2:
				commonMenu(MenuList.GUEST_CART_LIST);		
				break;
			case 3:
				commonMenu(MenuList.GUEST_REFUND);
				break;
			case 4:
				guest.guestLogOut();
				commonMenu(MenuList.SHOP_LOGIN);
				break;
			default:
				inputError();
		}
	}

	// ��ǰ��ϸ޴�
	@Override
	public void goodsMenu() {	
		// ��ǰ ����Ʈ ���
		System.out.println("********* ���� ��� *********");
		System.out.println("��ȣ\t������\t����\t����\t����\t����");
		System.out.println("*************************");
		Iterator<Integer> ir = Stock.stockList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			System.out.println(Stock.stockList.get(key));
		}
		
		// ��ǰ��� �޴�
		System.out.println("======== ��ǰ��� ========");
		System.out.println("1.�ٷα���\t2.��ٱ��Ͽ� ���\t3.����");
		System.out.print("�޴���ȣ�� �Է��ϼ���. : ");
		switch (Console.codeInput()) {
		case 1:
			commonMenu(MenuList.GUEST_NOWBUY);
			break;
		case 2:
			commonMenu(MenuList.GUEST_CART_ADD);
			break;
		case 3:
			commonMenu(MenuList.GUEST_MENU);
			break;
		default:
			inputError();
		}
		commonMenu(MenuList.GUEST_GOODS_LIST);
	}
	
	// �� ��ٱ��� �޴�
	@Override
	public void cartMenu() {	
		// ��ٱ��� ����Ʈ ���
		System.out.println("******* ��ٱ��� ��� *******");
		System.out.println("��ȣ\t������\t����\t����\t����");
		System.out.println("**********************");
		Iterator<Integer> ir = Cart.cartList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			System.out.println(Cart.cartList.get(key));
		}
		
		// ��ٱ��� �޴�
		System.out.println("======== ��ٱ��� ========");
		System.out.println("1.����\t2.����\t3.����");
		System.out.print("�޴���ȣ�� �Է��ϼ���. : ");
		switch (Console.codeInput()) {
			case 1:
				commonMenu(MenuList.GUEST_CART_BUY);
				break;
			case 2:
				commonMenu(MenuList.GUEST_CART_DEL);
				break;
			case 3:
				commonMenu(MenuList.GUEST_MENU);
				break;
			default:
				inputError();
		}
		commonMenu(MenuList.GUEST_CART_LIST);
	}

	// �޴��� ���� ��ȣ�� �Է����� �� ��¹�
	@Override
	public void inputError() {
		System.out.println("�޴��� ���� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
	}

}
