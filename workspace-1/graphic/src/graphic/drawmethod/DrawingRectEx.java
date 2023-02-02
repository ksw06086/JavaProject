package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingRectEx extends JFrame {
	public DrawingRectEx() {
		setTitle("���簢�� �׸���");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(400, 330);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// drawRect(x, y, w, h);
			// x, y : ���� �� �𼭸� ���� x, y ��ǥ
			// w : ���簢���� �ʺ�(�ȼ�)
			// h : ���簢���� ����(�ȼ�)
			g.drawRect(50,120,300,120);
			g.drawRect(80,40,140,220);
		}
	}
	
	public static void main(String[] args) {
		new DrawingRectEx(); 
	}
}
