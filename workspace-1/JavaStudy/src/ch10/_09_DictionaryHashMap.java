package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _09_DictionaryHashMap {
	public static void main(String[] args) {
		// ������� �ۼ��ϱ�
		/**
		 * �Է� : word
		 * �б� : school
		 * ���� : miracle
		 * �޷� : calendar
		 * �� : water
		 * �� : flower
		 * */
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("school", "�б�");
		dictionary.put("miracle", "����");
		dictionary.put("calendar", "�޷�");
		dictionary.put("water", "��");
		dictionary.put("flower", "��");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("== �ܾ� �˻� : S, ���� : Q, ������ �ִ� �ܾ�� �� ��Ϻ��� : A, �ܾ� ��� : I ===");
			String swit = sc.next();
			if(swit.equals("Q") || swit.equals("q")) {
				return ;
			} else if(swit.equals("S") || swit.equals("s")) {
				System.out.print("ã�� ���� �ܾ �Է��ϼ���. ����� Q�Դϴ�. : ");
				String word = sc.next();
				if(word.equals("Q") || word.equals("q")) {
					return ;
				}
				if(dictionary.containsKey(word)) {
					System.out.println(word + "�� �ǹ̴� " + dictionary.get(word) + "�Դϴ�.");
				} else {
					System.out.println("������ " + word + "�� �ǹ̰� �������� �ʽ��ϴ�.");
				}
			} else if(swit.equals("A") || swit.equals("a")) {
				if(dictionary.isEmpty()) {
					System.out.println("��������� �ܾ ��ϵǾ� ���� �ʽ��ϴ�.");
				} else {
					System.out.println("===== ���� �ܾ� ��� ===");
					Iterator<String> ir = dictionary.keySet().iterator();
					while (ir.hasNext()) {
						String key = ir.next();
						System.out.println(key + " : " + dictionary.get(key));
					}
				}
			} else if(swit.equals("I") || swit.equals("i")) {
				System.out.println("����ϰ� ���� �ܾ �Է����ּ��� : ");
				String eng = sc.next();
				if(dictionary.containsKey(eng)) {
					System.out.println("�Ȱ��� �ܾ �̹� ��ϵǾ� �ֽ��ϴ�.");
					continue;
				} else {
					System.out.println("����� �ܾ��� ���� �Է����ּ��� : ");
					String value = sc.next();
					dictionary.put(eng, value);
					System.out.println(eng + "�� ��������� ��ϵǾ����ϴ�.");
				}
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
			 
		}
	}
}
