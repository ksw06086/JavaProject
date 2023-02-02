package test.frame;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest2 extends JFrame {
	
	public JFrameTest2() {
		setLayout(new FlowLayout());
		int w = 500;
		int h = 300;
		LocationCenter lc = new LocationCenter(w, h);
		int x = lc.getX();
		int y = lc.getY();
		JLabel lbl1 = new JLabel("���Ѵ��б�");
		JLabel lbl2 = new JLabel("��ǻ�ͼ���Ʈ������а�");
		add(lbl1);
		add(lbl2);
		
		setTitle("First Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(w,h);
		setLocation(x, y);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameTest2();
		
	}
}
