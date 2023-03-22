package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingManyTest1 extends JFrame {
	public DrawingManyTest1() {
		setTitle("다양한 도형 그리기");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			g.drawLine(20, 40,90,90);
			g.drawRect(150,40,80,50);
			g.drawOval(20,150,100,50);
			g.drawArc(150,150,100,80,90,270);
		}
	}
	
	public static void main(String[] args) {
		new DrawingManyTest1(); 
	}
}
