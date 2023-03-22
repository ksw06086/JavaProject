package ch10;

public class _15_MemberHashMapTest {
	public static void main(String[] args) {
		_15_MemberHashMap memHashMap = new _15_MemberHashMap();
		
		// member 정보 생성
		_05_Member memberLee = new _05_Member(1001, "이지원");
		_05_Member memberSon = new _05_Member(1002, "손흥민");
		_05_Member memberPark = new _05_Member(1003, "박민지");
		_05_Member memberHong = new _05_Member(1004, "김우유");
		
		// 정보 추가
		memHashMap.addMember(memberLee);
		memHashMap.addMember(memberSon);
		memHashMap.addMember(memberPark);
		memHashMap.addMember(memberHong);
		
		System.out.println("-------- 추가 후 조회 --------");
		// 모든 회원정보 조회
		memHashMap.showAllMember();
		
		System.out.println("--------삭제 후 조회---------");
		// 회원아이디(key값)가 1004인 회원정보 삭제
		memHashMap.removeMember(1004);
		
		// 삭제 후 정보 조회
		memHashMap.showAllMember();
	}
}