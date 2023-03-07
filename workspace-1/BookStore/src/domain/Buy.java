package domain;

import java.io.Serializable;
import java.util.HashMap;

/*
 * 작성일 : 2023.03.06.
 * 작성자 : 김선우
 * 개요 : 구매완료 목록 데이터 호출 용도
 * **/
public class Buy implements Serializable {
	// 직렬화 객체 번호
	private static final long serialVersionUID = 200L;
	
	// 구매한 책 목록
	public static HashMap<Integer, Book> buyList = new HashMap<Integer, Book>();
	
	// 생성자
	public Buy() {}
}
