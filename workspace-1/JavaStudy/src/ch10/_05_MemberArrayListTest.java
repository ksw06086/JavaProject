package ch10;

public class _05_MemberArrayListTest {
	public static void main(String[] args) {
		_05_MemberArrayList memberArrayList = new _05_MemberArrayList();
		
		// �Ű����� ������ ȣ��
		_05_Member memberLee = new _05_Member(1001, "������");
		_05_Member memberSon = new _05_Member(1002, "�����");
		_05_Member memberPark = new _05_Member(1003, "�ڹ���");
		_05_Member memberHong = new _05_Member(1004, "ȫ����");
		
		// ȸ���߰�
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// ��üȸ�� ���
		memberArrayList.showAllMember();
		
		// ȸ�� ����
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}
}
