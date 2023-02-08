package socket.server.chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

// 클라이언트로부터의 연결 요청을 대기하고 수락 및 관리하는 기능을 구현
public class ChatServer {
	ServerSocket ss;
	Socket s;
	Vector<Thread> v;
	
	public ChatServer() {
		v = new Vector<>(5,5);
		System.out.println("채팅 서버 시작");
	}
	
	public void giveAndTake() {
		try {
			ss = new ServerSocket(9876);																				// 서버 준비
			
			// TCP 접속을 닫은 뒤 해당 접속이 일정시간 동안 타임아웃 상태로 지속되는 경우가 있음.
			// 이러한 경우에는 동일 포트로 바인드를 할 수 없으므로,
			// true로 설정하면 접속이 닫힌 뒤 타임아웃이 지속되더라도 동일 포트로 바인드가 가능함.	*바인드 : 두 정보를 연결해주는 작업
			ss.setReuseAddress(true);																					
			while(true) {
				s=ss.accept();																									// 서버 켜기
				ServerSocketThread svrth = new ServerSocketThread(this, s);						// ServerSocketThread 객체 생성
				addClient(svrth);
				svrth.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 클라이언트 입장
	public synchronized void addClient(Thread tr) {
		v.add(tr);
		System.out.println("클라이언트 1명 입장, 총 " + v.size() + "명");
	}
	
	// 클라이언트 퇴장
	public synchronized void removeClient(Thread tr) {
		v.add(tr);
		System.out.println("클라이언트 1명 퇴장, 총 " + v.size() + "명");
	}
	
	public synchronized void broadCasting(String sbc) {
		for(int i=0; i<v.size(); i++) {
			ServerSocketThread svtr = (ServerSocketThread)v.get(i);
			svtr.sendMessage(sbc);
		}
	}
	
}
