package test.abstract1;

public class Soldier extends Weapon{
	
	@Override
	public void reload() {
		System.out.println("���⸦ �����ϴ�.");
	}
	
	@Override
	public void fire() {
		System.out.println("�ٴٴٴٴ�");
	}
	
	public void walk() {
		System.out.println("������ �ȴ´�.");
	}
}
