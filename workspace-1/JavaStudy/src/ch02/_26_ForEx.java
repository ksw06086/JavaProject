package ch02;

public class _26_ForEx {
	public static void main(String[] args) {
		String str = "no pain no gain";
		int count = 0;
		
		// str ���ڿ� �߿��� 'o'�� ������ count�� ������Ų��.
		// str ����, ���忡�� �߰ߵ� 'o'�� ����
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != 'o') {
				continue;
			}
			count++;
		}
		System.out.println("str ���� : " + str.length() + ", ���ڿ� �߿��� ���ĺ� o�� �߰ߵ� Ƚ�� : " + count);
	}
}
