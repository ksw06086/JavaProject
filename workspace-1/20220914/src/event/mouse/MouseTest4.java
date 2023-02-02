package event.mouse;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ������ Ŭ������ MouseAdapter ����
public class MouseTest4 extends JFrame {
	JLabel lbl;
	
	public MouseTest4() {
		// ȭ�� �⺻ ����
		setTitle("���콺�̺�Ʈ ����2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		lbl = new JLabel("���콺 ���ۿ� ���� ���ڿ� �����");
		lbl.setFont(new Font("���� ���", Font.BOLD, 20));
		pan.add(lbl);
		add("North", pan);
		Container framePane = getContentPane();

		addMouseListener(new FrameMouseAdapter(lbl, framePane));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseTest4();
	}
}
