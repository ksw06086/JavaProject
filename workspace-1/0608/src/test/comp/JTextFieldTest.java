package test.comp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.center.LocationCenter;

public class JTextFieldTest extends JFrame {
	
	public JTextFieldTest() {
		JPanel[] p = new JPanel[3];
		String[] pText = {"North", "Center", "South"};
		JLabel[] lbl = new JLabel[p.length];
		String[] lblText = {"성명 : ", "전화 : ", "주소 : "};
		JTextField[] t = new JTextField[p.length];
		for (int i = 0; i < p.length; i++) {
			p[i] = new JPanel();
			lbl[i] = new JLabel(lblText[i]);
			t[i] = new JTextField((i+1)*10);
			p[i].add(lbl[i]); 
			p[i].add(t[i]);
			add(p[i], pText[i]);
		}
		t[2].setText("실제 거주하는 주소 기입");
		
		int w = 400;
		int h = 135;
		setTitle("JTextField 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LocationCenter lc = new LocationCenter(w,h);
		setBounds(lc.getX(), lc.getY(), w, h);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}
