package test.itemevent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import event.move.FrameDimens;

public class ItemTest2 extends JFrame{
	JTextArea area;
	JCheckBox[] checks;
	int[] chkMoney= {15000, 10000, 20000, 25000};
	
	public ItemTest2() {
		Font font = new Font("a����������3", Font.BOLD, 15);
		JLabel lbl = new JLabel("��ٱ��Ͽ� ���� ������ �����ϼ���.");
		JPanel p1 = new JPanel();
		area = new JTextArea();
		area.setFont(font);
		area.setEditable(false);
		area.setBackground(Color.white);
		
		String[] chkStrs = {"����", "���", "��", "õ��������"};
		checks = new JCheckBox[chkStrs.length];
		for (int i = 0; i < chkStrs.length; i++) {
			checks[i] = new JCheckBox(chkStrs[i]);
			checks[i].addItemListener(chkL);
			p1.add(checks[i]);
		}
		
		add("North", lbl);
		add("Center", area);
		add("South", p1);
		
		// ȭ�� �⺻ ����
		setTitle("isSelected() ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	ItemListener chkL = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			int total = 0;
			area.setText("");
			
			// enhanced For(for~each): �迭�̳� ArrayList�� ���� Collection ����� ��ü�� ������� �����ͼ� �ݺ�
//			for (JCheckBox check : checks) {
//				if(check.isSelected()) {
//					area.append("<<" + check.getText() + ">>");
//				}
//			}
			
			for (int i = 0; i < checks.length; i++) {
				if(checks[i].isSelected()) {
					area.append("<<" + checks[i].getText() + "(" + chkMoney[i] + ")" + ">>");
					total += chkMoney[i];
				}
			}
			area.append(String.format("\n\n\n ��ٱ��� �Ѿ�: %d��", total));
		}
	};
	
	public static void main(String[] args) {
		new ItemTest2();
	}
}
