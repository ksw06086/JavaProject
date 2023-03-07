package ch10;

import java.util.Iterator;
import java.util.TreeSet;

public class _18_MemberTreeSet {
	private TreeSet<_18_Member> treeSet;
	
	public _18_MemberTreeSet() {
		treeSet = new TreeSet<_18_Member>();
	}
	
	// ȸ�� �߰�
	public void addMember(_18_Member member) {
		treeSet.add(member);
	}
	
	// ȸ�� ����
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
		System.out.println("�������� �ʽ��ϴ�.");
		return false;
		
	}
	
	// ��ȸ
	public void showAllMember() {
		for(_18_Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
