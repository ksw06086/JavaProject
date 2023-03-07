package ch10;

import java.util.ArrayList;
import java.util.List;

public class _03_ArrayList {
	public static void main(String[] args) {
		/*
		 * 8. �˻� : list.indexOf(�˻��� ��); // �߿�!
		 * 			����Ʈ���� �˻��� ���� �Ȱ��� ���� ���� ù��° �����͸� ã�Ƽ� �� ��ġ�� �ε����� �����Ѵ�.
		 * 			�˻��� ���� ��ġ�� �����Ͱ� ������ -1�� �����Ѵ�.
		 * 			list.lastIndexOf(�˻��� ��);
		 * 			����Ʈ���� �˻��� ���� �Ȱ��� ���� ���� ��������° �����͸� ã�Ƽ� �� ��ġ�� �ε����� �����Ѵ�.
		 * 			�˻��� ���� ��ġ�� �����Ͱ� ������ -1�� �����Ѵ�.
		 * */
		// import�� ��ΰ� �������� �� ���� �ִµ� �� ���� �ؾ��Ѵ�.
		List<String> list = new ArrayList<String>();
		list.add("H");
		list.add("O");
		list.add("N");
		list.add("G");
		list.add("G");
		list.add("I");
		list.add("L");
		list.add("D");
		list.add("O");
		list.add("N");
		list.add("G");
		
		// ��ġ�ϴ� ù��° �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
		System.out.println("G������ �ε��� : " + list.indexOf("G"));
		System.out.println("N������ �ε��� : " + list.indexOf("N"));
		// ��ġ�ϴ� ��������° �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
		System.out.println("G������ �ε��� : " + list.lastIndexOf("G"));
		System.out.println("N������ �ε��� : " + list.lastIndexOf("N"));
		System.out.println("Z������ �ε��� : " + list.lastIndexOf("Z"));
		
		// list ��ü ���, ��ü ����Ʈ ���
		System.out.println("����Ʈ ���� �� : " + list);
		
		// list ��ü ����
		list.clear();
		System.out.println("����Ʈ ���� �� : " + list);
	}
}
