package java.problem.test;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import test.center.LocationCenter;

public class myCalc1 extends JFrame{
	
	public myCalc1() {
		JLabel lbl = new JLabel("0");
		add("South",lbl);
		
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(4,3));
		
		JButton[] btns = new JButton[12];
		String[] extras = {"*", "0", "#"};
		for(int i = 0; i < btns.length; i++) {
			if(i<9)
				btns[i] = new JButton(i+1+"");
			else
				btns[i] = new JButton(extras[i-9]);
			pan.add(btns[i]);
		}
		add("Center", pan);
		
		JButton res = new JButton("=");
		add("North",res);
		
		// 화면 기본구성
		int w = 300;
		int h = 400;
		setTitle("계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LocationCenter c = new LocationCenter(w, h);
		setBounds(c.getX(), c.getY(), w, h);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new myCalc1();
	}
}
