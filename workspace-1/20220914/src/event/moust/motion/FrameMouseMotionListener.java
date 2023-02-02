package event.moust.motion;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class FrameMouseMotionListener implements MouseMotionListener {
	JLabel lbl;
	
	FrameMouseMotionListener(JLabel lbl) {
		this.lbl = lbl;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("마우스가 드래그됩니다==> " + e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("마우스가 움직입니다==> " + e.getX() + ", " + e.getY());
	}

}
