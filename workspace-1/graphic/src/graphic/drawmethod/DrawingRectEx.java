package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingRectEx extends JFrame {
	public DrawingRectEx() {
		setTitle("직사각형 그리기");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(400, 330);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// drawRect(x, y, w, h);
			// x, y : 왼쪽 위 모서리 점의 x, y 좌표
			// w : 직사각형의 너비(픽셀)
			// h : 직사각형의 높이(픽셀)
			g.drawRect(50,120,300,120);
			g.drawRect(80,40,140,220);
		}
	}
	
	public static void main(String[] args) {
		new DrawingRectEx(); 
	}
}
