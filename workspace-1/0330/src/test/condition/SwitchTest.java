package test.condition;

import java.util.Calendar;

public class SwitchTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_WEEK); // 1~7사이의 요일 숫자
		char dayChar = 0;
		
		switch(day) {
		case 1 :
			dayChar = '일';
			break;
		case 2 :
			dayChar = '월';
			break;
		case 3 :
			dayChar = '화';
			break;
		case 4 :
			dayChar = '수';
			break;
		case 5 :
			dayChar = '목';
			break;
		case 6 :
			dayChar = '금';
			break;
		case 7 :
			dayChar = '토';
			break;
		}
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; // 0~11까지 반환 0:1월, ~
		int date = c.get(Calendar.DATE);
		
		System.out.printf("현재날짜는 %d년 %d월 %d일 %c요일", year, month, date, dayChar);
		
	}
}
