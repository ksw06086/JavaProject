package graphic.drawmethod;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingFillManyEx extends JFrame {
	public DrawingFillManyEx() {
		setTitle("채워진 도형 그리기");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(300, 250);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// g.fillRect - 채워진 직사각형 그리기
			// g.fillOval - 채워진 타원 그리기
			// g.fillRoundRect - 채워진 둥근 사각형 그리기
			// g.fillPolygon - 채워진 다각형 그리기
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
