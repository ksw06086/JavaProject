package network.url;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * <클래스>
 * - URL :  인터넷상의 자원을 표현하는 URL 정보를 나타냄(절대 경로, 상대 경로를 이용하는 방법이 있음)
 * <메소드>
 * - Object getContent()				- 해당 URL의 컨텐트를 반환
 * - String getFile()					- 해당 URL의 파일 이름 반환
 * - String getHost()					- 해당 URL의 호스트 이름 반환
 * - String getPath()					- 해당 URL의 경로 부분 반환
 * - Int getPort()						- 해당 URL의 포트 번호 반환
 * - String getProtocol()				- 해당 URL의 프로토콜 이름 반환 
 * - InputStream openStream()			- URL 주소와 연결한 뒤 해당 연결로부터 입력받을 수 있는 InputStream 객체 반환
 * - URLConnection openConnection()		- URL 주소와 원격 객체에 접속한 뒤 통신할 수 있는 URLConnection 객체 반환
 * 
 * **/
public class URLReadEx extends JFrame implements ActionListener{
	JLabel lbl1, lbl2;
	JPanel pan1;
	JTextArea area;
	JScrollPane scroller;
	JTextField tf;
	JButton btn;
	
	public URLReadEx() {
		setTitle("URL 클래스");
		lbl1 = new JLabel(" 정보를 읽을 호스트 URL 이름을 입력하세요");
		lbl2 = new JLabel("호스트 URL 이름 : ");
		area = new JTextArea();
		area.setLineWrap(true);
		scroller = new JScrollPane(area);
		tf = new JTextField(25);
		btn = new JButton("정보수집");
		btn.addActionListener(this);
		
		pan1 = new JPanel();
		pan1.add(lbl2);
		pan1.add(tf);
		pan1.add(btn);
		
		add("North", pan1);
		add("Center", scroller);
		add("South", lbl1);		// 똑같은 객체는 2번 화면에 들어갈 수 없다.
		
		setSize(500, 250);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String Myurl;
		
		if(e.getSource() == btn) {
			try {
				area.setText("");
				Myurl = tf.getText();
				URL aURL = new URL(Myurl);
				URLConnection uc = aURL.openConnection();
				BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
				String inputLIne;
				while((inputLIne = in.readLine()) != null) {
					area.append(inputLIne + "\n");
				}
				in.close();
				
			} catch (Exception e2) {
				System.out.println("데이터를 읽는 도중에 에러가 발생하였습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		new URLReadEx();
	}

}
