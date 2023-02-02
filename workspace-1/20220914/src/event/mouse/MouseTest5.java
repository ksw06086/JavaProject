package event.mouse;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ������ Ŭ������ MouseAdapter ����
public class MouseTest5 extends JFrame {
	JLabel lbl;
	
	public MouseTest5() {
		// ȭ�� �⺻ ����
		setTitle("���콺�̺�Ʈ ����2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		JButton btn = new JButton("��ư�Դϴ�.");
		lbl = new JLabel("���콺 ���ۿ� ���� ���ڿ� �����");
		lbl.setFont(new Font("���� ���", Font.BOLD, 20));
		pan.add(lbl);
		pan.add(btn);
		add("North", pan);

		btn.addMouseListener(new ButtonMouseListener(lbl,btn));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseTest5();
	}
}
