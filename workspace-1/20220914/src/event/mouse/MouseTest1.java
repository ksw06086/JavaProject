package event.mouse;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTest1 extends JFrame implements MouseListener {
	JLabel lbl;
	
	public MouseTest1() {
		// ȭ�� �⺻ ����
		setTitle("���콺�̺�Ʈ ����1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		lbl = new JLabel("���콺 ���ۿ� ���� ���ڿ� �����");
		pan.add(lbl);
		add("North", pan);

		addMouseListener(this);
		
		setVisible(true);
	}
	
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
		lbl.setForeground(Color.green);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("���콺�� �������ϴ�.");
		lbl.setForeground(Color.LIGHT_GRAY);
	}
	
	public static void main(String[] args) {
		new MouseTest1();
	}
}
