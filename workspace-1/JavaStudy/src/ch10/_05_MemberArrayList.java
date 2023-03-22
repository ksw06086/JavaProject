package ch10;

import java.util.ArrayList;

public class _05_MemberArrayList {
	private ArrayList<_05_Member> arrayList;		// arrayList 선언
	
	public _05_MemberArrayList() {
		arrayList = new ArrayList<_05_Member>();		// _05_Member형으로된 배열 생성
	}
	
	// 회원추가
	public void addMember(_05_Member member) {
		arrayList.add(member);
	}
	
	// 회원삭제
	public boolean removeMember(int memberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			_05_Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 전체회원 출력
	public void showAllMember() {
		// 향상된 for문 : for(자료형 변수 ㅣ 배열명) {} ==> 배열안의 자료를 변수에 저장하며 순서대로 출력됨
		for(_05_Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}