package test.action.event;

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
import javax.swing.JTextField;

import event.move.FrameDimens;

public class PlusTest extends JFrame {
	JLabel lbl;
	JTextField t1, t2;
	
	public PlusTest() {
		Font font = new Font("a옛날사진관3", Font.BOLD, 15);
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		lbl = new JLabel("두 개의 수를 더합니다.");
		lbl.setFont(font);
		JButton btn = new JButton("더하기");
		JPanel panTf = new JPanel();
		JPanel panBtn = new JPanel();
		panBtn.add(btn);
		panTf.add(t1);	panTf.add(t2);
		add("North", panTf);
		add("Center", panBtn);
		add("South", lbl);
		
		btn.addActionListener(btnL);
		
		// 화면 기본 설정
		setTitle("숫자 덧셈");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	ActionListener btnL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			double num1 = Double.parseDouble(t1.getText());
			double num2 = Double.parseDouble(t2.getText());
			lbl.setText("덧셈의 결과는 " + (num1+num2) + "입니다.");
		}
		
	};
	
	public static void main(String[] args) {
		new PlusTest();
	}


}
