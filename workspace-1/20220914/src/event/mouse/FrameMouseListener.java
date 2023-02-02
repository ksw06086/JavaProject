package event.mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class FrameMouseListener implements MouseListener {
	JLabel lbl;
	
	FrameMouseListener(JLabel lbl) {
		this.lbl = lbl;
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
		lbl.setForeground(new Color(124, 50, 255));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("���콺�� �������ϴ�.");
		lbl.setForeground(Color.LIGHT_GRAY);
	}

}
