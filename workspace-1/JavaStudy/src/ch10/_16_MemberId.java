package ch10;

public class _16_MemberId {
	private int memberId;						// ȸ�� ���̵�
	private String memberName;			// ȸ���̸�
	
	public _16_MemberId(int memberId, String memberName) {
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
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	
}