package ch05;

public class _04_ArrayEx {
	public static void main(String[] args) {
		_04_Book library = new _04_Book("�Ʊ���� ������", " ����");
		library.showBookInfo();
		
		_04_Book[] books = new _04_Book[5];
		// �迭�ʱ�ȭ
		books[0] = new _04_Book("10�� ��", "������");
		books[1] = new _04_Book("���� ������ �ʴ� ��ȭ��", "��ȭ��");
		books[2] = new _04_Book("�̿���� ���", "��");
		books[3] = new _04_Book("������ ����", "�̱���");
		books[4] = new _04_Book("����� �µ�", "�̱���");
		
		// �ּҰ� ȣ��
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
		// �� ȣ��
		for(int i = 0; i < books.length; i++) {
			books[i].showBookInfo();
		}
	}
}
