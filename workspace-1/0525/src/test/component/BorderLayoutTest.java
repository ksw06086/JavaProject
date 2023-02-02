package test.component;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import test.center.LocationCenter;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		setTitle("BorderLayout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(20, 10));

		String[] btnStr = {"가", "나", "다", "라", "마"};
		JButton[] btns = new JButton[btnStr.length];
		String[] locStr = {"North", "South", "West", "East", "Center"};
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(btnStr[i]);
			add(btns[i],locStr[i]);
		}
		
		int w = 200;
		int h = 300;
		LocationCenter c = new LocationCenter(w, h);
		setBounds(c.getX(), c.getY(), w, h);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
