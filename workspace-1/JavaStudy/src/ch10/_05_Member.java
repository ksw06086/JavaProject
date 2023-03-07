package ch10;

public class _05_Member {
	/**
	 * <�÷��� �����ӿ�ũ>
	 * 
	 * Collection - List �������̽� - Ŭ������ ArrayList, Vector, LinkedList
	 * 				- Set �������̽� - Ŭ������ HashSet, TreeSet
	 * 
	 * Map �������̽� <- HashMap, TreeMap
	 * 						<- HashTable <- Properties
	 * 
	 * 1. Ư¡
	 * List �������̽� : ������ �ִ� �ڷ����, �ߺ����
	 * 						index�� ����Ͽ� ��ҿ� �����Ѵ�.
	 * 						����Ʈ�� ����մ� ��ҵ��� �ε����� 0���� �����Ѵ�.
	 * 						Ŭ���� ������ ArrayList, Vector, LinkedList
	 * 
	 * Set �������̽� : ������ ���� �ڷ����, �ߺ���� ����
	 * 						Ŭ������ HashSet, TreeSet
	 * 
	 * 2, ���� :
	 * ArrayList<������ Ÿ��Ŭ����> list = new ArrayList<������Ÿ��Ŭ����>();
	 * 
	 * ������ ����
	 * List<������Ÿ��Ŭ����> list = new ArrayList<������Ÿ��Ŭ����>();
	 * 
	 * 3. Ư¡ : ������ ������ �ְ�, �ߺ� ���
	 * 4. �߰� : list.add(�߰��� ��ġ index, ��);  / list.add(��);
	 * 5. ��ü : list.set(��ü�� ��ġ index, ��);
	 * 6. ���� : list.remove(������ ��ġ index);
	 * 7. �� �������� : list.get(������ index);
	 * 8. �˻� : list.indexOf(�˻��� ��);
	 * �� �ߺ��� ���Ǳ⿡ �˻��� �� ó������ ���� ���� ��ġ�� ã��
	 * 9. ��ü ���� : list.clear();
	 * 10. �ݺ��� : Iterator<E> iterator : while(hashNext) { next() }
	 * **/
	// �������
	private int memberId;					// ȸ�� ���̵�
	private String memberName;		// ȸ���̸�
	
	// ������
	public	_05_Member(int memberId, String memerName) {
		this.memberId = memberId;
		this.memberName = memerName;
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
