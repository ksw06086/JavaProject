package ch10;

import java.util.HashMap;
import java.util.Map;

public class _11_HashMapEx {
	public static void main(String[] args) {
		Map<String, _05_Member> map = new HashMap<>();
		
		// hashMap �߰�
		map.put("M001", new _05_Member(1, "ȫ�浿"));
		map.put("M002", new _05_Member(2, "������"));
		map.put("M003", new _05_Member(3, "�������"));
		
		System.out.println(map);
		
		// �������
		map.remove("M002");
		System.out.println(map);
		
		//����߰�
		map.put("M003", new _05_Member(3, "����Ŭ"));
		System.out.println(map);
		
		//��ȸ
		// Map.Entry<String, _05_Member> str => �������̽�<key Ÿ��, value Ÿ��> ������
		// entrySet() �޼ҵ� : map�� �����ϴ� �⺻������ entry�� �ڹ� ��ƿ ���� ���·� ��ȯ
		for (Map.Entry<String, _05_Member> str : map.entrySet()) {
			String key = str.getKey();
			_05_Member value = str.getValue();
			System.out.println("key : " + key + ", value : " + value);
		}
	}
}
