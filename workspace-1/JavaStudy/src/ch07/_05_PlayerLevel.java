package ch07;

public abstract class _05_PlayerLevel {
	// �߻�޼ҵ�
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// ���ø� �޼ҵ�
	final public void go(int count) {
		run();
		for(int i = 0; i< count ; i++) {
			jump();
		}
		turn();
	}
}
