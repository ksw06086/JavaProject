package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _15_MemberHashMap {
	// HashMap 선언
	// Map<key 데이터타입, value 데이터타입> hashmap;
	private Map<Integer, _05_Member> hashmap;
	
	public _15_MemberHashMap() {
		hashmap = new HashMap<Integer, _05_Member>();
	}
	
	// 회원정보 추가
	public void addMember(_05_Member member) {
		hashmap.put(member.getMemberId(), member);
	}
	
	// 회원정보 삭제
	public boolean removeMember(int memberID) {
		if(hashmap.containsKey(memberID)) {
			hashmap.remove(memberID);
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	// 전체 회원정보 출력
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
