package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _08_LoginHashMap {
	public static void main(String[] args) {
		// 중요
		/*
		 * 1. id pwd 5건을 hashtable에 저장(HashMap에 저장)
		 * 2. 콘솔로부터 id, pwd를 입력받는다.
		 * 	1과 2를 비교해서
		 * 3. 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 출력
		 * 4. 아이디가 있으면 비밀번호와 비교해서 일치시 " 로그인 되었습니다. " 출력
		 * 														불일치시 "비밀번호가 일치하지 않습니다." 출력
		 * **/
		HashMap<String, String> login = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 종료 : E, 가입 : P, 로그인 : L, 현재 이용하고 계신 고객정보 : A, 회원삭제 : D ===");
		String num = sc.next();
		while(!num.equals("E") && !num.equals("e")) {
			if(num.equals("P") || num.equals("p")) {
				System.out.print("아이디를 입력해주세요 : ");
				String id = sc.next();
				while(login.containsKey(id)) {
					System.out.println("아이디가 중복되었습니다. 다시 입력해주시기 바랍니다.");
					System.out.print("다시 아이디를 입력해주세요. 종료는 E키입니다. : ");
					id = sc.next();
					if(id.equals("E") || id.equals("e")) {
						return ;
					}
				}
				System.out.println("사용가능한 아이디 입니다.");
				System.out.print("비밀번호를 입력해주세요 : ");
				String pwd = sc.next();
				System.out.print("다시한번 비밀번호를 입력해주세요 : ");
				String copypwd = sc.next();
				while(!pwd.equals(copypwd)) {
					System.out.println("다시 입력하신 비밀번호와 맞지 않습니다. 다시 입력해주세요. 종료는 E키입니다. : ");
					copypwd = sc.next();
					if(copypwd.equals("E") || copypwd.equals("e")) {
						return ;
					}
				}
				login.put(id, pwd);
				System.out.println("가입되셨습니다. 이용해주셔서 감사합니다.");
			} else if(num.equals("L") || num.equals("l")) {
				// 시험문제
				System.out.print("id : ");
				String id = sc.next();
				while(!login.containsKey(id)) {
					System.out.println("입력하신 아이디가 존재하지 않습니다. 다시 입력해주세요. 종료는 E키입니다.");
					System.out.print("id : ");
					id = sc.next();
					if(id.equals("E") || id.equals("e")) {
						return ;
					}
				}
				System.out.print("pwd : ");
				String pwd = sc.next();
				while(!pwd.equals(login.get(id))) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요. 종료는 E키입니다.");
					System.out.print("pwd : ");
					pwd = sc.next();
					if(pwd.equals("E") || pwd.equals("e")) {
						return ;
					}
				}
				System.out.println("로그인 되셨습니다.");
				return ; // 나가리 이제 볼일 다 봤다.
			} else if(num.equals("A") || num.equals("a")) {
				if(login.isEmpty()) {
					System.out.println("이용하시는 고객님이 없습니다.");
				} else {
					Iterator<String> ir = login.keySet().iterator();
					System.out.println("=== 현재 이용하고 계신 고객님들의 ID ===");
					while(ir.hasNext()) {
						System.out.println(ir.next());
					}
				}
			} else if(num.equals("D") || num.equals("d")) {
				System.out.print("삭제할 아이디를 입력해주세요 : ");
				String id = sc.next();
				while(!login.containsKey(id)) {
					System.out.println("입력하신 아이디가 존재하지 않습니다. 다시 입력해주세요. 종료는 E키입니다.");
					System.out.print("id : ");
					id = sc.next();
					if(id.equals("E") || id.equals("e")) {
						return ;
					}
				}
				login.remove(id);
				System.out.println("삭제되었습니다. 다시 사용하시기 위해서는 재가입해주시기 바랍니다.");
			} else {
				System.out.println("알맞는 입력이 아닙니다. 다시 입력해주세요");
			}
			System.out.println("=== 종료 : E, 가입 : P, 로그인 : L, 현재 이용하고 계신 고객정보 : A, 회원삭제 : D ===");
			num = sc.next();
		}
		System.out.println("END~! 가지마~!!");
	}
}
