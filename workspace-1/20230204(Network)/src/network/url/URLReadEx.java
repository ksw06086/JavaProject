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
 * <Ŭ����>
 * - URL :  ���ͳݻ��� �ڿ��� ǥ���ϴ� URL ������ ��Ÿ��(���� ���, ��� ��θ� �̿��ϴ� ����� ����)
 * <�޼ҵ�>
 * - Object getContent()								- �ش� URL�� ����Ʈ�� ��ȯ
 * - String getFile()										- �ش� URL�� ���� �̸� ��ȯ
 * - String getHost()									- �ش� URL�� ȣ��Ʈ �̸� ��ȯ
 * - String getPath()									- �ش� URL�� ��� �κ� ��ȯ
 * - Int getPort()											- �ش� URL�� ��Ʈ ��ȣ ��ȯ
 * - String getProtocol()								- �ش� URL�� �������� �̸� ��ȯ 
 * - InputStream openStream()					- URL �ּҿ� ������ �� �ش� ����κ��� �Է¹��� �� �ִ� InputStream ��ü ��ȯ
 * - URLConnection openConnection()			- URL �ּҿ� ���� ��ü�� ������ �� ����� �� �ִ� URLConnection ��ü ��ȯ
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
		setTitle("URL Ŭ����");
		lbl1 = new JLabel(" ������ ���� ȣ��Ʈ URL �̸��� �Է��ϼ���");
		lbl2 = new JLabel("ȣ��Ʈ URL �̸� : ");
		area = new JTextArea();
		area.setLineWrap(true);
		scroller = new JScrollPane(area);
		tf = new JTextField(25);
		btn = new JButton("��������");
		btn.addActionListener(this);
		
		pan1 = new JPanel();
		pan1.add(lbl2);
		pan1.add(tf);
		pan1.add(btn);
		
		add("North", pan1);
		add("Center", scroller);
		add("South", lbl1);		// �Ȱ��� ��ü�� 2�� ȭ�鿡 �� �� ����.
		
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
				System.out.println("�����͸� �д� ���߿� ������ �߻��Ͽ����ϴ�.");
			}
		}
	}
	
	public static void main(String[] args) {
		new URLReadEx();
	}

}
