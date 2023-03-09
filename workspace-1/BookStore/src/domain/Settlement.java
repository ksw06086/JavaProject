package domain;

import java.util.HashMap;

/*
 * 작성일 : 2023.02.06.
 * 작성자 : 김선우
 * 개요 : 오늘 하루 결산을 아이디별로 데이터 호출을 위한 객체(직렬화 안함)
 * **/
public class Settlement {
	// ID별 총 구매 금액 리스트
	public static HashMap<String, Integer> totalList = new HashMap<String, Integer>();
	
	// 생성자
	public Settlement() {}
}
