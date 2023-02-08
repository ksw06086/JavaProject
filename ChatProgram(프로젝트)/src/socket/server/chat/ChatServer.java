package socket.server.chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

// Ŭ���̾�Ʈ�κ����� ���� ��û�� ����ϰ� ���� �� �����ϴ� ����� ����
public class ChatServer {
	ServerSocket ss;
	Socket s;
	Vector<Thread> v;
	
	public ChatServer() {
		v = new Vector<>(5,5);
		System.out.println("ä�� ���� ����");
	}
	
	public void giveAndTake() {
		try {
			ss = new ServerSocket(9876);																				// ���� �غ�
			
			// TCP ������ ���� �� �ش� ������ �����ð� ���� Ÿ�Ӿƿ� ���·� ���ӵǴ� ��찡 ����.
			// �̷��� ��쿡�� ���� ��Ʈ�� ���ε带 �� �� �����Ƿ�,
			// true�� �����ϸ� ������ ���� �� Ÿ�Ӿƿ��� ���ӵǴ��� ���� ��Ʈ�� ���ε尡 ������.	*���ε� : �� ������ �������ִ� �۾�
			ss.setReuseAddress(true);																					
			while(true) {
				s=ss.accept();																									// ���� �ѱ�
				ServerSocketThread svrth = new ServerSocketThread(this, s);						// ServerSocketThread ��ü ����
				addClient(svrth);
				svrth.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Ŭ���̾�Ʈ ����
	public synchronized void addClient(Thread tr) {
		v.add(tr);
		System.out.println("Ŭ���̾�Ʈ 1�� ����, �� " + v.size() + "��");
	}
	
	// Ŭ���̾�Ʈ ����
	public synchronized void removeClient(Thread tr) {
		v.add(tr);
		System.out.println("Ŭ���̾�Ʈ 1�� ����, �� " + v.size() + "��");
	}
	
	public synchronized void broadCasting(String sbc) {
		for(int i=0; i<v.size(); i++) {
			ServerSocketThread svtr = (ServerSocketThread)v.get(i);
			svtr.sendMessage(sbc);
		}
	}
	
}
