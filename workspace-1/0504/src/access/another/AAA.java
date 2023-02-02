package access.another;

import access.base.AccessBase;

public class AAA {
//	AccessBase(접근을 당하는 클래스)와 다른 패키지
//	public 일 때 접근 가능
	public void test() {
		AccessBase base = new AccessBase();	
		base.a = 10;//public
//		base.b = 20;//default
//		base.c = 30;//protected
//		base.d = 40;//private은 같은 패키지라도 접근 불가능
	}
	
	
	
}
