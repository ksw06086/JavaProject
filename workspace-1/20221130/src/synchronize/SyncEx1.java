package synchronize;

import java.util.Random;

/**
 * ����ȭ : ���� ���� �����尡 ���ÿ� ����Ǹ鼭 �ϳ��� ���� �ڿ��� ����Ϸ� �� ��, ��� �� ���������� �ϳ��� �����常 ����ϵ��� �ϴ� ��
 * 
 * synchronized Ű���� �̿�
 * ex) synchronized void �޼ҵ��() {  ...  }
 * 
 * */
class Gyul {
	static int gyul_count = 50;
	
	static public synchronized void TakeOut(String name, int n) {
		
		if (n <= gyul_count) {
			gyul_count -= n;
			System.out.println(name+": "+n+"���� ���� ����");
		} else {
			System.out.println(name+": "+"���� �����մϴ�.");
		}
		
		System.out.println(">> ���� �� : " + gyul_count);
	}
}

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		Random r = new Random();
		for(int i = 0; i <10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			
			if(Gyul.gyul_count == 0){
				System.out.println("���� �� �Ծ����ϴ�.");
				return;
			}
			
			Gyul.TakeOut(this.getName(), Math.abs(r.nextInt() % 7));
		}
	}
}

public class SyncEx1 {
	public static void main(String[] args) {
		MyThread my1, my2, my3;
		
		my1 = new MyThread("������");
		my2 = new MyThread("������");
		my3 = new MyThread("������");
		
		my1.start();
		my2.start();
		my3.start();
	}
}