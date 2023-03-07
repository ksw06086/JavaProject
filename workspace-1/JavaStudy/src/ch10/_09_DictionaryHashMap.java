package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _09_DictionaryHashMap {
	public static void main(String[] args) {
		// 영어사전 작성하기
		/**
		 * 입력 : word
		 * 학교 : school
		 * 기적 : miracle
		 * 달력 : calendar
		 * 물 : water
		 * 꽃 : flower
		 * */
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("school", "학교");
		dictionary.put("miracle", "기적");
		dictionary.put("calendar", "달력");
		dictionary.put("water", "물");
		dictionary.put("flower", "꽃");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("== 단어 검색 : S, 종료 : Q, 사전에 있는 단어와 뜻 목록보기 : A, 단어 등록 : I ===");
			String swit = sc.next();
			if(swit.equals("Q") || swit.equals("q")) {
				return ;
			} else if(swit.equals("S") || swit.equals("s")) {
				System.out.print("찾고 싶은 단어를 입력하세요. 종료는 Q입니다. : ");
				String word = sc.next();
				if(word.equals("Q") || word.equals("q")) {
					return ;
				}
				if(dictionary.containsKey(word)) {
					System.out.println(word + "의 의미는 " + dictionary.get(word) + "입니다.");
				} else {
					System.out.println("사전에 " + word + "의 의미가 존재하지 않습니다.");
				}
			} else if(swit.equals("A") || swit.equals("a")) {
				if(dictionary.isEmpty()) {
					System.out.println("영어사전에 단어가 등록되어 있지 않습니다.");
				} else {
					System.out.println("===== 영어 단어 목록 ===");
					Iterator<String> ir = dictionary.keySet().iterator();
					while (ir.hasNext()) {
						String key = ir.next();
						System.out.println(key + " : " + dictionary.get(key));
					}
				}
			} else if(swit.equals("I") || swit.equals("i")) {
				System.out.println("등록하고 싶은 단어를 입력해주세요 : ");
				String eng = sc.next();
				if(dictionary.containsKey(eng)) {
					System.out.println("똑같은 단어가 이미 등록되어 있습니다.");
					continue;
				} else {
					System.out.println("등록할 단어의 뜻을 입력해주세요 : ");
					String value = sc.next();
					dictionary.put(eng, value);
					System.out.println(eng + "가 영어사전에 등록되었습니다.");
				}
			} else {
				System.out.println("다시 입력해주세요.");
			}
			 
		}
	}
}
