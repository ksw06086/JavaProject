package test.method;

import java.util.Scanner;

public class MethodTest2 {
	public static void oddEventTest(int num) {
		if (num % 2 == 1) {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		} else {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sstr = new Scanner(System.in);
		Scanner sint = new Scanner(System.in);
		int num = 0;
		String con = "";
		
		while(true) {
			System.out.print("���ڸ� �Է����ּ��� : ");
			num = sint.nextInt();
			oddEventTest(num);
			System.out.print("�׸��νðڽ��ϱ�?(y|n) : ");
			con = sstr.nextLine();
			if(con.equals("y") || con.equals("yes")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		
		sstr.close();
		sint.close();
	}
}
