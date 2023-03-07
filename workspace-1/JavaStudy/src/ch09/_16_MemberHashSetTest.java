package ch09;

import ch10._16_MemberHashSet;
import ch10._16_MemberId;

public class _16_MemberHashSetTest {
	public static void main(String[] args) {
		_16_MemberHashSet memberHashSet = new _16_MemberHashSet();
		_16_MemberId memberLee = new _16_MemberId(1001, "이지민");
		_16_MemberId memberSon = new _16_MemberId(1002, "손흥민");
		_16_MemberId memberPark = new _16_MemberId(1003, "박민지");
		
		// HashSet에 회원정보 추가
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		
		// 회원정보 조회
		memberHashSet.showAllMember();
		
		// 1명 추가(중복 id)
		_16_MemberId memberHong = new _16_MemberId(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		
		// 회원정보 조회
		memberHashSet.showAllMember();
		
		// 주소비교.. 주소가 다르므로 다른 객체로 인식
		// 따라서 _16_MemberId 클래스에서 hashCode(), equals() 메소드를 오버라이드 하면
		// 값비교가 되어, 주소가 다르더라도 값을 비교하여, 값이 같을 경우 중복되지 않도록 반환
	}
}
