package domain;

/*
 * <열거형>
 * *** 상수선언을 하는 것과 열거형 클래스 하는 것에 차이점 ***
 * - DAY 인터페이스에 monday = 1
 * - MONTH 인터페이스에 january = 1
 * ㅁ 상식 : 서로 다른 집합의 상수는 비교하면 안됨 
 * ㄴ 하지만 이 둘을 비교했을 때 에러가 나지 않음 -> 객체를 인지하게 해주어서 하면 switch에 적용을 못함
 * (장점)
 * 1) 코드가 단순해지며 가독성이 좋음
 * 2) 인스턴스 생성과 상속을 방지함
 * 3) 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있음
 * 
 * **/
/*
 * 작성일 : 2023.03.06.
 * 작성자 : 김선우
 * 개요 : 재귀함수 호출 시 상수 코드로 사용 용도
 * **/
public enum MenuList {
	
	SHOP_LOGIN, 									// 메인화면(로그인)
	
	// 관리자 
	HOST_MENU,									// 관리자 메인메뉴

	HOST_STOCK_MENU, 						// 재고관리
	HOST_BOOK_LIST,							// 책목록
	HOST_BOOK_ADD,							// 책추가
	HOST_BOOK_UPDATE,						// 책수정
	HOST_BOOK_DEL,							// 책삭제
	
	HOST_ORDER_MENU,						// 주문관리
	HOST_ORDER_LIST,							// 주문목록

	HOST_ORDER_CONFIRM,					// 결제승인
	HOST_ORDER_CANCEL,					// 결제취소

	HOST_SALE_TOTAL,							// 결산
	
	// 고객
	GUEST_MENU,									// 고객 메인메뉴

	GUEST_GOODS_LIST,						// 상품목록
	GUEST_NOWBUY,							// 바로구매
	GUEST_CART_ADD,							// 장바구니 담기

	GUEST_CART_LIST,							// 장바구니 
	GUEST_CART_DEL,							// 장바구니 삭제
	GUEST_CART_BUY,							// 장바구니 구매
	
	GUEST_REFUND,								// 환불
	
	// 회원가입
	GUEST_JOIN									// 회원가입
	;
	
	
	/*
	 * <열거형에 값을 넣어줄 때>
	 * SHOP_LOGIN("메인화면");
	 * 
	 * private final String value;
	 * 
	 * MenuList(String value) { this.value = value; }
	 * 
	 * public String getValue() { return value; }
	 */
}
