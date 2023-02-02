package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingOvalEx extends JFrame {
	public DrawingOvalEx() {
		setTitle("Ÿ�� �׸���");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(400, 330);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// drawOval(x, y, w, h);
			// x, y : ���� �� �𼭸� ���� x, y ��ǥ
			// w : ���� �ʺ�(�ȼ�) | h : ���� ����(�ȼ�)
			g.drawOval(50,90,300,120);
			g.drawOval(80,40,140,230);
		}
	}
	
	public static void main(String[] args) {
		new DrawingOvalEx(); 
	}
}
