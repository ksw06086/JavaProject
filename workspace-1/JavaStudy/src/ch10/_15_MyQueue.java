package ch10;

import java.util.ArrayList;

public class _15_MyQueue {
	// ť�� ���� �߰��� �����ͺ��� ������ ����ϴ� ���(First In First Out : FIFO)
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	// Queue �߰� : ť�� �� �ڿ� ��Ҹ� �߰�
	public void enQueue(String data) {
		// ArrayList �߰�
		arrayQueue.add(data);
	}
	
	// Queue ���� : ť�� �� ���� �ڷḦ ��ȯ�ϰ� �迭���� ����
	public String deQueue() {
		int len = arrayQueue.size();		// ArrayList�� �ڷ� ����
		if(len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return arrayQueue.remove(0);		// �� �տ� �ִ� �ڷḦ ��ȯ�ϰ� �迭���� ����
	}
}
