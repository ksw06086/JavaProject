package test.constructor;

public class RunConstructor {
	public static void main(String[] args) {
		ConstructorTest ci = new ConstructorTest();
		ConstructorTest co = new ConstructorTest(202107045, "우왁굳");
		ConstructorTest cu = new ConstructorTest(202107046, "김요한");
		
		System.out.println("c1이 참조하는 객체의 학번 : " + co.getStuId());
		System.out.println("c1이 참조하는 객체의 이름 : " + co.getName());
		System.out.println("===============================");
		System.out.println("c2이 참조하는 객체의 학번 : " + cu.getStuId());
		System.out.println("c2이 참조하는 객체의 학번 : " + cu.getName());
	}
}
