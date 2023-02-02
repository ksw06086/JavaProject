package test.overriding;

public class Bomb extends Weapon {
	
	@Override
	public void fire() {
		System.out.println("½´¿ì¿õ~~ÄçÄç");
		super.fire();
	}
	
}
