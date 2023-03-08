package service;

import java.util.Iterator;

import domain.Book;
import domain.Stock;
import view.Console;

/**
 * @fileName		: BookStore
 * @project		: 서점 관리 프로그램
 * @date				: 2023.03.07.
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
		System.out.println("번호\t도서명\t저자\t가격\t수량\t상태");
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
