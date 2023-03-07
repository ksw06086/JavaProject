package ch10;

public class _05_MemberArrayListTest {
	public static void main(String[] args) {
		_05_MemberArrayList memberArrayList = new _05_MemberArrayList();
		
		// 매개변수 생성자 호출
		_05_Member memberLee = new _05_Member(1001, "이지민");
		_05_Member memberSon = new _05_Member(1002, "손흥민");
		_05_Member memberPark = new _05_Member(1003, "박민지");
		_05_Member memberHong = new _05_Member(1004, "홍서윤");
		
		// 회원추가
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// 전체회원 출력
		memberArrayList.showAllMember();
		
		// 회원 삭제
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}
}
