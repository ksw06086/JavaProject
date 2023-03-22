package network.internet.inetaddress;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.util.Arrays;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * <클래스>
 * - InetAddress : 자바 언어에서 IP주소를 활용하기 위한 클래스
 * <메소드>
 * - byte[] getAddress()														- IP주소를 byte 배열로 반환
 * - static InetAddress[] getAllByName(String host)	- 도메인명(host)에 지정된 모든 호스트의 IP주소를 배열로 반환
 * - static InetAddress getByName(String host)		- 도메인명(host)를 통해 IP주소를 얻음
 * - static InetAddress getByAddress(byte[] addr)	- byte 배열을 통해 IP주소를 얻음
 * - String getHostAddress()						- 호스트의 IP주소를 반환(들어간 사이트 또는 프로그램의 호스트 IP주소)
 * - String getHostName()							- 호스트의 이름을 반환
 * - static InetAddress getLocalHost()				- 지역 호스트의 IP주소 반환(나와 연결된 와이파이 IP주소)
 * - boolean isLoopbackAddress()					- loopback주소인지 확인
 * - boolean isMulticastAddress()					- 멀티캐스트주소인지 확인
 * 
 * */
public class TcpipEx1 extends JFrame implements ActionListener{
	JLabel lbl1, lbl2;
	JPanel pan1;
	JTextArea area;
	JTextField tf;
	JButton btn;
	
	public TcpipEx1() {
		setTitle("InetAddress 클래스");
		lbl1 = new JLabel(" 검사할 호스트 이름을 입력하세요");
		lbl2 = new JLabel("호스트 이름 : ");
		area = new JTextArea();
		tf = new JTextField(25);
		btn = new JButton("검사실행");
		btn.addActionListener(this);
		
		pan1 = new JPanel();
		pan1.add(lbl2);
		pan1.add(tf);
		pan1.add(btn);
		add("North", pan1);
		add("Center", area);
		add("South", lbl1);
		
		setSize(500, 250);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		String Myurl;
		
		if(e.getSource() == btn) {
			try {
				area.setText("");
				Myurl = tf.getText();
				ip = InetAddress.getByName(Myurl);
				area.append("getHostName() :" + ip.getHostName() + "\n");
				area.append("getHostAddress() :" + ip.getHostAddress() + "\n");
				area.append("toString() :" + ip.toString()+"\n");
				
				byte[] ipAddr = ip.getAddress();
				area.append("getAddress() :" + Arrays.toString(ipAddr));
				
				String result = "";
				for (int i = 0; i < ipAddr.length; i++) {
					result += (ipAddr[i] < 0) ? ipAddr[i] + 256 : ipAddr[i];
					result += ".";
				}
				area.append("getAddress() + 256 :" + result + "\n");
				area.append("\n");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				ip = InetAddress.getLocalHost();
				area.append("getHostName() :" + ip.getHostName() + "\n");
				area.append("getHostAddress() :" + ip.getHostAddress() + "\n");
				area.append("\n");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new TcpipEx1();
	}

}
