package ch10;

public class _18_MemberTreeSetTest {
	public static void main(String[] args) {
		_18_MemberTreeSet memberTreeSet = new _18_MemberTreeSet();
		_18_Member memberLee = new _18_Member(1001, "이지민");
		_18_Member memberSon = new _18_Member(1002, "손흥민");
		_18_Member memberHong = new _18_Member(1001, "홍길동");
		
		// HashSet에 회원정보 추가
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberLee);
		
		// 회원 정보 조회
		memberTreeSet.showAllMember();
		
		// 1명 추가(중복 id);
		_18_Member memberPark = new _18_Member(1003, "박민지");
		memberTreeSet.addMember(memberPark);
		
		// 회원정보 조회
		memberTreeSet.showAllMember();
		
		/**
		 * Comparable 인터페이스를 구현하지 않았다는 오류 발생
		 * -> 어떤 기준으로 노드를 비교하여 트리를 형성해야 하는지를 구현하지 않았다는 뜻이다.
		 *      따라서 회원을 TreeSet에 추가할 때 어떤 기준으로 비교할 것인지를 구현해줘야한다.
		 *      
		 * -> _18_Member 클래스가 가진 회원아이디를 기주능로 오름차순 정렬하기 위해
		 * -> Comparable 인터페이스 : 자기 자신과 전달받은 매개변수를 비교하는 인터페이스
		 * 										compateTo() 추상메소드를 오버라이드 해야한다.
		 * **/
		
	}
}
