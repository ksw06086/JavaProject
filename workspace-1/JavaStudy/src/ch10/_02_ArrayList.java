package ch10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_ArrayList {
	public static void main(String[] args) {
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
		
		List<String> list = new ArrayList<String>();
		list.add("집밥");
		list.add("와플");
		list.add("오렌지");
		list.add("파인애플");
		list.add("마가렛트");
		list.add(1, "피자");
		list.add(2, "치맥");
		list.set(5, "피콜");
		
		// 방법 1. for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 방법 2. 향상된 for문
		for(String i : list) {
			System.out.println(i + " ");
		}
		
		// 방법 3. 반복자(iterator) 사용
		/*
		 * 사용목적 : 반복자는 java.util 패키지에 정의되어 있는 Iterator 인터페이스를 구현하는 객체이다.
		 * 			즉 컬렉션의 원소들에 접근하는 것이 목적이다.
		 * 사용메소드
		 * hasNext() : 아직 접근하지 않은 요소가 있으면 true를 반환
		 * next() : 다음 요소를 반환... Object 타입을 반환
		 * remove() : 최근에 반환된 요소를 삭제한다.
		 * */
		List<String> list2 = new ArrayList<String>();
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");
		
		// 방법1. for
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		
		System.out.println();
		
		// 방법2. 향상된 for문
		for (String i : list2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 방법3. 반복자(Iterator) 사용하기
		// (이게 새로 계속 생성해줌) 그래서 접근 찾을 때마다 초기화된 것을 찾음
		// list2.iterator().hasNext()를 사용하면 접근했었는데 접근 안한 맨 처음으로 매번 초기화 됨
		String str = "";
		// 다이아몬드 연산자 적어주면 다운캐스팅 필요없음
		Iterator iterator = list2.iterator(); // 다이아몬드 연선자 안적어줘도 되지만 기본적으로 적어주는게 좋음
		
		// 중요!!!
		// ArratList의 값이 존재하는지 체크 / hasNext() 타입이 boolean
		while (iterator.hasNext()) { // 있니없니? 있으면 true 출력하고 다음으로 넘어가라
			// 존재하면 반복자는 값을 읽어서 Object 타입으로 리턴하므로, String으로 형변환
			str = (String) iterator.next();
			System.out.print(str + " ");		// next 접근 안한 거 먼저 가지고 오고 다음으로 넘어가라
		}
		
	}
}
