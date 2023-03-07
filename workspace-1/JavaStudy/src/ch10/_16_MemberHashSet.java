package ch10;

import java.util.HashSet;
import java.util.Iterator;

public class _16_MemberHashSet {
	private HashSet<_16_MemberId> hashSet;
	
	public _16_MemberHashSet() {
		hashSet = new HashSet<_16_MemberId>();
	}
	
	// 회원 추가
	public void addMember(_16_MemberId member) {
		hashSet.add(member);
	}
	
	// 회원 삭제
	public boolean removeMember(int memberId) {
		Iterator<_16_MemberId> ir = hashSet.iterator();
		while (ir.hasNext()) {
			_16_MemberId member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("존재하지 않습니다.");
		return false;
	}
	
	// 회원 조회
	public void showAllMember() {
		for (_16_MemberId member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
