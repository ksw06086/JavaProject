package ch07;

public abstract class _05_PlayerLevel {
	// 추상메소드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// 템플릿 메소드
	final public void go(int count) {
		run();
		for(int i = 0; i< count ; i++) {
			jump();
		}
		turn();
	}
}