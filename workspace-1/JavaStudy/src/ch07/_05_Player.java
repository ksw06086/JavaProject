package ch07;

public class _05_Player {
	// 멤버변수
	private _05_PlayerLevel level;
	
	// 생성자
	public _05_Player() {
		level = new _05_BeginnerLever();
		level.showLevelMessage();
	}
	
	public _05_PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(_05_PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
