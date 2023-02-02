package test.p2;

import test.p1.Parent;

public class Child extends Parent{
	public void test() {
		name = "À¯ÄèÇÑ";
		testPro();
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.test();
	}
}
