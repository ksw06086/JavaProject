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
		JLabel lbl1 = new JLabel("유한대학교");
		JLabel lbl2 = new JLabel("컴퓨터소프트웨어공학과");
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
