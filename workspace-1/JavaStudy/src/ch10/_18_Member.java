package ch10;

public class _18_Member implements Comparable<_18_Member>{

	private int memberId;					// ȸ�� ���̵�
	private String memberName;		// ȸ�� �̸�
	
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
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}

	/*
	 * �߰��� ȸ�� ���̵�� �Ű������� ���� ȸ�� ���̵� ����
	 * �񱳴���� this.memberId�� ���� �߰��� ȸ�����̵�� compareTo() �޼ҵ��� �Ű������� ���޵� ȸ�����̵�
	 * ���� �߰��� ȸ�� ���̵� �� ũ�� ���, �׷��� ������ ����, ������ 0�� ��ȯ
	 * ��� ������� �������� �����̴�. -1�� ���ϸ� �������� ����
	 * **/
	@Override
	public int compareTo(_18_Member o) {
		return 0;
	}

}
