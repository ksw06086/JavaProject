package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingPolygonTest extends JFrame {
	public DrawingPolygonTest() {
		setTitle("다각형 그리기 연습문제");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(600, 500);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			int[] point_x = {120,30,220};
			int[] point_y = {50,140,140};
			
			// drawPolygon(int x[], int y[], int n);
			// x[] : 각 꼭지점의 x 좌표  |  y[] : 각 꼭지점의 y 좌표
			// n : n각형 지정
			g.drawPolygon(point_x, point_y, 3);

			int[] point_x1 = {330,240,430};
			int[] point_y1 = {50,140,140};
			g.drawPolygon(point_x1, point_y1, 3);
		}
	}
	
	public static void main(String[] args) {
		new DrawingPolygonTest(); 
	}
}
