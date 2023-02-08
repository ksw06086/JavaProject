package socket.server.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 다수 개의 연결 요청을 받아들일 수 있는 기능
public class ServerSocketThread extends Thread{
	Socket s1;
	ChatServer st;
	PrintWriter pw;
	BufferedReader br;
	String name;
	String threadName = "Thread";
	
	public ServerSocketThread(ChatServer st, Socket s1) {
		this.s1 = s1;																								// 클라이언트
		this.st = st;																									// 접속할 서버
		threadName = getName();																			// 클라이언트 이름
		System.out.println(s1.getInetAddress() + "에서 접속했습니다.");
		System.out.println("Thread Name: " + threadName);
	}
	
	public void sendMessage(String str) {
		pw.println(str);
	}
	
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			pw = new PrintWriter(s1.getOutputStream(), true);
			sendMessage("대화명을 넣으세요:");
			name = br.readLine();
			st.broadCasting("[" + name + "]" + "님 입장.");
			
			while(true) {
				String strin = br.readLine();
				st.broadCasting("[" + name + ": ]" + strin);
			}
		} catch (Exception e) {
			System.out.println(threadName + " 님 퇴장.");
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
