package ch10;

import java.util.ArrayList;

public class _05_MemberArrayList {
	private ArrayList<_05_Member> arrayList;		// arrayList ����
	
	public _05_MemberArrayList() {
		arrayList = new ArrayList<_05_Member>();		// _05_Member�����ε� �迭 ����
	}
	
	// ȸ���߰�
	public void addMember(_05_Member member) {
		arrayList.add(member);
	}
	
	// ȸ������
	public boolean removeMember(int memberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			_05_Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ��üȸ�� ���
	public void showAllMember() {
		// ���� for�� : for(�ڷ��� ���� �� �迭��) {} ==> �迭���� �ڷḦ ������ �����ϸ� ������� ��µ�
		for(_05_Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
