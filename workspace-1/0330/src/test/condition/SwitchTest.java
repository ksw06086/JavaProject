package test.condition;

import java.util.Calendar;

public class SwitchTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_WEEK); // 1~7������ ���� ����
		char dayChar = 0;
		
		switch(day) {
		case 1 :
			dayChar = '��';
			break;
		case 2 :
			dayChar = '��';
			break;
		case 3 :
			dayChar = 'ȭ';
			break;
		case 4 :
			dayChar = '��';
			break;
		case 5 :
			dayChar = '��';
			break;
		case 6 :
			dayChar = '��';
			break;
		case 7 :
			dayChar = '��';
			break;
		}
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; // 0~11���� ��ȯ 0:1��, ~
		int date = c.get(Calendar.DATE);
		
		System.out.printf("���糯¥�� %d�� %d�� %d�� %c����", year, month, date, dayChar);
		
	}
}
