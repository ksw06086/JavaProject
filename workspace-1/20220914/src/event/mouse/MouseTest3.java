package event.mouse;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ������ Ŭ������ MouseListener ����
public class MouseTest3 extends JFrame {
	JLabel lbl;
	
	public MouseTest3() {
		// ȭ�� �⺻ ����
		setTitle("���콺�̺�Ʈ ����2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		lbl = new JLabel("���콺 ���ۿ� ���� ���ڿ� �����");
		lbl.setFont(new Font("���� ���", Font.BOLD, 20));
		pan.add(lbl);
		add("North", pan);

		addMouseListener(new FrameMouseListener(lbl));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseTest3();
	}
}
