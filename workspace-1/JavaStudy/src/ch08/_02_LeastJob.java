package ch08;

public class _02_LeastJob implements _02_SchedulerImpl{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("ㅎ녀재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}
	
}
