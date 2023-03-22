package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingLineEx extends JFrame {
	public DrawingLineEx() {
		setTitle("직선 그리기");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// drawLine(x1,y1,x2,y2);		
			// x1, y1 : 첫 번째 점의 x, y 좌표 | x2, y2 : 두 번째 점의 x, y 좌표
			g.drawLine(50, 30, 250, 150);
			g.drawLine(50, 120, 270, 60);
		}
	}
	
	public static void main(String[] args) {
		new DrawingLineEx(); 
	}
}
