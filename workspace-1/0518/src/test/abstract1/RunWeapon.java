package test.abstract1;

public class RunWeapon {
	public static void main(String[] args) {
//		�߻�Ŭ������ new �����ڷ� ���ο� ��ü ���� �Ұ���
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
