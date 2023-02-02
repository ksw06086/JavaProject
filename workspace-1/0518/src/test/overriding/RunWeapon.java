package test.overriding;

public class RunWeapon {
	
	public static void main(String[] args) {
		Weapon w = new Weapon();
		w.fire();
		
		Laser l = new Laser();
		l.reload();
		l.fire();
		
		Bomb b = new Bomb();
		b.reload(); 
		b.fire();
	}
	
}
