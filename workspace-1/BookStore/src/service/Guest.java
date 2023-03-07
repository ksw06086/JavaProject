package service;

/*
 * 작성일 : 2023.03.06.
 * 작성자 : 김선우
 * 개요 : 고객 관련 기능명세서
 * **/
public interface Guest {
	// 기능 테스트용 고객 로그인 데이터
	static String ID = "guest";					// 손님 고유 ID 생성
	static String PASSWORD = "guest";		// 손냄 고유 PW 생성
	
	// 손님 - 장바구니 목록에서 사용할 기능
	boolean guestLogin();							// 로그인
	void cartDel();										// 장바구니 삭제
	void cartBuy();									// 장바구니 구매
	
	// 손님 - 상품목록에서 사용할 기능
	void nowBuy();									// 바로구매
	void cartAdd();										// 장바구니 추가
	
	void refund();										// 환불
	
	// 회원가입
	void guestJoin();									// 회원가입				
	void guestLogOut();								// 로그아웃
}