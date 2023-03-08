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
 * 작성일 : 2023.03.06.~2023.03.09
 * 작성자 : 김선우
 * 개요 : 해당 기능에 대한 화면 호출
 * **/
public class MenuImpl implements Menu{
	private Guest guest = new GuestImpl();
	private Host host = new HostImpl();

	@Override
	public void commonMenu(MenuList code) {		// 공통메뉴
		switch (code) {
			case SHOP_LOGIN : 									// 메인화면(로그인)
				loginMenu(); break;
			case HOST_MENU :									// 관리자 메뉴
				hostMenu(); break;
			case HOST_STOCK_MENU :						// 재고관리
				stockMenu(); break;
			case HOST_BOOK_LIST :							// 책목록
				host.bookList(); break;
			case HOST_BOOK_ADD :							// 책추가
				host.bookAdd();; break;
			case HOST_BOOK_UPDATE :						// 책수정
				host.bookUpdate(); break;
			case HOST_BOOK_DEL :							// 책삭제
				host.bookDel(); break;
			case HOST_ORDER_MENU :						// 주문관리
				orderMenu(); break;
			case HOST_ORDER_LIST :						// 주문목록
				host.orderList(); break;
			case HOST_ORDER_CONFIRM :				// 결제승인
				host.orderConfirm(); break;
			case HOST_ORDER_CANCEL :					// 결제취소
				host.orderCancel(); break;
			case HOST_SALE_TOTAL :						// 결산
				host.saleTotal(); break;
			case GUEST_MENU :									// 고객 메뉴
				guestMenu(); break;
			case GUEST_GOODS_LIST :						// 상품목록
				goodsMenu(); break;
			case GUEST_NOWBUY :								// 바로구매
				guest.nowBuy(); break;
			case GUEST_CART_ADD :							// 장바구니 담기
				guest.cartAdd(); break;
			case GUEST_CART_LIST :							// 장바구니 목록
				cartMenu(); break;
			case GUEST_CART_DEL :							// 장바구니 삭제
				guest.cartDel(); break;
			case GUEST_CART_BUY :							// 장바구니 구매
				guest.cartBuy(); break;
			case GUEST_REFUND :								// 환불
				guest.refund(); break;
			case GUEST_JOIN :									// 회원가입
				guest.guestJoin(); break;
			default:
				break;
		}
	}

	// 로그인메뉴 기능 처리를 여기서
	@Override
	public void loginMenu() {		
		boolean loginErrorSwit = false;		// 로그인 할 때 오류가 생기면 다시 로그인으로 돌아오기 위한 스위치
		System.out.println("======= 로그인 =======");
		System.out.println("1.구매자\t2.관리자\t3.회원가입\t4.종료");
		System.out.println("메뉴번호를 입력하세요. : ");
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
				// 시스템 종료 시 재고, 구매요청, 환불요청, 결산(관리자) 파일 생성 // 직렬화
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

	// 관리자 메뉴
	@Override
	public void hostMenu() {		
		System.out.println("======= 관리자 메뉴 =======");
		System.out.println("1.재고관리\t2.주문관리\t3.로그아웃");
		System.out.println("메뉴번호를 입력하세요. : ");
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
	
	// 관리자 재고관리메뉴
	@Override
	public void stockMenu() {		
		System.out.println("======= 재고관리 =======");
		System.out.println("1.목록\t2.추가\t3.수정\t4.삭제\t5.이전");
		System.out.println("메뉴번호를 입력하세요. : ");
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
	
	// 관리자 주문관리 메뉴
	@Override
	public void orderMenu() {		
		System.out.println("======= 주문관리 =======");
		System.out.println("1.주문목록\t2.결제승인\t3.결제취소\t4.결산\t5.이전");
		System.out.println("메뉴번호를 입력하세요. : ");
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

	// 고객 메뉴
	@Override
	public void guestMenu() {		
		System.out.println("======= 고객메뉴 =======");
		System.out.println("1.상품목록\t2.장바구니\t3.환불\t4.로그아웃");
		System.out.println("메뉴번호를 입력하세요. : ");
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

	// 상품목록메뉴
	@Override
	public void goodsMenu() {	
		// 상품 리스트 출력
		System.out.println("********* 도서 목록 *********");
		System.out.println("번호\t도서명\t저자\t가격\t수량\t상태");
		System.out.println("*************************");
		Iterator<Integer> ir = Stock.stockList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			System.out.println(Stock.stockList.get(key));
		}
		
		// 상품목록 메뉴
		System.out.println("======== 상품목록 ========");
		System.out.println("1.바로구매\t2.장바구니에 담기\t3.이전");
		System.out.print("메뉴번호를 입력하세요. : ");
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
	
	// 고객 장바구니 메뉴
	@Override
	public void cartMenu() {	
		// 장바구니 리스트 출력
		System.out.println("******* 장바구니 목록 *******");
		System.out.println("번호\t도서명\t저자\t가격\t수량");
		System.out.println("**********************");
		Iterator<Integer> ir = Cart.cartList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			System.out.println(Cart.cartList.get(key));
		}
		
		// 장바구니 메뉴
		System.out.println("======== 장바구니 ========");
		System.out.println("1.구매\t2.삭제\t3.이전");
		System.out.print("메뉴번호를 입력하세요. : ");
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

	// 메뉴에 없는 번호를 입력했을 때 출력문
	@Override
	public void inputError() {
		System.out.println("메뉴에 없는 번호입니다. 다시 입력해주세요.");
	}

}
