package ch08;

public class _02_RoundRobin implements _02_SchedulerImpl {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �������� ����մϴ�.");
	}
	
}
