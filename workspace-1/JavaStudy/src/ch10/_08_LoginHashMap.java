package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _08_LoginHashMap {
	public static void main(String[] args) {
		// �߿�
		/*
		 * 1. id pwd 5���� hashtable�� ����(HashMap�� ����)
		 * 2. �ַܼκ��� id, pwd�� �Է¹޴´�.
		 * 	1�� 2�� ���ؼ�
		 * 3. ���̵� ������ "�Է��Ͻ� ���̵� �������� �ʽ��ϴ�." ���
		 * 4. ���̵� ������ ��й�ȣ�� ���ؼ� ��ġ�� " �α��� �Ǿ����ϴ�. " ���
		 * 														����ġ�� "��й�ȣ�� ��ġ���� �ʽ��ϴ�." ���
		 * **/
		HashMap<String, String> login = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ���� : E, ���� : P, �α��� : L, ���� �̿��ϰ� ��� ������ : A, ȸ������ : D ===");
		String num = sc.next();
		while(!num.equals("E") && !num.equals("e")) {
			if(num.equals("P") || num.equals("p")) {
				System.out.print("���̵� �Է����ּ��� : ");
				String id = sc.next();
				while(login.containsKey(id)) {
					System.out.println("���̵� �ߺ��Ǿ����ϴ�. �ٽ� �Է����ֽñ� �ٶ��ϴ�.");
					System.out.print("�ٽ� ���̵� �Է����ּ���. ����� EŰ�Դϴ�. : ");
					id = sc.next();
					if(id.equals("E") || id.equals("e")) {
						return ;
					}
				}
				System.out.println("��밡���� ���̵� �Դϴ�.");
				System.out.print("��й�ȣ�� �Է����ּ��� : ");
				String pwd = sc.next();
				System.out.print("�ٽ��ѹ� ��й�ȣ�� �Է����ּ��� : ");
				String copypwd = sc.next();
				while(!pwd.equals(copypwd)) {
					System.out.println("�ٽ� �Է��Ͻ� ��й�ȣ�� ���� �ʽ��ϴ�. �ٽ� �Է����ּ���. ����� EŰ�Դϴ�. : ");
					copypwd = sc.next();
					if(copypwd.equals("E") || copypwd.equals("e")) {
						return ;
					}
				}
				login.put(id, pwd);
				System.out.println("���ԵǼ̽��ϴ�. �̿����ּż� �����մϴ�.");
			} else if(num.equals("L") || num.equals("l")) {
				// ���蹮��
				System.out.print("id : ");
				String id = sc.next();
				while(!login.containsKey(id)) {
					System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���. ����� EŰ�Դϴ�.");
					System.out.print("id : ");
					id = sc.next();
					if(id.equals("E") || id.equals("e")) {
						return ;
					}
				}
				System.out.print("pwd : ");
				String pwd = sc.next();
				while(!pwd.equals(login.get(id))) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���. ����� EŰ�Դϴ�.");
					System.out.print("pwd : ");
					pwd = sc.next();
					if(pwd.equals("E") || pwd.equals("e")) {
						return ;
					}
				}
				System.out.println("�α��� �Ǽ̽��ϴ�.");
				return ; // ������ ���� ���� �� �ô�.
			} else if(num.equals("A") || num.equals("a")) {
				if(login.isEmpty()) {
					System.out.println("�̿��Ͻô� ������ �����ϴ�.");
				} else {
					Iterator<String> ir = login.keySet().iterator();
					System.out.println("=== ���� �̿��ϰ� ��� ���Ե��� ID ===");
					while(ir.hasNext()) {
						System.out.println(ir.next());
					}
				}
			} else if(num.equals("D") || num.equals("d")) {
				System.out.print("������ ���̵� �Է����ּ��� : ");
				String id = sc.next();
				while(!login.containsKey(id)) {
					System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���. ����� EŰ�Դϴ�.");
					System.out.print("id : ");
					id = sc.next();
					if(id.equals("E") || id.equals("e")) {
						return ;
					}
				}
				login.remove(id);
				System.out.println("�����Ǿ����ϴ�. �ٽ� ����Ͻñ� ���ؼ��� �簡�����ֽñ� �ٶ��ϴ�.");
			} else {
				System.out.println("�˸´� �Է��� �ƴմϴ�. �ٽ� �Է����ּ���");
			}
			System.out.println("=== ���� : E, ���� : P, �α��� : L, ���� �̿��ϰ� ��� ������ : A, ȸ������ : D ===");
			num = sc.next();
		}
		System.out.println("END~! ������~!!");
	}
}
