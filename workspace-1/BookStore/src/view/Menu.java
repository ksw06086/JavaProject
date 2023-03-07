package view;

import domain.MenuList;

/*
 * 작성일 : 2023.03.06.
 * 작성자 : 김선우
 * 개요 : 메뉴 관련 기능 명세서 용도
 * **/
public interface Menu {
	void commonMenu(MenuList code);		// 공통메뉴
	void loginMenu();							// 로그인메뉴
	void hostMenu();							// 관리자메뉴
	void stockMenu();						// 관리자 재고관리메뉴
	void orderMenu();						// 관리자 주문관리메뉴
	
	void guestMenu();						// 고객메뉴
	void goodsMenu();						// 상품목록메뉴
	void cartMenu();							// 고객 장바구니 메뉴
	void inputError();							// 입력 오류
}
