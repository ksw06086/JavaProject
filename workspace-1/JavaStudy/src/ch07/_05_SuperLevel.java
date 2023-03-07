package ch07;

public class _05_SuperLevel extends _05_PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("아주 빨리 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("아주 높이 jump합니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("한바퀴 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("*** 고급자 레벨입니다. ***");
	}
	
	
}
