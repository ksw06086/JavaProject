package test.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import test.center.LocationCenter;

public class BorderFlowTest extends JFrame implements ActionListener {
	JLabel lbl;
	JButton[] btns;
	
	public BorderFlowTest() {
		setTitle("BorderFlow 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p1.setBackground(new Color(248,248,255));
		add("North", p1);
		add("Center", p2);
		add("South", p3);
		
		String[] btnStr = {"징버거(노랑)", "비챤(녹색)", "고세구(파랑)"};
		btns = new JButton[btnStr.length];
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(btnStr[i]);
			btns[i].addActionListener(this);
		}
		
		lbl = new JLabel("버튼을 클릭하세요~~~");
		
		p1.add(btns[0]);
		p1.add(btns[1]);
		p1.add(btns[2]);
		p3.add(lbl);
		
		int w = 400;
		int h = 150;
		LocationCenter c = new LocationCenter(w, h);
		setBounds(c.getX(), c.getY(), w, h);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new BorderFlowTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		if(btn == btns[0]) {
			lbl.setForeground(Color.yellow);
			lbl.setText(btns[0].getText() + "버튼을 클릭하셨군요.");
		} else if(btn == btns[1]) {
			lbl.setForeground(Color.green);
			lbl.setText(btns[1].getText() + "버튼을 클릭하셨군요.");
		} else {
			lbl.setForeground(Color.blue);
			lbl.setText(btns[2].getText() + "버튼을 클릭하셨군요.");
		}
	}
}
