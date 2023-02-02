package test.static1;

public class RunClsStaticEx {
	public static void main(String[] args) {
		ClsStaticEx c1 = new ClsStaticEx();
		ClsStaticEx c2 = new ClsStaticEx();
		
		c1.ins = 30;
		c2.ins = 70;
		
		System.out.println("c1.ins= " + c1.ins + ",c2.ins=" + c2.ins);
		
		c1.stc = 20;
		c2.stc = 80;
		ClsStaticEx.stc = 333;
		
		System.out.println("c1.stc= " + c1.stc + ",c2.stc=" + c2.stc);
		System.out.println("ClsStaticEx.stc=" + ClsStaticEx.stc);
	}
}
