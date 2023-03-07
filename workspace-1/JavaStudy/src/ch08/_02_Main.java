package ch08;

import java.io.IOException;

public class _02_Main {
	public static void main(String[] args) throws IOException{
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		
		// �Ҵ� ����� �Է¹޾� ch ������ ����
		int ch = System.in.read();	// �ݺ����� ����ϸ� �ڵ� �Է��� �ǰ� ���ڸ��� �Է��� ����
		_02_SchedulerImpl scheduler = null;
		System.out.println(ch);
		if(ch == 'R' || ch == 'r') {
			scheduler = new _02_RoundRobin();		// ������ ����
		} else if(ch == 'L' || ch == 'l') {
			scheduler = new _02_LeastJob();		// ������ ����
		} else if(ch == 'P' || ch == 'p') {
			scheduler = new _02_PriorityAllocation();		// ������ ����
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return ;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
