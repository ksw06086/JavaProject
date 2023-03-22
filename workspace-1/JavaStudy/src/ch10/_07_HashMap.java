package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _07_HashMap {
	/*
	 * 해싱(hashing) : 키를 이용해서 해시테이블로부터 데이터를 가져오는 과정
	 * 
	 * HashMap
	 * 1) 특징
	 * - 데이터의 순서를 보장하지 않는다.
	 * - key와 value 쌍으로 저장된다.
	 * - key는 중복되면 안된다.
	 * - key를 이용해서 value를 가져올 수 잇다.
	 * - List 계열과 달리 index가 없다.
	 * - Map이라는 인터페이스를 구현한 클래스
	 * 
	 * 2) 선언
	 * - HashMap<key 타입, value 타입> map = new HashMap<key 타입, value 타입>();
	 * - Map<key 타입, value 타입> map = new HashMap<key 타입, value 타입>(); // 다형성적용
	 * 
	 * 3) 메소드 
	 * 데이터 추가 : put(key, value)
	 * 데이터 가져오기 : get(key)
	 * 데이터 삭제 : remove(key)
	 * 데이터가 비어있는지 여부 : isEmpty();
	 * 해당 키가 있는지 여부 : containsKey(key);
	 * 해당 값이 있는지 여부 : containsValue(value);
	 * 해당 갯수 : size();
	 * **/
	public static void main(String[] args) {
		//map 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "hong");
		map.put(2, "kim");
		map.put(3, "lee");
		map.put(4, "park");
		map.put(5, "son");
		
		// map 전체출력
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		// park 데이터 가져오기
		System.out.println(map.get(4));
		
		// lee 데이터 삭제
		map.remove(3);
		
		// map 전체출력
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		// 데이터 비어있는지
		System.out.println(map.isEmpty());
		
		// 키 존재 여부
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(3));
		
		// 값 존재 여부
		System.out.println(map.containsValue("son"));
		System.out.println(map.containsValue("lee"));
		
		// 개수
		System.out.println(map.size());
	}
}