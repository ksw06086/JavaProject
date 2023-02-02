package test.exam.fig;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자열split_and_contains_악성코드뽑아내기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int cnt = 0;
		
		for(int i = Integer.parseInt(sc.nextLine()); i > 0; i--) {
			String str = sc.nextLine();
			if(str.length() <= 3) {
				list.add(str);
				cnt++;
				continue;
			} else if(str.contains("tap")) {
				list.add(str);
				cnt++;
				continue;
			} else if(str.contains("xocure")) {
				list.add(str);
				cnt++;
				continue;
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		if(cnt < 4) {
			System.out.println("safe");
		} else if(cnt < 7) {
			System.out.println("warning");
		} else if(cnt >= 7) {
			System.out.println("danger");
		}
		
		
		sc.close();
	}
}
