package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingRoundRectEx extends JFrame {
	public DrawingRoundRectEx() {
		setTitle("�ձ����簢�� �׸���");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(400, 300);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// drawRoundRect(x, y, w, h, c_width, c_height);
			// x, y : ���� �� �𼭸� ���� x,y ��ǥ
			// w : ���簢���� �ʺ�(�ȼ�)  |  h : ���簢���� ����(�ȼ�)
			// c_width : �𼭸��� �ʺ�(�ȼ�)  |  c_height : �𼭸��� ����(�ȼ�)
			g.drawRoundRect(50,90,300,120,30,30);
			g.drawRoundRect(80,10,140,220,70,70);
		}
	}
	
	public static void main(String[] args) {
		new DrawingRoundRectEx(); 
	}
}
