package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingRoundRectEx extends JFrame {
	public DrawingRoundRectEx() {
		setTitle("둥근직사각형 그리기");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(400, 300);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// drawRoundRect(x, y, w, h, c_width, c_height);
			// x, y : 왼쪽 위 모서리 점의 x,y 좌표
			// w : 직사각형의 너비(픽셀)  |  h : 직사각형의 높이(픽셀)
			// c_width : 모서리의 너비(픽셀)  |  c_height : 모서리의 높이(픽셀)
			g.drawRoundRect(50,90,300,120,30,30);
			g.drawRoundRect(80,10,140,220,70,70);
		}
	}
	
	public static void main(String[] args) {
		new DrawingRoundRectEx(); 
	}
}
