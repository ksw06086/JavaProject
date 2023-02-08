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
	
	public ClientGui(JFrame mainf, String ip, int port) {
		this.mainf = mainf;
		System.out.println(this.getClass().getName() + "1. Start-->");
		inits();															// 화면 구성
		try {
			s = new Socket(ip, port);							// 소켓 연결
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
	
	// 메시지를 보내면 새로고침
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.tf1.requestFocus();
		String strs = this.tf1.getText();
		pw.println(strs);
		this.tf1.setText("");
	}
	
	// 메시지 읽고 쓰는 객체 생성해서 송수신
	public void giveAndTake() {
		try {
			System.out.println(this.getClass().getName() + "3. inputOutput-->");
			pw = new PrintWriter(s.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			Thread ctr = new Thread(this);
			ctr.start();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	// 입력된 메시지 화면에 출력하기
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(this.getClass().getName() + "4. run-->");
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
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
