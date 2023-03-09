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
 * @author			: 김선우
 * @summary		: 고객 관련 기능 호출 용도
 */
public class GuestImpl implements Guest{
	// 싱글톤
	// private static GuestImpl guest = new GuestImpl();
	
	public GuestImpl() {}
	
	// public static GuestImpl getGuest() {
	//	return guest;
	// }
	
	// List들의 key를 id로 제공
	public static String Id;
	
	// 회원 로그인
	@SuppressWarnings("unchecked")					// 타입 캐스팅을 할 때 오류가 날 수 있는데 그거 체크 안하겠다.
	@Override
	public boolean guestLogin() {
		System.out.print("손님 ID : ");
		String id = Console.strInput();
		System.out.print("손님 PW : ");
		String pw = Console.strInput();
		try {
			// 회원가입을 통해 생성된 파일을 읽어드림(역직렬화)
			FileInputStream fileMemberIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + ".txt");
			DataInputStream memberIn = new DataInputStream(fileMemberIn);
			
			// ID랑 PASSWORD가 맞는지 확인
			if(id.equals(memberIn.readUTF())) {
				if(pw.equals(memberIn.readUTF())) {
					Id = id;
					System.out.println("=============================");
					System.out.println("로그인 되었습니다.");
					System.out.println("=============================");
					
					//회원이 기존 사용한 장바구니, 구매내역이 있는지 확인함
					// listIn : 각 리스트 파일을 읽어옴
					// cartListin, buyListin : 각 객체를 불러옴
					FileInputStream listIn;			
					try {
						listIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + "cartList.out");
						ObjectInputStream cartListIn = new ObjectInputStream(listIn);
						Cart.cartList = (HashMap<Integer, Book>) cartListIn.readObject();
						listIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + "buyList.out");
						ObjectInputStream buyListIn = new ObjectInputStream(listIn);
						Buy.buyList = (HashMap<Integer, Book>) buyListIn.readObject();
					
					} catch (FileNotFoundException e) {
						System.out.println(id+"님의 첫방문을 환영합니다~!");
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return true;
				} else {
					// 비밀번호가 맞지 않음
					System.out.println("비밀번호가 맞지 않습니다.");
					return false;
				}
			}
		} catch (FileNotFoundException e) {			// 아이디 파일이 안만들어져있음
			System.out.println("존재하는 아이디가 아닙니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 장바구니 삭제
	@Override
	public void cartDel() {
		// 삭제할 책 코드 입력
		System.out.print("삭제하려는 책의 코드를 입력하세요. [ 이전 : 0 ] : ");
		int code = Console.codeInput();
		
		// 장바구니 안에 입력한 코드 책이 있는지 확인
		if(Cart.cartList.containsKey(code)) {
			System.out.println("=================================");
			System.out.println("목록에서 삭제되었습니다.");
			System.out.println("=================================");
			Cart.cartList.remove(code);
		} else if(code == 0) {
			
		} else {
			System.out.println("=================================");
			System.out.println(code + "의 코드를 가진 도서가 장바구니에 있지 않습니다. 목록을 다시 확인해주시기 바랍니다.");
		}
	}

	// 장바구니 구매
	@Override
	public void cartBuy() {
		// 장바구니 안에서 구매할 항목 입력
		System.out.print("구매할 책의 코드를 입력하세요. [이전 : 0] : ");
		int code = Console.codeInput();
		
		// 입력한 코드와 맞는 책이 장바구니에 있는지 확인
		if(Cart.cartList.containsKey(code)) {
			// 구매할 개수 입력
			System.out.println("구매할 책의 개수를 입력하세요. [이전 : 0] : ");
			int count = Console.codeInput();
			
			// count가 장바구니 속 수량보다 많거나 재고 수량보다 많을 때
			if(count > Cart.cartList.get(code).getBookCount()) {
				System.out.println("입력하신 수량이 장바구니에 있는 수량보다 많습니다. 목록을 다시 확인해 주시기 바랍니다.");
			} else if(	count > Stock.stockList.get(code).getBookCount()) {
				System.out.println("입력하신 수량이 재고수량보다 많습니다. " + Stock.stockList.get(code).getBookCount() + 
						"이하의 수량을 입력해주시길 바랍니다.");
			} else {
				System.out.println("=================================");
				System.out.println("구매요청 되었습니다.");
				System.out.println("=================================");
				
				// 구매 요청 목록 추가 
				// 한번이라도 구매를 안했었다면 해당 ID의 리스트 공간 생성하기
				if(!Order.idOrderList.containsKey(Id)) {
					Order.idOrderList.put(Id, Order.getOrderList());
				}
				
				// 해당 책을 이전에 구매 요청했던 이력이 있으면 count++ / 없으면 new add 
				if(Order.idOrderList.get(Id).containsKey(code)) {
					Order.idOrderList.get(Id).get(code).addBookCount(count);
				} else {
					Order.idOrderList.get(Id).put(code, new Book(Stock.stockList.get(code)));
				}
				
				// 장바구니/재고에서 삭제
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
			System.out.println(code + "의 코드를 가진 도서가 장바구니에 있지 않습니다. 목록을 다시 확인해 주시기 바랍니다.");
		}
	}

	// 바로 구매
	@Override
	public void nowBuy() {
		// 구매할 책 코드 입력
		System.out.print("구매할 책의 코드를 입력하세요. [이전 : 0] : ");
		int code = Console.codeInput();
		
		// 재고에 남아있는 책인지 확인
		if(Stock.stockList.containsKey(code)) {
			// 구매 수량 입력
			System.out.print("구햄할 책의 개수를 입력하세요. [이전 : 0] : ");
			int count = Console.codeInput();
			
			// 입력한 수량이 재고 수량보다 큰지 확인
			if(count > Stock.stockList.get(code).getBookCount()) {
				System.out.println("입력하신 수량이 재고 수량보다 많습니다. " 
						+ Stock.stockList.get(code).getBookCount()
						+ "이하의 수량을 입력해주세요.");
			} else {
				System.out.println("==================================");
				System.out.println("구매요청 되었습니다.");
				System.out.println("==================================");
				
				// 구매 요청 목록 추가 
				// 한번이라도 구매를 안했었다면 해당 ID의 리스트 공간 생성하기
				if(!Order.idOrderList.containsKey(Id)) {
					Order.idOrderList.put(Id, Order.getOrderList());
				}
				
				// 해당 책을 이전에 구매 요청했던 이력이 있으면 count++ / 없으면 new add 
				if(Order.idOrderList.get(Id).containsKey(code)) {
					Order.idOrderList.get(Id).get(code).addBookCount(count);
				} else {
					Order.idOrderList.get(Id).put(code, new Book(Stock.stockList.get(code)));
				}
				
				// 재고에서 삭제
				// Buy count == Stock count => remove / != => count--
				if(Stock.stockList.get(code).getBookCount() == count) {
					Stock.stockList.remove(code);
				} else {
					Stock.stockList.get(code).subBookCount(count);
				}
			}
		} else if(code == 0) {		// 종료
			return ;
		} else {							// 코드 잘못 입력
			System.out.println("==============================");
			System.out.println(code + "의 코드를 가진 도서가 재고에 있지 않습니다. 목록을 다시 확인해 주시기 바랍니다.");
		}
	}

	// 장바구니 추가
	@Override
	public void cartAdd() {
		// 추가할 도서 코드 입력
		System.out.println("장바구니에 추가할 책의 코드를 입력하세요. [이전 : 0] : ");
		int code = Console.codeInput();
		
		// 재고에 있는 책인지 확인
		if(Stock.stockList.containsKey(code)) {
			// 추가할 개수 입력
			System.out.print("구매할 책의 개수를 입력하세요. [이전 : 0] : ");
			int count = Console.codeInput();
			
			// 입력한 수량이 재고 수량보다 큰지 확인
			if(count > Stock.stockList.get(code).getBookCount()) {
				System.out.println("입력하신 수량이 재고 수량보다 많습니다. " 
						+ Stock.stockList.get(code).getBookCount()
						+ "이하의 수량을 입력해주세요.");
			} else {
				System.out.println("==================================");
				System.out.println("장바구니에 추가되었습니다.");
				System.out.println("==================================");
				
				// 장바구니 목록 추가 
				// 해당 책을 이전에 장바구니에 추가한 이력이 있으면 count++ / 없으면 new add 
				if(Cart.cartList.containsKey(code)) {
					Cart.cartList.get(code).addBookCount(count);
				} else {
					Cart.cartList.put(code, new Book(Stock.stockList.get(code)));
				}
			}
		} else if(code == 0) {		// 종료
			return ;
		} else {							// 코드 잘못 입력
			System.out.println("==============================");
			System.out.println(code + "의 코드를 가진 도서가 재고에 있지 않습니다. 목록을 다시 확인해 주시기 바랍니다.");
		}
	}

	// 구매 완료 목록 리스트
	public void buyBookList() {
		System.out.println("*********** 구매 완료 목록 *********");
		System.out.println("번호\t도서명\t저자\t가격\t수량");
		System.out.println("**************************");
		Iterator<Integer> ir = Buy.buyList.keySet().iterator();
		while (ir.hasNext()) {
			int code = ir.next();
			System.out.println(Buy.buyList.get(code));
		}
	}
	
	// 환불 요청
	@Override
	public void refund() {
		// 구매한 도서 목록 출력
		buyBookList();
		
		// 환불할 책 코드 입력
		System.out.print("환불할 책의 개수를 입력하세요. [이전 : 0] : ");
		int code = Console.codeInput();
		
		// 책을 구매 했었는지 확인
		if(Buy.buyList.containsKey(code)) {
			// 환불할 개수 입력
			System.out.print("환불할 책의 개수를 입력하세요. [이전 : 0] : ");
			int count = Console.codeInput();
			
			// 입력한 수량이 구매한 수량보다 큰지 확인
			if(count > Buy.buyList.get(code).getBookCount()) {
				System.out.println("입력하신 수량이 구매했던 책의 수량보다 많습니다. " 
						+ Buy.buyList.get(code).getBookCount()
						+ "이하의 수량을 입력해주세요.");
			} else {
				System.out.println("==================================");
				System.out.println(count + "개의 책을 환불 요청하였습니다.");
				System.out.println("==================================");
				
				// 환불 요청목록 추가 
				// 한번이라도 환불 요청을 안했었다면 해당 ID의 리스트 공간 생성하기
				if(!Refund.idRefundList.containsKey(Id)) {
					Refund.idRefundList.put(Id, Refund.getRefundList());
				} 
				// 해당 책을 이전에 환불요청한 이력이 있으면 count++ / 없으면 new add 
				if(Refund.idRefundList.get(Id).containsKey(code)) {
					Refund.idRefundList.get(Id).get(code).addBookCount(count);
				} else {
					Refund.idRefundList.get(Id).put(code, new Book(Buy.buyList.get(code)));
				}
				
				// 구매 목록 삭제
				// Buy count == Refund count => remove / != => count--
				if(Buy.buyList.get(code).getBookCount() == count) {
					Buy.buyList.remove(code);
				} else {
					Buy.buyList.get(code).subBookCount(count);
				}
			}
		} else if(code == 0) {		// 종료
			return ;
		} else {							// 코드 잘못 입력
			System.out.println("==============================");
			System.out.println(code + "의 코드를 가진 도서를 구매하지 않았습니다. 목록을 다시 확인해 주시기 바랍니다.");
		}
	}

	// 회원가입
	@Override
	public void guestJoin() {
		System.out.println("=============================");
		System.out.println("회원가입");
		System.out.println("=============================");
		
		System.out.print("ID : ");
		String id = Console.strInput();
		System.out.print("PW : ");
		String pw = Console.strInput();
		try {
			// 이미 회원가입해서 생성된 아이디 파일이 있는지 확인
			FileInputStream fileMemberIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\" + id + ".txt");
			System.out.println("이미 사용하고 있는 아이디 입니다.");
			return;
		} catch (FileNotFoundException e) {
			// 없으면 새롭게 회원파일 생성(직렬화)
			try {
				// FileOutputStream : 영문이 입력되어 있는 파일에 내용을 출력하는 스트림 클래스
				// DataOutputStream : 문자,문자열이 아닌 일반 데이터(숫자, Bool, 실수 등)를 출력할 때 사용하는 스트림 클래스
				/*
				 * 숫자형 메소드 : Short, Byte, int, double, float, long
				 * 문자형 메소드 : UTF, Char
				 * 정의형 메소드 : Boolean
				 */
				FileOutputStream fileMemberOut = new FileOutputStream("C:\\Users\\Happy\\Downloads\\" + id + ".txt");
				DataOutputStream memberOut = new DataOutputStream(fileMemberOut);
				memberOut.writeUTF(id);
				memberOut.writeUTF(pw);
				System.out.println("=============================");
				System.out.println("회원가입 완료");
				System.out.println("=============================");
			} catch (FileNotFoundException e1) {			// 파일을 찾을 수 없을 때 에러난 상황
				e1.printStackTrace();
			} catch (IOException e1) {							// 입출력할 때 에러난 상황
				e1.printStackTrace();
			}
		}
	}

	// 로그아웃 : 장바구니와 구매완료 목록 파일에 저장
	@Override
	public void guestLogOut() {
		try {
			// 장바구니 내역 파일에 출력
			FileOutputStream fileCart = new FileOutputStream("C:\\Users\\Happy\\Downloads\\" + Id + "cartList.out");
			ObjectOutputStream cartList = new ObjectOutputStream(fileCart);
			// 내역이 있다면 넣기
			if(Cart.cartList != null) {
				cartList.writeObject(Cart.cartList);
				Cart.cartList.clear();
			}
			
			// 구매 내역 파일에 출력
			FileOutputStream fileBuy = new FileOutputStream("C:\\Users\\Happy\\Downloads\\" + Id + "buyList.out");
			ObjectOutputStream buyList = new ObjectOutputStream(fileBuy);
			// 내역이 있다면 넣기
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
