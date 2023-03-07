package ch05;

import java.util.ArrayList;

public class _11_ArrayListTest {
	public static void main(String[] args) {
		ArrayList<_11_Book> library = new ArrayList<_11_Book>();
		
		library.add(new _11_Book("�¹���", "������"));
		library.add(new _11_Book("���̾�", "�츣�� �켼"));
		library.add(new _11_Book("��� �� ���ΰ�", "���ù�"));
		library.add(new _11_Book("����", "�ڰ渮"));
		library.add(new _11_Book("�����", "�������丮"));
		
		for (int i = 0; i < library.size(); i++) {
			_11_Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== ���� for�� ��� ===");
		for (_11_Book book : library) {
			book.showBookInfo();
		}
	}
}
