package ch10;

public class _05_Member {
	/**
	 * <컬렉션 프레임워크>
	 * 
	 * Collection - List 인터페이스 - 클래스는 ArrayList, Vector, LinkedList
	 * 				- Set 인터페이스 - 클래스는 HashSet, TreeSet
	 * 
	 * Map 인터페이스 <- HashMap, TreeMap
	 * 						<- HashTable <- Properties
	 * 
	 * 1. 특징
	 * List 인터페이스 : 순서가 있는 자료관리, 중복허용
	 * 						index를 사용하여 요소에 접근한다.
	 * 						리스트에 들어잇는 요소들의 인덱스는 0부터 시작한다.
	 * 						클래스 종류는 ArrayList, Vector, LinkedList
	 * 
	 * Set 인터페이스 : 순서가 없는 자료관리, 중복허용 안함
	 * 						클래스는 HashSet, TreeSet
	 * 
	 * 2, 선언 :
	 * ArrayList<테이터 타입클래스> list = new ArrayList<데이터타입클래스>();
	 * 
	 * 다형성 적용
	 * List<데이터타입클래스> list = new ArrayList<데이터타입클래스>();
	 * 
	 * 3. 특징 : 데이터 순서가 있고, 중복 허용
	 * 4. 추가 : list.add(추가할 위치 index, 값);  / list.add(값);
	 * 5. 교체 : list.set(교체할 위치 index, 값);
	 * 6. 삭제 : list.remove(삭제할 위치 index);
	 * 7. 값 가져오기 : list.get(가져올 index);
	 * 8. 검색 : list.indexOf(검색할 값);
	 * ㄴ 중복이 허용되기에 검색할 때 처음으로 오는 값의 위치를 찾음
	 * 9. 전체 삭제 : list.clear();
	 * 10. 반복자 : Iterator<E> iterator : while(hashNext) { next() }
	 * **/
	// 멤버변수
	private int memberId;					// 회원 아이디
	private String memberName;		// 회원이름
	
	// 생성자
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
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
}
