package ch10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_ArrayList {
	public static void main(String[] args) {
		/**
		 * <�÷��� �����ӿ�ũ>
		 * 
		 * Collection - List �������̽� - Ŭ������ ArrayList, Vector, LinkedList
		 * 				- Set �������̽� - Ŭ������ HashSet, TreeSet
		 * 
		 * Map �������̽� <- HashMap, TreeMap
		 * 						<- HashTable <- Properties
		 * 
		 * 1. Ư¡
		 * List �������̽� : ������ �ִ� �ڷ����, �ߺ����
		 * 						index�� ����Ͽ� ��ҿ� �����Ѵ�.
		 * 						����Ʈ�� ����մ� ��ҵ��� �ε����� 0���� �����Ѵ�.
		 * 						Ŭ���� ������ ArrayList, Vector, LinkedList
		 * 
		 * Set �������̽� : ������ ���� �ڷ����, �ߺ���� ����
		 * 						Ŭ������ HashSet, TreeSet
		 * 
		 * 2, ���� :
		 * ArrayList<������ Ÿ��Ŭ����> list = new ArrayList<������Ÿ��Ŭ����>();
		 * 
		 * ������ ����
		 * List<������Ÿ��Ŭ����> list = new ArrayList<������Ÿ��Ŭ����>();
		 * 
		 * 3. Ư¡ : ������ ������ �ְ�, �ߺ� ���
		 * 4. �߰� : list.add(�߰��� ��ġ index, ��);  / list.add(��);
		 * 5. ��ü : list.set(��ü�� ��ġ index, ��);
		 * 6. ���� : list.remove(������ ��ġ index);
		 * 7. �� �������� : list.get(������ index);
		 * 8. �˻� : list.indexOf(�˻��� ��);
		 * �� �ߺ��� ���Ǳ⿡ �˻��� �� ó������ ���� ���� ��ġ�� ã��
		 * 9. ��ü ���� : list.clear();
		 * 10. �ݺ��� : Iterator<E> iterator : while(hashNext) { next() }
		 * **/
		
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add("���ξ���");
		list.add("������Ʈ");
		list.add(1, "����");
		list.add(2, "ġ��");
		list.set(5, "����");
		
		// ��� 1. for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// ��� 2. ���� for��
		for(String i : list) {
			System.out.println(i + " ");
		}
		
		// ��� 3. �ݺ���(iterator) ���
		/*
		 * ������ : �ݺ��ڴ� java.util ��Ű���� ���ǵǾ� �ִ� Iterator �������̽��� �����ϴ� ��ü�̴�.
		 * 			�� �÷����� ���ҵ鿡 �����ϴ� ���� �����̴�.
		 * ���޼ҵ�
		 * hasNext() : ���� �������� ���� ��Ұ� ������ true�� ��ȯ
		 * next() : ���� ��Ҹ� ��ȯ... Object Ÿ���� ��ȯ
		 * remove() : �ֱٿ� ��ȯ�� ��Ҹ� �����Ѵ�.
		 * */
		List<String> list2 = new ArrayList<String>();
		list2.add("��");
		list2.add("����");
		list2.add("����");
		list2.add("�ܿ�");
		
		// ���1. for
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		
		System.out.println();
		
		// ���2. ���� for��
		for (String i : list2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// ���3. �ݺ���(Iterator) ����ϱ�
		// (�̰� ���� ��� ��������) �׷��� ���� ã�� ������ �ʱ�ȭ�� ���� ã��
		// list2.iterator().hasNext()�� ����ϸ� �����߾��µ� ���� ���� �� ó������ �Ź� �ʱ�ȭ ��
		String str = "";
		// ���̾Ƹ�� ������ �����ָ� �ٿ�ĳ���� �ʿ����
		Iterator iterator = list2.iterator(); // ���̾Ƹ�� ������ �������൵ ������ �⺻������ �����ִ°� ����
		
		// �߿�!!!
		// ArratList�� ���� �����ϴ��� üũ / hasNext() Ÿ���� boolean
		while (iterator.hasNext()) { // �ִϾ���? ������ true ����ϰ� �������� �Ѿ��
			// �����ϸ� �ݺ��ڴ� ���� �о Object Ÿ������ �����ϹǷ�, String���� ����ȯ
			str = (String) iterator.next();
			System.out.print(str + " ");		// next ���� ���� �� ���� ������ ���� �������� �Ѿ��
		}
		
	}
}
