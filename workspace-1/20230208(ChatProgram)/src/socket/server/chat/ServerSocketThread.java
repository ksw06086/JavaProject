package socket.server.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// �ټ� ���� ���� ��û�� �޾Ƶ��� �� �ִ� ���
public class ServerSocketThread extends Thread{
	Socket s1;
	ChatServer st;
	PrintWriter pw;
	BufferedReader br;
	String name;
	String threadName = "Thread";
	
	public ServerSocketThread(ChatServer st, Socket s1) {
		this.s1 = s1;																								// Ŭ���̾�Ʈ
		this.st = st;																									// ������ ����
		threadName = getName();																			// Ŭ���̾�Ʈ �̸�
		System.out.println(s1.getInetAddress() + "���� �����߽��ϴ�.");
		System.out.println("Thread Name: " + threadName);
	}
	
	public void sendMessage(String str) {
		pw.println(str);
	}
	
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			pw = new PrintWriter(s1.getOutputStream(), true);
			sendMessage("��ȭ���� ��������:");
			name = br.readLine();
			st.broadCasting("[" + name + "]" + "�� ����.");
			
			while(true) {
				String strin = br.readLine();
				st.broadCasting("[" + name + ": ]" + strin);
			}
		} catch (Exception e) {
			System.out.println(threadName + " �� ����.");
			st.removeClient(this);
		} finally {
			try {
				s1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
