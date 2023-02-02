package event.action;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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

public class ActionTest1 extends JFrame{
	JLabel lbl;
	JButton btn;
	Font fontOrigin;
	
	public ActionTest1() {
		btn = new JButton("����");
		JButton btn2 = new JButton("�������");
		lbl = new JLabel("��ư�� Ŭ���غ�����.");														// ���� ����
		fontOrigin = lbl.getFont();
		JPanel pan = new JPanel();
		pan.add(btn);
		pan.add(btn2);
		add("North", pan);
		add("Center", lbl);
		
		btn.addActionListener(btnListener);
		btn2.addActionListener(btnListener);
		
		// ȭ�� �⺻ ����
		setTitle("ActionEvent ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	ActionListener btnListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				lbl.setText("��ư�� Ŭ���Ǿ����ϴ�.");
				Font font = new Font("���� ���", Font.BOLD+Font.ITALIC, 35);
				lbl.setFont(font);
				lbl.setForeground(new Color(255,201,194));
				lbl.setBackground(Color.white);
				lbl.setOpaque(true);
			} else {
				lbl.setFont(fontOrigin);
				lbl.setOpaque(false);
				lbl.setForeground(Color.black);
			}
		}
	};	
	
	public static void main(String[] args) {
		new ActionTest1();
	}


}
