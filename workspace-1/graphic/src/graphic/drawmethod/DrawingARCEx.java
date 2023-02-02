package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingARCEx extends JFrame {
	public DrawingARCEx() {
		setTitle("ȣ �׸���");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(400, 330);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// drawArc(x, y, w, h, s, e);
			// x, y : ���� �� �𼭸� ���� x, y ��ǥ
			// w : ȣ�� �ʺ�(�ȼ�) | h : ȣ�� ����(�ȼ�)
			// s : ȣ�� ���� ���� | e : ȣ�� �� ����
			g.drawArc(50,90,300,120,0,270);
			g.drawArc(80,40,140,230,90,180);
		}
	}
	
	public static void main(String[] args) {
		new DrawingARCEx(); 
	}
}
