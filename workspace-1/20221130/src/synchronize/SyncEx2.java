package synchronize;

import java.util.Random;

/**
 * * syncronized �޼ҵ�� �������� �����尡 ���ÿ� �Ӱ迵�� ���� ���ϵ��� �� ��
 * * wait(), notify(), notityAll() �޼ҵ�� �ΰ��� �����带 ����� ���� �Ϸ��� �� ��
 * 1. wait() �޼ҵ� : ������ �ִ� lock�� ����� �����·� ��
 * �� �� �����忡�� ���� �� / �� synchronized Ű����� ����� �Ӱ迵�������� ȣ���
 * 			<wait()>																	<notify()>	
 * synchronized void �޼ҵ��() {								synchronized void �޼ҵ��() {
 * 	while(���ǽ�)															while(���ǽ�)
 * 	{	...																		{	...
 * 		wait();																	notify();
 * 		...		}																	...		}
 * }																			}
 * */

// ������(Producer)�� �Һ���(Consumer) ���α׷��� 2���� ������� ����
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

// ������
class Producer extends Thread {
	Buffer dataBuffer;
	
	public Producer(Buffer b) {
		dataBuffer = b;
	}
	
	public void run() {
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			dataBuffer.put(i);
			System.out.println("������: " + i);
			
			try {
				sleep(Math.abs(r.nextInt() % 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// �Һ���
class Consumer extends Thread {
	Buffer dataBuffer;
	
	public Consumer(Buffer b) {
		dataBuffer = b;
	}
	
	public void run() {
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int num = dataBuffer.get();
			System.out.println("�Һ���: " + num);
			
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
