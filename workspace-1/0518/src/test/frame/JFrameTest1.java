package test.frame;

import javax.swing.JFrame;

public class JFrameTest1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("첫 윈도우");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,400);
		f.setVisible(true);
	}
}
