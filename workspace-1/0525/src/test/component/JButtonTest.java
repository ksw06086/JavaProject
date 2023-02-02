package test.component;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import test.center.LocationCenter;

public class JButtonTest extends JFrame {
	public JButtonTest() {
		setLayout(new FlowLayout());
		JButton b1 = new JButton("전송");
		JButton b2 = new JButton("취소");
		b1.setBackground(new Color(248, 248, 255));
		b1.setForeground(Color.RED);
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.BLUE);
//		add(b1, "West");
//		add(b2, "Center");
		add(b1);
		add(b2);
		
		
		int w = 300;
		int h = 200;
		setTitle("JButton 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LocationCenter c = new LocationCenter(w, h);
		setLocation(c.getX(), c.getY());
		setSize(w,h);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JButtonTest();
		
		
	}
}
