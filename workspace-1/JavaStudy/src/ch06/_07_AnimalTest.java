package ch06;

import java.util.ArrayList;

public class _07_AnimalTest {
	ArrayList<_07_Animal> aniList = new ArrayList<_07_Animal>();
	public static void main(String[] args) {
		_07_AnimalTest at = new _07_AnimalTest();
		at.addAnimal();
		at.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new _07_Human());
		aniList.add(new _07_Tiger());
		aniList.add(new _07_Eagle());
		
		for(_07_Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {
			_07_Animal ani = aniList.get(i);
			if(ani instanceof _07_Human) {
				_07_Human h = (_07_Human)ani;
				h.readBook();
			} else if(ani instanceof _07_Tiger) {
				_07_Tiger t = (_07_Tiger)ani;
				t.hunting();
			} else if(ani instanceof _07_Eagle) {
				_07_Eagle e = (_07_Eagle)ani;
				e.flying();
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
}
