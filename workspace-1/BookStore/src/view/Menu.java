package view;

import domain.MenuList;

/*
 * �ۼ��� : 2023.03.06.
 * �ۼ��� : �輱��
 * ���� : �޴� ���� ��� ���� �뵵
 * **/
public interface Menu {
	void commonMenu(MenuList code);		// ����޴�
	void loginMenu();							// �α��θ޴�
	void hostMenu();							// �����ڸ޴�
	void stockMenu();						// ������ �������޴�
	void orderMenu();						// ������ �ֹ������޴�
	
	void guestMenu();						// ���޴�
	void goodsMenu();						// ��ǰ��ϸ޴�
	void cartMenu();							// �� ��ٱ��� �޴�
	void inputError();							// �Է� ����
}
