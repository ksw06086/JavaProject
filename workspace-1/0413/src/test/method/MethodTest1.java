package test.method;

import java.util.Iterator;

public class MethodTest1 {
	// static : �ڹ� �޸� ������ ����, ����û���� ����� �ִ� �� ���� ��
	// static�� Heap ������ �ٸ��� �׷��� static�� �Ⱥ��̸� static �޼ҵ忡�� ��� �Ұ�
	static void printHead(char symbol, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printHead('��',25);
		System.out.println("Yuhan University");
		printHead('��',30);
		System.out.println("ComputerSoftware");
		printHead('��',21);
	}
}
