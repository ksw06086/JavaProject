package ch05;

public class _07_ArrayCopy {
	public static void main(String[] args) {
		// ���� ���� : ���� �ν��Ͻ��� ����� ���� �����ؾ� �Ѵ�.
		// �迭 ���� �� ����
		_04_Book[] book = new _04_Book[3];
		_04_Book[] book2 = new _04_Book[3];
		
		// �迭 �ʱ�ȭ
		book[0] = new _04_Book("10�� ��", "������");
		book[1] = new _04_Book("���� ������ �ʴ� ��ȭ��", "��ȭ��");
		book[2] = new _04_Book("�̿���� ���", "��");
		
		// �߰� ����
		// ����Ʈ �����ڷ� book2 �迭 �ν��Ͻ� ����
		book2[0] = new _04_Book();
		book2[1] = new _04_Book();
		book2[2] = new _04_Book();
		for(int i = 0; i<book2.length; i++) {
			book2[i].setBookName(book[i].getBookName());
			book2[i].setAuthor(book[i].getAuthor());
		}
		// �߰� ����
		
		System.out.println("=== ���� �� book2 ===");
		for(int i = 0; i < book2.length; i++) {
			book2[i].showBookInfo();
		}
		
		// book�� ���� ����
		System.out.println("=== ���� �� book ===");
		book[0].setBookName("�Ƴ����� �ִ� ����");
		book[1].setAuthor("�������� ���");
		for(int i = 0; i < book.length; i++) {
			book[i].showBookInfo();
		}
		
		System.out.println("=== ���� �� book2 ===");
		for(int i = 0; i < book2.length; i++) {
			book2[i].showBookInfo();
		}
	}
}
