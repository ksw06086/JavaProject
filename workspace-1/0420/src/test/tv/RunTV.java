package test.tv;

public class RunTV {
	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();
		
		t1.setMaker("LG");
		t1.setColor("White");
		t1.setSize(70);
		
		t2.setMaker("SAMSUNG");
		t2.setColor("Silver");
		t2.setSize(55);
		
		System.out.println("================================");
		System.out.println("* ������ : " + t1.getMaker() + "����");
		System.out.println("* ũ�� : " + t1.getSize() + "��ġ");
		System.out.println("* ���� : " + t1.getColor());
		t1.powerOn();
		for(int i = 0; i<10; i++) {
			t1.volumeUp();
		}
		for(int i = 0; i<7; i++) {
			t1.upChannel();
		}
		
		t1.powerOff();
		System.out.println("================================");
		
		System.out.println();
		
		System.out.println("================================");
		System.out.println("* ������ : " + t2.getMaker() + "����");
		System.out.println("* ũ�� : " + t2.getSize() + "��ġ");
		System.out.println("* ���� : " + t2.getColor());
		System.out.println("================================");
		
		
		
	}
}
