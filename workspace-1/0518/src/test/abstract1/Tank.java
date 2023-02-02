package test.abstract1;

public class Tank extends Weapon{
	
	public void forward() {
		System.out.println("전진한다.");
	}
	
	@Override
	public void reload() {
		System.out.println("무기를 장전하다.");
	}
	
	@Override
	public void fire() {
		System.out.println("쾅쾅쾅");
	}
}
