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
 * @project		: 서점 관리 프로그램
 * @date				: 2023.02.16.~2023.03.09
 * @author			: 김선우
 * @summary		: 관리자 관련 기능 호출 용도
 */
public class HostImpl implements Host{
	/*
	 * 싱글톤
	 * 
	 * private static HostImpl guest = new GuestImpl(); 
	 * private HostImpl() {} 
	 * public static HostImpl getGuest() { return guest; }
	 */
	
	public HostImpl() {}
	
	// 관리자 로그인
	@Override
	public boolean hostLogin() {		
		System.out.print("관리자 ID : ");
		String id = Console.strInput();
		System.out.print("관리자 PW : ");
		String pw = Console.strInput();
		if(id.equals(ID) && pw.equals(PASSWORD)) {
			System.out.println("=================================");
			System.out.println("로그인 되었습니다.");
			System.out.println("=================================");
			return true;
		} else if(id.equals(ID)) {
			System.out.println("비밀번호가 맞지 않습니다.");
		} else if(id.equals(PASSWORD)) {
			System.out.println("아이디가 맞지 않습니다.");
		} else {
			System.out.println("아이디와 비밀번호 둘 다 맞지 않습니다.");
		}
		return false;
	}

	// 책 목록
	@Override
	public void bookList() {
		System.out.println("********* 도서 목록 *********");
		System.out.println("번호\t도서명\t저자\t가격\t수량");
		System.out.println("*************************");
		Iterator<Integer> ir = Stock.stockList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			System.out.println(Stock.stockList.get(key));
		}
	}

	// 책 추가
	@Override
	public void bookAdd() {
		System.out.println("============ 도서 등록 =============");
		System.out.println("책 제목 : ");
		String name = Console.strInput();
		System.out.println("책 저자 : ");
		String author = Console.strInput();
		System.out.println("책 가격 : ");
		int price = Console.codeInput();
		System.out.println("책 수량 : ");
		int count = Console.codeInput();
		
		// 키보드 오류, 가격 오기입, 수량 오기입시 등록 취소하고 관리자 화면으로 돌아감
		if(Console.inputReadSwit) {
			System.out.println("키보드 오류로 인해 등록이 취소됩니다.");
			return ;
		} else if(price < 0) {
			System.out.println("가격은 0원이상입니다.");
		} else if(count < 1) {
			System.out.println("추가할 책은 1개 이상부터입니다.");
		}
		
		// 모두 같고 수량만 다를 때 개수 추가만 하기
		Iterator<Integer> ir = Stock.stockList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			if(Stock.stockList.get(key).getBookTitle().equals(name) && 
					Stock.stockList.get(key).getBookAuthor().equals(author) &&
					Stock.stockList.get(key).getBookPrice() == price) {
					Stock.stockList.get(key).addBookCount(count);
					System.out.println("===========================");
					System.out.println("수량만 다르기에 해당 도서의 개수가 추가되었습니다.");
					System.out.println("===========================");
					return;
			}
		}
		
		// 코드 생성해서 새로 등록하기
		int code = Book.getCodeNumber();
		Stock.stockList.put(code, new Book(name, author, price, count, code));
		System.out.println("===========================");
		System.out.println("도서가 등록되었습니다.");
		System.out.println("===========================");
	}

	// 책 수정
	@Override
	public void bookUpdate() {
		bookList();
		System.out.print("수정할 책의 코드를 입력해주세요. [이전 : 0] : ");
		int code = Console.codeInput();
		if(Stock.stockList.containsKey(code)) {
			while(true) {
				System.out.print("무엇을 수정하시겠습니까?. [제목 : 1, 저자 : 2, 가격 : 3, 수량 : 4, 수정종료 : 0] : ");
				int swit = Console.codeInput();
				switch (swit) {
					case 1:
						System.out.print("현재 제목 : " + Stock.stockList.get(code).getBookTitle() + 
								", 수정하고 싶으신 제목을 입력해주세요. : ");
						Stock.stockList.get(code).setBookTitle(Console.strInput());
						break;
					case 2:
						System.out.print("현재 저자 : " + Stock.stockList.get(code).getBookAuthor() + 
								", 수정하고 싶으신 저자를 입력해주세요. : ");
						Stock.stockList.get(code).setBookAuthor(Console.strInput());
						break;
					case 3:
						System.out.print("현재 가격 : " + Stock.stockList.get(code).getBookPrice() + 
								", 수정하고 싶으신 가격을 입력해주세요. : ");
						int price = Console.codeInput();
						if(price < 0) {
							System.out.println("0원(공짜)보다 더 낮은 금액은 없습니다.");
							return;
						}
						Stock.stockList.get(code).setBookPrice(price);
						break;
					case 4:
						System.out.print("현재 수량 : " + Stock.stockList.get(code).getBookCount() + 
								", 수정하고 싶으신 수량을 입력해주세요. : ");
						int count = Console.codeInput();
						if(count < 0) {
							System.out.println("수량은 1개 이상입니다.");
							return;
						}
						Stock.stockList.get(code).setBookCount(count);
						break;
					case 0:
						return;
					default:
						System.out.println("0~4까지의 숫자 중 하나만 입력해 주세요.");
						break;
				}
				if(Console.inputReadSwit) {
					System.out.println("키보드 오류로 인해 수정이 취소됩니다.");
					return;
				}
				System.out.println("=================================");
				System.out.println(code + "의 코드를 가진 도서가 수정되었습니다.");
				System.out.println("=================================");
			} 
		} else if(code == 0) {
			return ;		// 종료
		} else {
			System.out.println("=================================");
			System.out.println(code + "의 코드를 가진 도서가 목록에 잇지 않습니다. 목록을 다시 확인해주시기 바랍니다. ");
			System.out.println("=================================");
		}
	}

	// 책 삭제
	@Override
	public void bookDel() {
		System.out.print("삭제할 책의 코드를 입력하세요. [이전 : 0] : ");
		int code = Console.codeInput();
		if(Stock.stockList.containsKey(code)) {	// 코드에 맞는 책이 재고목록에 있는지 확인
			Stock.stockList.remove(code);
			System.out.println("===========================");
			System.out.println(code + "의 코드를 가진 도서가 삭제되었습니다.");
			System.out.println("===========================");
		} else if(code == 0) {
			return ;		// 종료
		} else {
			System.out.println("===========================");
			System.out.println(code + "의 코드를 가진 도서가 목록에 있지 않습니다. 목록을 다시 확인해주시기 바랍니다.");
			System.out.println("===========================");
		}
	}

	// 주문목록
	@Override
	public void orderList() {
		System.out.println("********** 구매 요청 목록 *********");
		System.out.println("ID\t번호\t도서명\t저자\t가격\t수량");
		System.out.println("*************************");
		Iterator<String> ir = Order.idOrderList.keySet().iterator();
		while (ir.hasNext()) {			// ID별 주문한 도서 목록들 가져오기
			String key = ir.next();
			Iterator<Integer> ir2 = Order.idOrderList.get(key).keySet().iterator();
			while (ir2.hasNext()) {		// code별 도서 객체 가져오기
				int code = ir2.next();
				System.out.println(key + "\t" + Order.idOrderList.get(key).get(code));
			}
			
		}
	}

	// 결제승인
	@Override
	public void orderConfirm() {
		System.out.print("구매 승인할 ID를 입력하세요. [이전 : 0] : ");
		String id = Console.strInput();
		System.out.print("구매 승인할 책의 코드를 입력하세요. [이전 : 0] : ");
		int code = Console.codeInput();
		if(Order.idOrderList.containsKey(id)) {			// 해당 아이디 있는지 확인
			// 고객이 로그아웃 시 구매완료 목록이 파일화가 되어서 여기서 승인을 해주면 그 파일에 추가가 되어야함
			// 구매완료, 장바구니를 주문처럼 ID 별 Map을 만들어보는 것을 완성 후 생각해서 수정해보기로 함
			try {
				FileInputStream listIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + "buyList.out");
				ObjectInputStream buyList = new ObjectInputStream(listIn);
				Buy.buyList = (HashMap<Integer, Book>) buyList.readObject();
			} catch (FileNotFoundException e) {
				System.out.println(id + "의 BuyList 파일이 없습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			// 구매 요청 목록에 입력한 코드에 맞는 책이 있는지 확인
			if(Order.idOrderList.get(id).containsKey(code)) {
				// 결산 객체에 금액 +
				int totalPrice = Order.idOrderList.get(id).get(code).getBookTotalPrice();
				if(!Settlement.totalList.containsKey(id)) {				// 결산 목록에 등록된 아이디인지 확인
					Settlement.totalList.put(id, totalPrice);
				} else {
					Settlement.totalList.put(id, Settlement.totalList.get(id) + totalPrice);
				}
				
				// 구매 완료 목록에 추가 및 구매요청 목록에서 삭제
				Buy.buyList.put(code , Order.idOrderList.get(id).get(code));
				Order.idOrderList.get(id).remove(code);
				System.out.println("================================");
				System.out.println("결제 승인 되었습니다.");
				System.out.println("================================");
			} else if(code == 0) {
				
			} else {
				System.out.println("================================");
				System.out.println(code + "의 코드를 가진 도서를 구매한 사람이 없습니다. 목록을 다시 확인해 주시기 바랍니다.");
			}
			
			// 구매 완료 목록 다시 파일에 저장
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
			System.out.println("입력하신 아이디를 가진 고객이 구매요청을 한 적이 없습니다.");
		}
	}

	// 환불승인
	@Override
	public void orderCancel() {
		System.out.println("********* 환불 요청 목록 **********");
		System.out.println("ID\t번호\t도서명\t저자\t가격\t수량");
		System.out.println("**************************");
		// 아이디 별 목록 출력
		Iterator<String> ir = Refund.idRefundList.keySet().iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			Iterator<Integer> ir2 = Refund.idRefundList.get(key).keySet().iterator();
			while (ir2.hasNext()) {
				Integer code = ir2.next();
				System.out.println(key + "\t" + Refund.idRefundList.get(key).get(code));
			}
		}
		
		// 승인 처리 시작
		System.out.println("환불 승인할 ID를 입력하세요. [이전 : 0]");
		String id = Console.strInput();
		System.out.print("환불 승인할 책의 코드를 입력하세요. [이전 : 0] : ");
		int code = Console.codeInput();
		if(Refund.idRefundList.containsKey(id)) {					// 해당 아이디가 환불했는지 확인
			// 환불 요청 목록에 입력한 코드에 맞는 책이 있는지 확인
			if(Refund.idRefundList.get(id).containsKey(code)) {
				if(Stock.stockList.containsKey(code)) {			// 환불하려는 책이 재고에 있으면 수만 추가
					Stock.stockList.get(code).setBookCount(
							Stock.stockList.get(code).getBookCount() + 
							Refund.idRefundList.get(id).get(code).getBookCount());
				} else {
					Stock.stockList.put(code, new Book(Refund.idRefundList.get(id).get(code)));
				}
				
				// 결산 객체 수정 후 해당 목록 환불 객체에서 삭제
				Settlement.totalList.put(id, Settlement.totalList.get(id) - 
															Refund.idRefundList.get(id).get(code).getBookTotalPrice());
				Refund.idRefundList.get(id).remove(code);
				System.out.println("================================");
				System.out.println("환불 처리 되었습니다.");
				System.out.println("================================");
			} else if(code == 0) {
				
			} else {
				System.out.println("================================");
				System.out.println(code + "의 코드를 가진 도서를 환불 요청한 사람이 없습니다. 목록을 다시 확인해 주시기 바랍니다.");
			}
		} else {
			System.out.println("입력하신 아이디가 환불요청 목록에 없습니다.");
		}
	}

	// 결산
	@Override
	public void saleTotal() {
		// 아이디별 결산 출력
		if(!Settlement.totalList.isEmpty()) {
			Iterator<String> ir = Settlement.totalList.keySet().iterator();
			while (ir.hasNext()) {
				String id = ir.next();
				System.out.print(id + "의 총 구매액은 : ");
				System.out.printf("%,d원 입니다.\n", Settlement.totalList.get(id));
			}
		} else {
			System.out.println("아직 책을 구매한 아이디가 없거나 결제승인을 하지 않았습니다.");
		}
	}
}
