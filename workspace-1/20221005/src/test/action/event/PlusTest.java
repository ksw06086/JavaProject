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
		Font font = new Font("a����������3", Font.BOLD, 15);
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		lbl = new JLabel("�� ���� ���� ���մϴ�.");
		lbl.setFont(font);
		JButton btn = new JButton("���ϱ�");
		JPanel panTf = new JPanel();
		JPanel panBtn = new JPanel();
		panBtn.add(btn);
		panTf.add(t1);	panTf.add(t2);
		add("North", panTf);
		add("Center", panBtn);
		add("South", lbl);
		
		btn.addActionListener(btnL);
		
		// ȭ�� �⺻ ����
		setTitle("���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	ActionListener btnL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			double num1 = Double.parseDouble(t1.getText());
			double num2 = Double.parseDouble(t2.getText());
			lbl.setText("������ ����� " + (num1+num2) + "�Դϴ�.");
		}
		
	};
	
	public static void main(String[] args) {
		new PlusTest();
	}


}
