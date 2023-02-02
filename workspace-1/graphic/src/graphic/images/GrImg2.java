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
		setTitle("이미지 파일");
		
		add("Center", new MyPanel());
		img = Toolkit.getDefaultToolkit().getImage(s);
		setSize(300,350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// Image img = Toolkit.getDefaultToolkit().getImage(String 이미지 파일 명);
			// g.drawImage(img, int x, int y, this);    or  g.drawImage(img, int x, int y, int width, int height, this);
			// x, y : 이미지가 표시될 x, y 좌표
			// width, height : 이미지의 가로, 세로 크기
			g.drawImage(img, 70, 20, 200, 270, this);
		}
	}
	
	public static void main(String[] args) {
		new GrImg2();
	}
}
