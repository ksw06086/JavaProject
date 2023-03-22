package ch10;

import java.util.Iterator;
import java.util.TreeSet;

public class _18_MemberTreeSet {
	private TreeSet<_18_Member> treeSet;
	
	public _18_MemberTreeSet() {
		treeSet = new TreeSet<_18_Member>();
	}
	
	// 회원 추가
	public void addMember(_18_Member member) {
		treeSet.add(member);
	}
	
	// 회원 삭제
	public boolean removeMember(int memberId) {
		Iterator<_18_Member> ir = treeSet.iterator();
		while (ir.hasNext()) {
			_18_Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true; 
			}
		}
		System.out.println("존재하지 않습니다.");
		return false;
		
	}
	
	// 조회
	public void showAllMember() {
		for(_18_Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}