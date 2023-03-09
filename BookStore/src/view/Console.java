package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.HashMap;

import domain.Book;
import domain.Code;
import domain.MenuList;
import domain.Order;
import domain.Refund;
import domain.Stock;

/*
 * 작성일 : 2023.02.11.~2023.02.13.
 * 작성자 : 김선우
 * 개요 : 저장된 객체 불러오기 및 Menu Login 화면 호출 용도
 * **/
public class Console extends MenuImpl{
	public static boolean inputReadSwit = false;		// 숫자 또는 문자열 입력 시 오류가 나면 true를 반환함
	private static BufferedReader reader;				// 객체 데이터를 가져오기 위한 IO객체
	
	// 생성자
	@SuppressWarnings("unchecked")
	public Console() {
		FileInputStream listIn;										// 바이트로 저장 되어있는 객체 읽어오는 변수
		try {
			// 절대 경로를 통해서 byte(객체) 읽어오기
			listIn = new FileInputStream("C:\\Users\\Happy\\Downloads\\hostList.out");
			
			// byte를 객체로 변환
			ObjectInputStream hostListIn = new ObjectInputStream(listIn);
			
			// 데이터 싸그리 갔다 넣기
			Stock.stockList = (HashMap<Integer, Book>) hostListIn.readObject();
			Order.idOrderList = (HashMap<String, HashMap<Integer,Book>>) hostListIn.readObject();
			Refund.idRefundList = (HashMap<String, HashMap<Integer,Book>>) hostListIn.readObject();
		} catch (FileNotFoundException e) {
			// 처음으로 서점 입장할 때는 파일이 없어서 에러 생김	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 서점입장
		commonMenu(MenuList.SHOP_LOGIN);
	}
	
	// 문자열 입력
	public static String strInput() {
		inputReadSwit = false;
		reader = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		// 예외처리
		try {
			str = reader.readLine();
		} catch (IOException e) {
			inputReadSwit = true;
			System.out.println("키보드 입력 에러~!");
		}
		return str;
	}
	
	// 숫자 입력
	public static int codeInput() {
		inputReadSwit = false;
		reader = new BufferedReader(new InputStreamReader(System.in));
		int code = 0;
		// 예외처리
		try {
			code = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			inputReadSwit = true;
			System.out.println("int 범위를 벗어났습니다. 키보드 입력 에러~!");
		} catch (IOException e) {
			inputReadSwit = true;
			System.out.println("키보드 입력 에러~!");
		}
		return code;
	}
}
