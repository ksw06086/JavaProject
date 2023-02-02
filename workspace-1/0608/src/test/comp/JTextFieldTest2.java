package test.comp;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.center.LocationCenter;

public class JTextFieldTest2 extends JFrame {
	
	public JTextFieldTest2() {
		JTextField t = new JTextField();
		int rows = 4, cols = 4;
		JPanel p = new JPanel(new GridLayout(rows, cols));
		JButton[] btns = new JButton[(rows*cols)];
		String[] btnText = {"0",".", "C", "+", "-", "*", "/"};
		for (int i = 0; i < btns.length; i++) {
			if(i < 9) {
				btns[i] = new JButton(i+1+"");
			} else {
				btns[i] = new JButton(btnText[i-9]);
			}
			p.add(btns[i]);
		}
		JButton lastbtn = new JButton("=");
		add(t, "North");
		add(p, "Center");
		add(lastbtn, "South");
		
		int w = 300;
		int h = 270;
		setTitle("°è»ê±â");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LocationCenter lc = new LocationCenter(w,h);
		setBounds(lc.getX(), lc.getY(), w, h);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new JTextFieldTest2();
	}
}
