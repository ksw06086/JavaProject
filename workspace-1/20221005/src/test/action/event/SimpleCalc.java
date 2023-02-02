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
		Font font = new Font("a옛날사진관3", Font.BOLD, 15);
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		tResult = new JTextField();
		tResult.setFont(font);
		tResult.setEditable(false);
		tResult.setBackground(Color.white);
		// tResult.setEnabled(false);
		JPanel panTf = new JPanel();
		JPanel panBtn = new JPanel();
		
		String[] btnStrs = {"더하기", "빼기", "곱하기", "나누기"};
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
		
		// 화면 기본 설정
		setTitle("간단 계산기");
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
			
			// e.getActionCommand()를 이용해 switch문을 사용하는 방법
//			switch (e.getActionCommand()) {
//			case "더하기":
//				tResult.setText("덧셈의 결과는 " + (num1+num2) + "입니다.");
//				break;
//			case "빼기":
//				tResult.setText("빼기의 결과는 " + (num1-num2) + "입니다.");
//				break;
//			case "곱하기":
//				tResult.setText("곱하기의 결과는 " + (num1*num2) + "입니다.");
//				break;
//			case "나누기":
//				tResult.setText("나누기의 결과는 " + (num1/num2) + "입니다.");
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
