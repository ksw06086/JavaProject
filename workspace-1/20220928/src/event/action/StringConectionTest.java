package event.action;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import event.move.FrameDimens;

public class StringConectionTest extends JFrame implements ActionListener{
	JLabel lbl;
	TextField t1, t2;
	
	public StringConectionTest() {
		t1 = new TextField(15);
		t2 = new TextField(15);
		lbl = new JLabel("문자열을 연결해드립니다.");
		JButton btn = new JButton("연결");
		JPanel panBtn = new JPanel();
		JPanel panTf = new JPanel();
		panBtn.add(btn);
		panTf.add(t1);
		panTf.add(t2);
		add("North", panBtn);
		add("Center", panTf);
		add("South", lbl);
		
		btn.addActionListener(this);
		
		// 화면 기본 설정
		setTitle("문자열 연결");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		lbl.setText(t1.getText() + " " +  t2.getText());
	}	
	
	public static void main(String[] args) {
		new StringConectionTest();
	}


}
