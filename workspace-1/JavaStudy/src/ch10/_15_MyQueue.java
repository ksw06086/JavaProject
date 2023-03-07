package ch10;

import java.util.ArrayList;

public class _15_MyQueue {
	// 큐는 먼저 추가된 데이터부터 꺼내서 사용하는 방식(First In First Out : FIFO)
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	// Queue 추가 : 큐의 맨 뒤에 요소를 추가
	public void enQueue(String data) {
		// ArrayList 추가
		arrayQueue.add(data);
	}
	
	// Queue 삭제 : 큐의 맨 앞의 자료를 반환하고 배열에서 제거
	public String deQueue() {
		int len = arrayQueue.size();		// ArrayList의 자료 개수
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0);		// 맨 앞에 있는 자료를 반환하고 배열에서 제거
	}
}
