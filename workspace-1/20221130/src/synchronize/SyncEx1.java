package synchronize;

import java.util.Random;

/**
 * 동기화 : 여러 개의 쓰레드가 동시에 실행되면서 하나의 같은 자원을 사용하려 할 때, 어느 한 시점에서는 하나의 쓰레드만 사용하도록 하는 것
 * 
 * synchronized 키워드 이용
 * ex) synchronized void 메소드명() {  ...  }
 * 
 * */
class Gyul {
	static int gyul_count = 50;
	
	static public synchronized void TakeOut(String name, int n) {
		
		if (n <= gyul_count) {
			gyul_count -= n;
			System.out.println(name+": "+n+"개의 귤을 꺼냄");
		} else {
			System.out.println(name+": "+"귤이 부족합니다.");
		}
		
		System.out.println(">> 남은 귤 : " + gyul_count);
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
				System.out.println("귤을 다 먹었습니다.");
				return;
			}
			
			Gyul.TakeOut(this.getName(), Math.abs(r.nextInt() % 7));
		}
	}
}

public class SyncEx1 {
	public static void main(String[] args) {
		MyThread my1, my2, my3;
		
		my1 = new MyThread("이지민");
		my2 = new MyThread("정지원");
		my3 = new MyThread("정해인");
		
		my1.start();
		my2.start();
		my3.start();
	}
}