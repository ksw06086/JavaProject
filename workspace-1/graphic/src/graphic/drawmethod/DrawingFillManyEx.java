package graphic.drawmethod;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingFillManyEx extends JFrame {
	public DrawingFillManyEx() {
		setTitle("ä���� ���� �׸���");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(300, 250);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// g.fillRect - ä���� ���簢�� �׸���
			// g.fillOval - ä���� Ÿ�� �׸���
			// g.fillRoundRect - ä���� �ձ� �簢�� �׸���
			// g.fillPolygon - ä���� �ٰ��� �׸���
			g.setColor(Color.green);
			g.fillRect(100,40,80,50);
			g.setColor(Color.orange);
			g.fillOval(20,110,100,50);
		}
	}
	
	public static void main(String[] args) {
		new DrawingFillManyEx(); 
	}
}
