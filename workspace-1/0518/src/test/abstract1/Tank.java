package test.abstract1;

public class Tank extends Weapon{
	
	public void forward() {
		System.out.println("�����Ѵ�.");
	}
	
	@Override
	public void reload() {
		System.out.println("���⸦ �����ϴ�.");
	}
	
	@Override
	public void fire() {
		System.out.println("������");
	}
}
