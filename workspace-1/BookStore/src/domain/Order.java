package domain;

import java.util.HashMap;

/*
 * 작성일 : 2023.02.06.
 * 작성자 : 김선우
 * 개요 : 주문(구매승인요청) 목록 데이터 호출 용도
 * **/
public class Order {
	// 직렬화 객체 번호
	private static final long serialVersionUID = 400L;
	
	// id별 주문(구매승인요청)한 책 목록 
	public static HashMap<String, HashMap<Integer, Book>> idOrderList = new HashMap<String, HashMap<Integer,Book>>();
	
	// 생성자
	public Order() {}
	
	// ID가 새로 들어오면 해당 ID의 주문바구니 생성
	public static HashMap<Integer, Book> getOrderList(){
		return new HashMap<Integer, Book>();
	}
}
