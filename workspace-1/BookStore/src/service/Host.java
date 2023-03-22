package service;

/*
 * 작성일 : 2023.02.10.
 * 작성자 : 김선우
 * 개요 : 관리자 관련 기능명세서
 * **/
public interface Host {
	// 기능 테스트용 관리자 로그인 데이터
	static String ID = "host";			// 관리자 고유ID 생성
	static String PASSWORD = "host";	// 관리자 고유PW 생성
	
	// 로그인
	boolean hostLogin();
	
	// 관리자 - 재고관리
	void bookList();					// 책목록
	void bookAdd();						// 책추가
	void bookUpdate();					// 책수정
	void bookDel();						// 책삭제
	
	// 관리자 - 주문관리
	void orderList();					// 주문목록
	void orderConfirm();				// 결제승인
	void orderCancel();					// 결제취소
	void saleTotal();					// 결산
}