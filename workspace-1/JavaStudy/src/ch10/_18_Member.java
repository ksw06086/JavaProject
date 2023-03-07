package ch10;

public class _18_Member implements Comparable<_18_Member>{

	private int memberId;					// 회원 아이디
	private String memberName;		// 회원 이름
	
	public _18_Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	/*
	 * 추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교함
	 * 비교대상은 this.memberId는 새로 추가한 회원아이디와 compareTo() 메소드의 매개변수로 전달된 회원아이디
	 * 새로 추가한 회원 아이디가 더 크면 양수, 그렇지 않으면 음수, 같으면 0을 반환
	 * 출력 결과값은 오름차순 정렬이다. -1을 곱하면 내림차순 정렬
	 * **/
	@Override
	public int compareTo(_18_Member o) {
		return 0;
	}

}
