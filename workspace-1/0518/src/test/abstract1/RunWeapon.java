package test.abstract1;

public class RunWeapon {
	public static void main(String[] args) {
//		추상클래스는 new 연산자로 새로운 객체 생성 불가능
//		Weapon w = new Weapon();
		Soldier s = new Soldier();
		Tank t = new Tank();
		
		s.walk();
		s.reload();
		s.fire();
		
		t.forward();
		t.reload();
		t.fire();
		
	}
}
