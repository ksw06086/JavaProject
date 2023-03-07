package ch08;

import java.io.IOException;

public class _02_Main {
	public static void main(String[] args) throws IOException{
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		// 할당 방식을 입력받아 ch 변수에 대입
		int ch = System.in.read();	// 반복문을 사용하면 자동 입력이 되고 한자리만 입력을 받음
		_02_SchedulerImpl scheduler = null;
		System.out.println(ch);
		if(ch == 'R' || ch == 'r') {
			scheduler = new _02_RoundRobin();		// 다형성 적용
		} else if(ch == 'L' || ch == 'l') {
			scheduler = new _02_LeastJob();		// 다형성 적용
		} else if(ch == 'P' || ch == 'p') {
			scheduler = new _02_PriorityAllocation();		// 다형성 적용
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return ;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
