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
 * <Ŭ����>
 * - InetAddress : �ڹ� ���� IP�ּҸ� Ȱ���ϱ� ���� Ŭ����
 * <�޼ҵ�>
 * - byte[] getAddress()														- IP�ּҸ� byte �迭�� ��ȯ
 * - static InetAddress[] getAllByName(String host)			- �����θ�(host)�� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ��ȯ
 * - static InetAddress getByName(String host)					- �����θ�(host)�� ���� IP�ּҸ� ����
 * - static InetAddress getByAddress(byte[] addr)				- byte �迭�� ���� IP�ּҸ� ����
 * - String getHostAddress()												- ȣ��Ʈ�� IP�ּҸ� ��ȯ(�� ����Ʈ �Ǵ� ���α׷��� ȣ��Ʈ IP�ּ�)
 * - String getHostName()													- ȣ��Ʈ�� �̸��� ��ȯ
 * - static InetAddress getLocalHost()								- ���� ȣ��Ʈ�� IP�ּ� ��ȯ(���� ����� �������� IP�ּ�)
 * - boolean isLoopbackAddress()										- loopback�ּ����� Ȯ��
 * - boolean isMulticastAddress()										- ��Ƽĳ��Ʈ�ּ����� Ȯ��
 * 
 * */
public class TcpipEx1 extends JFrame implements ActionListener{
	JLabel lbl1, lbl2;
	JPanel pan1;
	JTextArea area;
	JTextField tf;
	JButton btn;
	
	public TcpipEx1() {
		setTitle("InetAddress Ŭ����");
		lbl1 = new JLabel(" �˻��� ȣ��Ʈ �̸��� �Է��ϼ���");
		lbl2 = new JLabel("ȣ��Ʈ �̸� : ");
		area = new JTextArea();
		tf = new JTextField(25);
		btn = new JButton("�˻����");
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
