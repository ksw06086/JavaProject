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
			
			// 아이디랑 비번이 입력한게 맞는지 확인
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
		} catch (FileNotFoundException e) {
			System.out.println("존재하는 아이디가 아닙니다.");
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
