package test.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import test.center.LocationCenter;

public class GridLayoutTest extends JFrame {
	public GridLayoutTest() {
		setTitle("GridLayout ¿¬½À");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 3));
		
		
		JButton[] btns = new JButton[12];
		String[] extras = {"*", "0", "#"};
		for(int i = 0; i < btns.length; i++) {
			if(i<9)
				btns[i] = new JButton(i+1+"");
			else
				btns[i] = new JButton(extras[i-9]);
			add(btns[i]);
		}
		
		
		int w = 300;
		int h = 400;
		LocationCenter c = new LocationCenter(w, h);
		setBounds(c.getX(), c.getY(), w, h);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
