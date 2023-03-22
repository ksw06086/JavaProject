package ch10;

import java.util.ArrayList;
import java.util.List;

public class _03_ArrayList {
	public static void main(String[] args) {
		/*
		 * 8. 검색 : list.indexOf(검색할 값); // 중요!
		 * 			리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		 * 			검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 * 			list.lastIndexOf(검색할 값);
		 * 			리스트에서 검색할 값과 똑같은 값을 갖는 마지막번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		 * 			검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 * */
		// import시 경로가 여러가지 일 수도 있는데 잘 보고 해야한다.
		List<String> list = new ArrayList<String>();
		list.add("H");
		list.add("O");
		list.add("N");
		list.add("G");
		list.add("G");
		list.add("I");
		list.add("L");
		list.add("D");
		list.add("O");
		list.add("N");
		list.add("G");
		
		// 일치하는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴
		System.out.println("G문자의 인덱스 : " + list.indexOf("G"));
		System.out.println("N문자의 인덱스 : " + list.indexOf("N"));
		// 일치하는 마지막번째 데이터를 찾아서 그 위치의 인덱스를 리턴
		System.out.println("G문자의 인덱스 : " + list.lastIndexOf("G"));
		System.out.println("N문자의 인덱스 : " + list.lastIndexOf("N"));
		System.out.println("Z문자의 인덱스 : " + list.lastIndexOf("Z"));
		
		// list 전체 출력, 전체 리스트 출력
		System.out.println("리스트 삭제 전 : " + list);
		
		// list 전체 삭제
		list.clear();
		System.out.println("리스트 삭제 후 : " + list);
	}
}