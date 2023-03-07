package ch06;

public class _03_Manager extends _03_Employee {
	private int bonus; 	// 보너스

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 : " + bonus);
	}
}
