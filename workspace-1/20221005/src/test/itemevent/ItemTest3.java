package test.itemevent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import event.move.FrameDimens;

public class ItemTest3 extends JFrame{
	JTextArea area;
	JRadioButton[] radios;
	
	public ItemTest3() {
		Font font = new Font("a����������2", Font.BOLD, 15);
		JLabel lbl = new JLabel("�����ϴ� ����Ʈ�� �����ϼ���.");
		JPanel p1 = new JPanel();
		area = new JTextArea();
		area.setFont(font);
		area.setEditable(false);
		area.setBackground(Color.white);
		
		String[] radioStrs = {"Ŀ��", "����ũ", "Ǫ��", "����"};
		// �ٲ� �κ�: ������ư �׷�ȭ
		ButtonGroup bg = new ButtonGroup();
		radios = new JRadioButton[radioStrs.length];
		for (int i = 0; i < radioStrs.length; i++) {
			radios[i] = new JRadioButton(radioStrs[i]);
			radios[i].addItemListener(radioL);
			// �ٲ� �κ� 
			bg.add(radios[i]);
			p1.add(radios[i]);
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
	
	ItemListener radioL = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			area.setText("");
			
			// enhanced For(for~each): �迭�̳� ArrayList�� ���� Collection ����� ��ü�� ������� �����ͼ� �ݺ�
			for (JRadioButton radio : radios) {
				if(radio.isSelected()) {
					area.append(radio.getText() + "��(��) �����Ͽ����ϴ�.");
				}
			}
		}
	};
	
	public static void main(String[] args) {
		new ItemTest3();
	}
}
