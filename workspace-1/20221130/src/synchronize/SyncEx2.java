package synchronize;

import java.util.Random;

/**
 * * syncronized 메소드는 여러개의 쓰레드가 동시에 임계영역 들어가지 못하도록 할 때
 * * wait(), notify(), notityAll() 메소드는 두개의 쓰레드를 교대로 들어가게 하려고 할 때
 * 1. wait() 메소드 : 가지고 있던 lock을 양봐고 대기상태로 들어감
 * ① 한 쓰레드에만 적용 됨 / ② synchronized 키워드로 선언된 임계영역에서만 호출됨
 * 			<wait()>																	<notify()>	
 * synchronized void 메소드명() {								synchronized void 메소드명() {
 * 	while(조건식)															while(조건식)
 * 	{	...																		{	...
 * 		wait();																	notify();
 * 		...		}																	...		}
 * }																			}
 * */

// 생산자(Producer)와 소비자(Consumer) 프로그램을 2개의 쓰레드로 구현
class Buffer {
	int data = 0;
	boolean available = false;
	
	public synchronized int get() {
		while(available == false) {
			try {
				wait();
			} catch (InterruptedException e) {	}
		}
		available = false;
		notifyAll();
		return data;
	}
	
	public synchronized void put(int num) {
		while(available == true) {
			try {
				wait();
			} catch (InterruptedException e) {	}
		}
		data = num;
		available = true;
		notifyAll();
	}
}

// 생산자
class Producer extends Thread {
	Buffer dataBuffer;
	
	public Producer(Buffer b) {
		dataBuffer = b;
	}
	
	public void run() {
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			dataBuffer.put(i);
			System.out.println("생산자: " + i);
			
			try {
				sleep(Math.abs(r.nextInt() % 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// 소비자
class Consumer extends Thread {
	Buffer dataBuffer;
	
	public Consumer(Buffer b) {
		dataBuffer = b;
	}
	
	public void run() {
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int num = dataBuffer.get();
			System.out.println("소비자: " + num);
			
			try {
				sleep(Math.abs(r.nextInt() % 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class SyncEx2 {
	public static void main(String[] args) {
		Buffer b = new Buffer();
		
		Producer p = new Producer(b);
		p.start();
		
		Consumer c = new Consumer(b);
		c.start();
		
	}
}
