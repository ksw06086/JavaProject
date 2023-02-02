package event.moust.motion;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseMotionTest1 extends JFrame implements MouseMotionListener {
	JLabel lbl;
	
	public MouseMotionTest1() {
		// ȭ�� �⺻ ����
		setTitle("���콺�̺�Ʈ ����1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		lbl = new JLabel("���콺 ���ۿ� ���� ���ڿ� �����");
		pan.add(lbl);
		add("North", pan);

		addMouseMotionListener(this);
		
		setVisible(true);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("���콺�� �巡�׵˴ϴ�==> " + e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("���콺�� �����Դϴ�==> " + e.getX() + ", " + e.getY());
	}	
	
	public static void main(String[] args) {
		new MouseMotionTest1();
	}

}
