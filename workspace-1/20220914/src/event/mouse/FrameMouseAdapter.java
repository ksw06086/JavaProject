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
		lbl.setText("마우스가 클릭되었습니다.");
		lbl.setForeground(Color.pink);
		framePane.setBackground(Color.pink);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("마우스가 들어왔습니다.");
		lbl.setForeground(new Color(124, 50, 255));
		framePane.setBackground(new Color(124, 50, 255));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("마우스가 나갔습니다.");
		lbl.setForeground(Color.LIGHT_GRAY);
		framePane.setBackground(Color.lightGray);
	}

}
