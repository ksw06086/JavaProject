package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _15_MemberHashMap {
	// HashMap ����
	// Map<key ������Ÿ��, value ������Ÿ��> hashmap;
	private Map<Integer, _05_Member> hashmap;
	
	public _15_MemberHashMap() {
		hashmap = new HashMap<Integer, _05_Member>();
	}
	
	// ȸ������ �߰�
	public void addMember(_05_Member member) {
		hashmap.put(member.getMemberId(), member);
	}
	
	// ȸ������ ����
	public boolean removeMember(int memberID) {
		if(hashmap.containsKey(memberID)) {
			hashmap.remove(memberID);
			return true;
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ��ü ȸ������ ���
	public void showAllMember() {
		Iterator<Integer> iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			_05_Member member = hashmap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
