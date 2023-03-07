package ch10;

public class _15_MemberHashMapTest {
	public static void main(String[] args) {
		_15_MemberHashMap memHashMap = new _15_MemberHashMap();
		
		// member ���� ����
		_05_Member memberLee = new _05_Member(1001, "������");
		_05_Member memberSon = new _05_Member(1002, "�����");
		_05_Member memberPark = new _05_Member(1003, "�ڹ���");
		_05_Member memberHong = new _05_Member(1004, "�����");
		
		// ���� �߰�
		memHashMap.addMember(memberLee);
		memHashMap.addMember(memberSon);
		memHashMap.addMember(memberPark);
		memHashMap.addMember(memberHong);
		
		System.out.println("-------- �߰� �� ��ȸ --------");
		// ��� ȸ������ ��ȸ
		memHashMap.showAllMember();
		
		System.out.println("--------���� �� ��ȸ---------");
		// ȸ�����̵�(key��)�� 1004�� ȸ������ ����
		memHashMap.removeMember(1004);
		
		// ���� �� ���� ��ȸ
		memHashMap.showAllMember();
	}
}
