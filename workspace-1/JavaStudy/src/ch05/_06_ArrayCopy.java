package ch05;

public class _06_ArrayCopy {
	public static void main(String[] args) {
		// ���� ���� : ��ü �迭�� �����ϸ� �׻� �ν��Ͻ� �ּҰ� ����Ǿ� �����ϹǷ�, ������ �迭���� ����� copy�� �迭�� ���� ����ȴ�.
		// System.arraycopy(������ �迭, ������ ù ��ġ, ��� �迭, �ٿ����� ù ��ġ, ������ ��� ����);
		// ���� �� ����
		_04_Book[] book = new _04_Book[3];
		_04_Book[] book2 = new _04_Book[3];
		
		// �迭 �ʱ�ȭ
		book[0] = new _04_Book("10�� ��", "������");
		book[1] = new _04_Book("���� ������ �ʴ� ��ȭ��", "��ȭ��");
		book[2] = new _04_Book("�̿���� ���", "��");
		
		// ���� ����
		System.arraycopy(book, 0, book2, 0, 3);
		
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
