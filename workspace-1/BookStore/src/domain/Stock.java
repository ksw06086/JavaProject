package domain;

import java.io.Serializable;
import java.util.HashMap;

/*
 * 작성일 : 2023.02.06.
 * 작성자 : 김선우
 * 개요 : 재고 목록 데이터 호출
 * **/
public class Stock implements Serializable{
	// 직렬화 객체 번호
	private static final long serialVersionUID = 600L;
	
	// 책 재고 목록
	public static HashMap<Integer, Book> stockList = new HashMap<Integer, Book>();
	
	// 생성자
	public Stock() {}
}
