package test.method;

import java.util.Scanner;

public class MethodTest2 {
	public static void oddEventTest(int num) {
		if (num % 2 == 1) {
			System.out.println(num + "는(은) 홀수입니다.");
		} else {
			System.out.println(num + "는(은) 짝수입니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sstr = new Scanner(System.in);
		Scanner sint = new Scanner(System.in);
		int num = 0;
		String con = "";
		
		while(true) {
			System.out.print("슷자를 입력해주세요 : ");
			num = sint.nextInt();
			oddEventTest(num);
			System.out.print("그만두시겠습니까?(y|n) : ");
			con = sstr.nextLine();
			if(con.equals("y") || con.equals("yes")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		sstr.close();
		sint.close();
	}
}
