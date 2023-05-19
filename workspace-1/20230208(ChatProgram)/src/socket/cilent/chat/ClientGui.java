package socket.cilent.chat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * <구현할 기능>
 * 1. 프로그램의 화면을 구성하는 기능
 * 2. 서버로의 소켓 연결을 시도하는 기능
 * 3. 사용자가 입력한 메시지를 서버로 전송하는 기능
 * 4. 다른 클라이언트가 보낸 메시지를 서버로부터 수신하는 기능
 * 5. 메시지의 전송 기능과 수신 기능을 동시에 구현하기 위한 쓰레드 기능
 * **/
public class ClientGui extends JPanel implements ActionListener, Runnable{
	JFrame mainf;
	Panel pan1 = new Panel();
	Panel pan2 = new Panel();
	TextArea area1 = new TextArea(20, 50);
	TextField tf1 = new TextField(50);
	
	Socket s;
	PrintWriter pw;
	BufferedReader br;
	String str1;
	
	// Socket clientSocket = new Socket(frame, "128.12.1.1", 8558);
	// JFrame 화면 생성 및 클라이언트 소켓 생성
	public ClientGui(JFrame mainf, String ip, int port) {
		this.mainf = mainf; // 해당 클래스에 JFrame 기본 생성
		System.out.println(this.getClass().getName() + "1. Start-->");
		inits();  // JFrame 화면 디자인 입히기												// 화면 구성
		try {
			// 클라이언트 소캣 생성 및 서버 접속
			s = new Socket(ip, port);						// 소켓 연결
		} catch (Exception e) {
			System.out.println("소켓 생성 실패");
		}
		System.out.println(this.getClass().getName() + "2. Socket-->");
	}
	
	/**Component initialization*/
	// 프로그램 화면 구성
	private void inits() {
		mainf.setTitle(this.getClass().getName());
		this.setSize(new Dimension(400, 300));
		this.setLayout(new BorderLayout());
		pan1.setLayout(new BorderLayout());
		pan2.setLayout(new BorderLayout());
		
		tf1.setText("먼저 이름을 입력해주세요");
		this.add(pan1, BorderLayout.CENTER);
		this.add(pan2, BorderLayout.SOUTH);
		pan1.add(area1, BorderLayout.CENTER);
		pan2.add(tf1, BorderLayout.CENTER);
		
		this.tf1.addActionListener(this);
		this.area1.setEditable(false);
		this.tf1.requestFocus();
	}

	
	// 메시지 읽고 쓰는 객체 생성해서 송수신
	public void giveAndTake() {
		try {
			System.out.println(this.getClass().getName() + "3. inputOutput-->");
			// 네트워크 입출력 스트림 생성(pw : 서버에게 값 보냄, br : 서버 값 가져옴)
			pw = new PrintWriter(s.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 해당 사용자의 스레드를 생성해서 기동 시작
			Thread ctr = new Thread(this);
			ctr.start();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	// tf1.action시 발생 : 메시지를 보내면 새로고침
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.tf1.requestFocus();
		String strs = this.tf1.getText(); // -- tf1 값 가져오기
		pw.println(strs);	// -- 서버에 tf1 값 출력해줌, flush 안쓰는 건 누적해서 화면에 모두 나오게 해야하기 때문
		this.tf1.setText(""); // -- tf1 새로고침
	}
	
	// 입력된 메시지 화면에 출력하기
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(this.getClass().getName() + "4. run-->");
			// 서버에서 값 가져오기
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 서버에서 가져온 값 area1에 출력해주기
			while((str1 = br.readLine()) != null) {
				this.area1.append(str1 + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	

}
