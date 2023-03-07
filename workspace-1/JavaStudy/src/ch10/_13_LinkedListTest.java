package ch10;

import java.util.LinkedList;

public class _13_LinkedListTest {
	public static void main(String[] args) {
		/**
		 * 사용하는 자료의 변동(삽입, 삭제)이 많은 경우에는 링크드 리스트를,
		 * 자료변동이 거의 없는 경우에는 배열을 사용하는 것이 효율적이다.
		 * 
		 * 링크드 리스트의 맨 앞 또는 맨 뒤에 요소를 추가, 삭제하는 addFirst(), addLast(), removeLast(), removeFirst() 메소드가 있다.
		 * */
		
		// 링크드 리스트 생성
		LinkedList<String> myList = new LinkedList<String>();
		
		// 링크드리스트에 데이터 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//리스트 전체 출력
		System.out.println(myList); // .toString 생략
		
		myList.add(1,"D");
		System.out.println(myList); // .toString 생략
		
		myList.addFirst("0");
		System.out.println(myList); // .toString 생략
		
		System.out.println(myList.removeLast());
		System.out.println(myList); // .toString 생략
		
	}
}
