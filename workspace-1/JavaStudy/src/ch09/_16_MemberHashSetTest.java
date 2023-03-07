package ch09;

import ch10._16_MemberHashSet;
import ch10._16_MemberId;

public class _16_MemberHashSetTest {
	public static void main(String[] args) {
		_16_MemberHashSet memberHashSet = new _16_MemberHashSet();
		_16_MemberId memberLee = new _16_MemberId(1001, "������");
		_16_MemberId memberSon = new _16_MemberId(1002, "�����");
		_16_MemberId memberPark = new _16_MemberId(1003, "�ڹ���");
		
		// HashSet�� ȸ������ �߰�
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		
		// ȸ������ ��ȸ
		memberHashSet.showAllMember();
		
		// 1�� �߰�(�ߺ� id)
		_16_MemberId memberHong = new _16_MemberId(1003, "ȫ�浿");
		memberHashSet.addMember(memberHong);
		
		// ȸ������ ��ȸ
		memberHashSet.showAllMember();
		
		// �ּҺ�.. �ּҰ� �ٸ��Ƿ� �ٸ� ��ü�� �ν�
		// ���� _16_MemberId Ŭ�������� hashCode(), equals() �޼ҵ带 �������̵� �ϸ�
		// ���񱳰� �Ǿ�, �ּҰ� �ٸ����� ���� ���Ͽ�, ���� ���� ��� �ߺ����� �ʵ��� ��ȯ
	}
}
