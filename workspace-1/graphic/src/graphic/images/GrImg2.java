package graphic.images;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrImg2 extends JFrame {
	Image img;
	String s = "C:\\Users\\Happy\\Downloads\\images.jpg";
	
	public GrImg2() {
		setTitle("�̹��� ����");
		
		add("Center", new MyPanel());
		img = Toolkit.getDefaultToolkit().getImage(s);
		setSize(300,350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// Image img = Toolkit.getDefaultToolkit().getImage(String �̹��� ���� ��);
			// g.drawImage(img, int x, int y, this);    or  g.drawImage(img, int x, int y, int width, int height, this);
			// x, y : �̹����� ǥ�õ� x, y ��ǥ
			// width, height : �̹����� ����, ���� ũ��
			g.drawImage(img, 70, 20, 200, 270, this);
		}
	}
	
	public static void main(String[] args) {
		new GrImg2();
	}
}
