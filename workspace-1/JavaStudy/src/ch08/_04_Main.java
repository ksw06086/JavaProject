package ch08;

public class _04_Main {
	public static void main(String[] args) {
		_04_QueueImpl book = new _04_BookShelf();
		book.enQueue("�¹���1");
		book.enQueue("�¹���2");
		book.enQueue("�¹���3");
		System.out.println("Size : " + book.getSize());
		System.out.println("**********");
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
	}
}
