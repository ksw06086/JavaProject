package graphic.drawmethod;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingColorEx extends JFrame {
	public DrawingColorEx() {
		setTitle("���� �ִ� ���� �׸���");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(300, 250);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// g.setColor(new Color(int R, int G, int B) or Color.�����̸�);
			// drawXXX();
			// R : �������� ��(0~255) | G : �ʷϻ��� ��(0~255) | B : �Ķ����� ��(0~255)
			g.setColor(Color.green);
			g.drawRect(100,40,80,50);
			g.setColor(Color.orange);
			g.drawOval(20,110,100,50);
		}
	}
	
	public static void main(String[] args) {
		new DrawingColorEx(); 
	}
}
