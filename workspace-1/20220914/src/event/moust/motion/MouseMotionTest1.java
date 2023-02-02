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
		// 화면 기본 설정
		setTitle("마우스이벤트 연습1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		lbl = new JLabel("마우스 동작에 따라 문자열 변경됨");
		pan.add(lbl);
		add("North", pan);

		addMouseMotionListener(this);
		
		setVisible(true);
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
	
	public static void main(String[] args) {
		new MouseMotionTest1();
	}

}
