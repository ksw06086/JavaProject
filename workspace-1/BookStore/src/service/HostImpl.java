package service;

import java.util.Iterator;

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
	}

	@Override
	public void bookUpdate() {
		
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
