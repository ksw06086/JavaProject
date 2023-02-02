package test.component;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import test.center.LocationCenter;

public class JPanelTest extends JFrame {
	
	public JPanelTest() {
		setLayout(null);
		
		int w = 400;
		int h = 500;

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setBackground(Color.pink);
		p1.setBounds(0,0,w,150);
		p2.setBackground(Color.blue);
		p2.setBounds(0,150,w,150);
		add(p1);
		add(p2);		
		
		JButton b1 = new JButton("�ξ�");
		JButton b2 = new JButton("����");
		JButton b3 = new JButton("����");
		JButton b4 = new JButton("����");
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		setTitle("JPanel ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LocationCenter c = new LocationCenter(w, h);
		setBounds(c.getX(), c.getY(), w, h); // setLocation(x,y) + setSize(w,h) ���迡 �� ��
		setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) {
		new JPanelTest();
	}
}
