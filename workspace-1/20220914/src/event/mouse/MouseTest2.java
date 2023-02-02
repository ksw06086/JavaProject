package event.mouse;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ���� Ŭ������ MouseListener ����
public class MouseTest2 extends JFrame {
	JLabel lbl;
	
	public MouseTest2() {
		// ȭ�� �⺻ ����
		setTitle("���콺�̺�Ʈ ����2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		lbl = new JLabel("���콺 ���ۿ� ���� ���ڿ� �����");
		lbl.setFont(new Font("���� ���", Font.BOLD, 20));
		pan.add(lbl);
		add("North", pan);

		addMouseListener(new FrameListener());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseTest2();
	}
	
	class FrameListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("���콺�� Ŭ���Ǿ����ϴ�.");
			lbl.setForeground(Color.pink);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("���콺�� ���������ϴ�.");
			lbl.setForeground(new Color(255, 124, 126));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("���콺�� ���������ϴ�.");
			lbl.setForeground(Color.BLUE);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("���콺�� ���Խ��ϴ�.");
			lbl.setForeground(new Color(124, 255, 126));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("���콺�� �������ϴ�.");
			lbl.setForeground(Color.LIGHT_GRAY);
		}
	}
}
