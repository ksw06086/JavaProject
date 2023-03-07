package domain;

/*
 * 작성일 : 2023.03.06.
 * 작성자 : 김선우
 * 개요 : 재귀함수 호출 시 상수 코드로 사용 용도
 * **/
public interface Code {
	// 상수
	static final int SHOP_LOGIN = 999;							//  로그인
	
	// 관리자
	static final int HOST_MENU = 100;							// 관리자
	
	// 관리자 - 재고관리
	static final int HOST_STOCK_MENU = 110;				// 재고관리
	static final int HOST_BOOK_LIST = 111;					// 책목록
	static final int HOST_BOOK_ADD = 112;					// 책추가
	static final int HOST_BOOK_UPDATE = 113;				// 책수정
	static final int HOST_BOOK_DEL = 114;						// 책삭제
	
	// 관리자 - 주문관리
	static final int HOST_ORDER_MENU = 120;				// 주문관리
	static final int HOST_ORDER_LIST = 121;					// 주문목록
	// 관리자 - 결제기능
	static final int HOST_ORDER_CONFIRM = 122;			// 결제승인
	static final int HOST_ORDER_CANCEL = 123;			// 결제취소
	// 관리자 - 결산
	static final int HOST_SALE_TOTAL = 124;					// 결산
	
	// 손님
	static final int GUEST_MENU = 200;							// 손님
	
	// 손님 - 상품목록
	static final int GUEST_GOODS_LIST = 210;				// 상품모록
	static final int GUEST_NOWBUY = 211;						// 바로구매
	static final int GUEST_CART_ADD = 212;					// 장바구니 담기
	
	// 손님 - 장바구니
	static final int GUEST_CART_LIST = 220;					// 장바구니
	static final int GUEST_CART_DEL = 221;					// 장바구니 삭제
	static final int GUEST_CART_BUY = 222; 					// 장바구니 구매
			
	static final int GUEST_REFUND = 230;						// 환불
	
	// 회원가입
	static final int GUEST_JOIN = 300;							// 회원가입
}
