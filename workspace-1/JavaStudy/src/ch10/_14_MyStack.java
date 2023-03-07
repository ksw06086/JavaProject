package ch10;

import java.util.ArrayList;

public class _14_MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	// stack �߰� - push() : ������ �� �ڿ� ��Ҹ� �߰�
	public void push(String data) {
		// ArrayList �߰� - add
		arrayStack.add(data);
	}
	
	// stack ���� - pop()
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		// ArrayList ���� - remove();
		return arrayStack.remove(len-1);	// �� �ڿ� �ִ� �ڷḦ ��ȯ�ϰ� �迭���� ���� 
	}
}
