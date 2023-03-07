package ch02;

public class _26_ForEx {
	public static void main(String[] args) {
		String str = "no pain no gain";
		int count = 0;
		
		// str 문자열 중에서 'o'가 나오면 count를 증가시킨다.
		// str 길이, 문장에서 발견된 'o'의 갯수
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != 'o') {
				continue;
			}
			count++;
		}
		System.out.println("str 길이 : " + str.length() + ", 문자열 중에서 알파벳 o가 발견된 횟수 : " + count);
	}
}
