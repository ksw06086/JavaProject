package graphic.drawmethod;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingStringEx1 extends JFrame {
	public DrawingStringEx1() {
		setTitle("���ڿ� ����ϱ�");
		
		MyPan pan = new MyPan();
		add("Center",pan);
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("drawString�� �̿��� ���ڿ� ����ϱ�", 50, 100);
		}
	}
	
	public static void main(String[] args) {
		new DrawingStringEx1(); 
	}
}
