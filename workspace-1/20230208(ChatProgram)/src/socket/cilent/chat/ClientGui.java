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
 * <������ ���>
 * 1. ���α׷��� ȭ���� �����ϴ� ���
 * 2. �������� ���� ������ �õ��ϴ� ���
 * 3. ����ڰ� �Է��� �޽����� ������ �����ϴ� ���
 * 4. �ٸ� Ŭ���̾�Ʈ�� ���� �޽����� �����κ��� �����ϴ� ���
 * 5. �޽����� ���� ��ɰ� ���� ����� ���ÿ� �����ϱ� ���� ������ ���
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
		inits();															// ȭ�� ����
		try {
			s = new Socket(ip, port);							// ���� ����
		} catch (Exception e) {
			System.out.println("���� ���� ����");
		}
		System.out.println(this.getClass().getName() + "2. Socket-->");
	}
	
	/**Component initialization*/
	// ���α׷� ȭ�� ����
	private void inits() {
		mainf.setTitle(this.getClass().getName());
		this.setSize(new Dimension(400, 300));
		this.setLayout(new BorderLayout());
		pan1.setLayout(new BorderLayout());
		pan2.setLayout(new BorderLayout());
		
		tf1.setText("���� �̸��� �Է����ּ���");
		this.add(pan1, BorderLayout.CENTER);
		this.add(pan2, BorderLayout.SOUTH);
		pan1.add(area1, BorderLayout.CENTER);
		pan2.add(tf1, BorderLayout.CENTER);
		
		this.tf1.addActionListener(this);
		this.area1.setEditable(false);
		this.tf1.requestFocus();
	}
	
	// �޽����� ������ ���ΰ�ħ
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.tf1.requestFocus();
		String strs = this.tf1.getText();
		pw.println(strs);
		this.tf1.setText("");
	}
	
	// �޽��� �а� ���� ��ü �����ؼ� �ۼ���
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
	
	// �Էµ� �޽��� ȭ�鿡 ����ϱ�
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
