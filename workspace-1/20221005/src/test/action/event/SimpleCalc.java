package test.action.event;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import event.move.FrameDimens;

public class SimpleCalc extends JFrame {
	JTextField t1, t2, tResult;
	JButton[] btns;
	
	public SimpleCalc() {
		Font font = new Font("a����������3", Font.BOLD, 15);
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		tResult = new JTextField();
		tResult.setFont(font);
		tResult.setEditable(false);
		tResult.setBackground(Color.white);
		// tResult.setEnabled(false);
		JPanel panTf = new JPanel();
		JPanel panBtn = new JPanel();
		
		String[] btnStrs = {"���ϱ�", "����", "���ϱ�", "������"};
		btns = new JButton[btnStrs.length];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(btnStrs[i]);
			btns[i].addActionListener(btnL);
			panBtn.add(btns[i]);
		}
		panTf.add(t1);	panTf.add(t2);
		
		add("North", panTf);
		add("Center", panBtn);
		add("South", tResult);
		
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
			String oper = "";
			double result = 0;
			Object eBtn = e.getSource();
			if(eBtn == btns[0]) {
				oper = " + ";
				result = num1+num2;
			} else if(eBtn == btns[1]) {
				oper = " - ";
				result = num1-num2;
			} else if(eBtn == btns[2]) {
				oper = " * ";
				result = num1*num2;
			} else if(eBtn == btns[3]) {
				oper = " / ";
				result = num1/num2;
			}
			tResult.setText(num1 + oper + num2 + " = " + String.format("%.2f", result));
			
			// e.getActionCommand()�� �̿��� switch���� ����ϴ� ���
//			switch (e.getActionCommand()) {
//			case "���ϱ�":
//				tResult.setText("������ ����� " + (num1+num2) + "�Դϴ�.");
//				break;
//			case "����":
//				tResult.setText("������ ����� " + (num1-num2) + "�Դϴ�.");
//				break;
//			case "���ϱ�":
//				tResult.setText("���ϱ��� ����� " + (num1*num2) + "�Դϴ�.");
//				break;
//			case "������":
//				tResult.setText("�������� ����� " + (num1/num2) + "�Դϴ�.");
//				break;
//			default:
//				break;
//			}
		}
	};
	
	public static void main(String[] args) {
		new SimpleCalc();
	}
}
