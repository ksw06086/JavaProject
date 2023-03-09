package domain;

import java.io.Serializable;
import java.util.HashMap;

/*
 * 작성일 : 2023.02.06.
 * 작성자 : 김선우
 * 개요 : 장바구니 목록 데이터 호출 용도
 * **/
public class Cart implements Serializable{
	// 직렬화 객체 번호
	private static final long serialVersionUID = 300L;
	
	// 장바구니 목록
	public static HashMap<Integer, Book> cartList = new HashMap<Integer, Book>();
	
	// 생성자
	public Cart() {}
}
