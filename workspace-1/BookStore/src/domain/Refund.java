package domain;

import java.io.Serializable;
import java.util.HashMap;

/*
 * 작성일 : 2023.03.06.
 * 작성자 : 김선우
 * 개요 : 환불요청 목록을 아이디별로 데이터 호출하는 용도
 * **/
public class Refund implements Serializable{
	// 직렬화 객체 번호
	private static final long serialVersionUID = 500L;
	
	// id별 환불 요청 리스트 // ??? 왜 이렇게 만들었지? 리스트를 먼저 만들고 Id 별로 하면 되지 않나?
	public static HashMap<String, HashMap<Integer, Book>> idRefundList = new HashMap<String, HashMap<Integer,Book>>();
	
	// 생성자
	public Refund() {}
	
	// ID가 새로 들어오면 해당 ID의 환불내역바구니 생성
	public static HashMap<Integer, Book> getRefundList(){
		return new HashMap<Integer, Book>();
	}
}
