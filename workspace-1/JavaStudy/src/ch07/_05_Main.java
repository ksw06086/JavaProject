package ch07;

public class _05_Main {
	public static void main(String[] args) {
		_05_Player player = new _05_Player();
		player.play(1);
		
		// 중급자 레벨업
		_05_AdvancedLevel alevel = new _05_AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		//고급자 레벨업
		_05_SuperLevel slevel = new _05_SuperLevel();
		player.upgradeLevel(slevel);
		player.play(3);
	}
}