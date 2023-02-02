package thread1;

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

public class ThreadTest3 extends Thread{
	public ThreadTest3(String name) {
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
		}
	}
}
