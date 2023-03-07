package ch10;

import java.util.LinkedList;

public class _13_LinkedListTest {
	public static void main(String[] args) {
		/**
		 * ����ϴ� �ڷ��� ����(����, ����)�� ���� ��쿡�� ��ũ�� ����Ʈ��,
		 * �ڷắ���� ���� ���� ��쿡�� �迭�� ����ϴ� ���� ȿ�����̴�.
		 * 
		 * ��ũ�� ����Ʈ�� �� �� �Ǵ� �� �ڿ� ��Ҹ� �߰�, �����ϴ� addFirst(), addLast(), removeLast(), removeFirst() �޼ҵ尡 �ִ�.
		 * */
		
		// ��ũ�� ����Ʈ ����
		LinkedList<String> myList = new LinkedList<String>();
		
		// ��ũ�帮��Ʈ�� ������ �߰�
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//����Ʈ ��ü ���
		System.out.println(myList); // .toString ����
		
		myList.add(1,"D");
		System.out.println(myList); // .toString ����
		
		myList.addFirst("0");
		System.out.println(myList); // .toString ����
		
		System.out.println(myList.removeLast());
		System.out.println(myList); // .toString ����
		
	}
}
