package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _07_HashMap {
	/*
	 * �ؽ�(hashing) : Ű�� �̿��ؼ� �ؽ����̺�κ��� �����͸� �������� ����
	 * 
	 * HashMap
	 * 1) Ư¡
	 * - �������� ������ �������� �ʴ´�.
	 * - key�� value ������ ����ȴ�.
	 * - key�� �ߺ��Ǹ� �ȵȴ�.
	 * - key�� �̿��ؼ� value�� ������ �� �մ�.
	 * - List �迭�� �޸� index�� ����.
	 * - Map�̶�� �������̽��� ������ Ŭ����
	 * 
	 * 2) ����
	 * - HashMap<key Ÿ��, value Ÿ��> map = new HashMap<key Ÿ��, value Ÿ��>();
	 * - Map<key Ÿ��, value Ÿ��> map = new HashMap<key Ÿ��, value Ÿ��>(); // ����������
	 * 
	 * 3) �޼ҵ� 
	 * ������ �߰� : put(key, value)
	 * ������ �������� : get(key)
	 * ������ ���� : remove(key)
	 * �����Ͱ� ����ִ��� ���� : isEmpty();
	 * �ش� Ű�� �ִ��� ���� : containsKey(key);
	 * �ش� ���� �ִ��� ���� : containsValue(value);
	 * �ش� ���� : size();
	 * **/
	public static void main(String[] args) {
		//map ����
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "hong");
		map.put(2, "kim");
		map.put(3, "lee");
		map.put(4, "park");
		map.put(5, "son");
		
		// map ��ü���
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		// park ������ ��������
		System.out.println(map.get(4));
		
		// lee ������ ����
		map.remove(3);
		
		// map ��ü���
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		// ������ ����ִ���
		System.out.println(map.isEmpty());
		
		// Ű ���� ����
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(3));
		
		// �� ���� ����
		System.out.println(map.containsValue("son"));
		System.out.println(map.containsValue("lee"));
		
		// ����
		System.out.println(map.size());
	}
}
