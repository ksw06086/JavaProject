package ch10;

public class _18_MemberTreeSetTest {
	public static void main(String[] args) {
		_18_MemberTreeSet memberTreeSet = new _18_MemberTreeSet();
		_18_Member memberLee = new _18_Member(1001, "������");
		_18_Member memberSon = new _18_Member(1002, "�����");
		_18_Member memberHong = new _18_Member(1001, "ȫ�浿");
		
		// HashSet�� ȸ������ �߰�
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberLee);
		
		// ȸ�� ���� ��ȸ
		memberTreeSet.showAllMember();
		
		// 1�� �߰�(�ߺ� id);
		_18_Member memberPark = new _18_Member(1003, "�ڹ���");
		memberTreeSet.addMember(memberPark);
		
		// ȸ������ ��ȸ
		memberTreeSet.showAllMember();
		
		/**
		 * Comparable �������̽��� �������� �ʾҴٴ� ���� �߻�
		 * -> � �������� ��带 ���Ͽ� Ʈ���� �����ؾ� �ϴ����� �������� �ʾҴٴ� ���̴�.
		 *      ���� ȸ���� TreeSet�� �߰��� �� � �������� ���� �������� ����������Ѵ�.
		 *      
		 * -> _18_Member Ŭ������ ���� ȸ�����̵� ���ִɷ� �������� �����ϱ� ����
		 * -> Comparable �������̽� : �ڱ� �ڽŰ� ���޹��� �Ű������� ���ϴ� �������̽�
		 * 										compateTo() �߻�޼ҵ带 �������̵� �ؾ��Ѵ�.
		 * **/
		
	}
}
