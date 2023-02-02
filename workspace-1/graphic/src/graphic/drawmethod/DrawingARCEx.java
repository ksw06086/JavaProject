package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingARCEx extends JFrame {
	public DrawingARCEx() {
		setTitle("호 그리기");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(400, 330);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			// drawArc(x, y, w, h, s, e);
			// x, y : 왼쪽 위 모서리 점의 x, y 좌표
			// w : 호의 너비(픽셀) | h : 호의 높이(픽셀)
			// s : 호의 시작 각도 | e : 호의 끝 각도
			g.drawArc(50,90,300,120,0,270);
			g.drawArc(80,40,140,230,90,180);
		}
	}
	
	public static void main(String[] args) {
		new DrawingARCEx(); 
	}
}
