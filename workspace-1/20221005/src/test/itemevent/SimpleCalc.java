package test.itemevent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import event.move.FrameDimens;

public class SimpleCalc extends JFrame {
	JTextField t1, t2, tResult;
	JRadioButton[] btns;
	
	public SimpleCalc() {
		Font font = new Font("a����������2", Font.BOLD, 15);
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
		ButtonGroup bg = new ButtonGroup();
		btns = new JRadioButton[btnStrs.length];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JRadioButton(btnStrs[i]);
			btns[i].addItemListener(btnL);
			bg.add(btns[i]);
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
	
	ItemListener btnL = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
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
