package test.abstract1;

public class Soldier extends Weapon{
	
	@Override
	public void reload() {
		System.out.println("무기를 장전하다.");
	}
	
	@Override
	public void fire() {
		System.out.println("다다다다다");
	}
	
	public void walk() {
		System.out.println("군인이 걷는다.");
	}
}
