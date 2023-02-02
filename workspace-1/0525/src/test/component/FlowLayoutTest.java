package test.component;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import test.center.LocationCenter;

public class FlowLayoutTest extends JFrame {
	public FlowLayoutTest() {
		setTitle("FlowLayout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

		String[] btnStr = {"가", "나", "다", "라", "마", "바", "사"};
		JButton[] btns = new JButton[btnStr.length];
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(btnStr[i]);
			add(btns[i]);
		}
		
		int w = 200;
		int h = 300;
		LocationCenter c = new LocationCenter(w, h);
		setBounds(c.getX(), c.getY(), w, h);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
