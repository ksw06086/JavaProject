package event.mouse;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameMouseAdapter extends MouseAdapter {
	JLabel lbl;
	Container framePane;
	
	FrameMouseAdapter(JLabel lbl, Container framePane) {
		this.lbl = lbl;
		this.framePane = framePane;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("���콺�� Ŭ���Ǿ����ϴ�.");
		lbl.setForeground(Color.pink);
		framePane.setBackground(Color.pink);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("���콺�� ���Խ��ϴ�.");
		lbl.setForeground(new Color(124, 50, 255));
		framePane.setBackground(new Color(124, 50, 255));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("���콺�� �������ϴ�.");
		lbl.setForeground(Color.LIGHT_GRAY);
		framePane.setBackground(Color.lightGray);
	}

}
