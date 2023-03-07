package ch10;

import java.util.HashMap;
import java.util.Map;

public class _11_HashMapEx {
	public static void main(String[] args) {
		Map<String, _05_Member> map = new HashMap<>();
		
		// hashMap 추가
		map.put("M001", new _05_Member(1, "홍길동"));
		map.put("M002", new _05_Member(2, "이지민"));
		map.put("M003", new _05_Member(3, "사랑둥이"));
		
		System.out.println(map);
		
		// 멤버삭제
		map.remove("M002");
		System.out.println(map);
		
		//멤버추가
		map.put("M003", new _05_Member(3, "마이클"));
		System.out.println(map);
		
		//조회
		// Map.Entry<String, _05_Member> str => 인터페이스<key 타입, value 타입> 변수명
		// entrySet() 메소드 : map을 구성하는 기본단위인 entry를 자바 유틸 셋의 형태로 변환
		for (Map.Entry<String, _05_Member> str : map.entrySet()) {
			String key = str.getKey();
			_05_Member value = str.getValue();
			System.out.println("key : " + key + ", value : " + value);
		}
	}
}
