package ch10;

import java.util.TreeSet;

public class _17_TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("123");
		treeSet.add("789");
		treeSet.add("456");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		// �������� ���� - String Ŭ���� �ȿ� ���Ĺ���� �̹� �����Ǿ� ����
	}
}
