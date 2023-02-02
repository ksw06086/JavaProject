package event.moust.motion;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseMotionTest2 extends JFrame {
	JLabel lbl;
	
	public MouseMotionTest2() {
		// 화면 기본 설정
		setTitle("마우스이벤트 연습1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		lbl = new JLabel("마우스 동작에 따라 문자열 변경됨");
		pan.add(lbl);
		add("North", pan);

		addMouseMotionListener(new FrameMouseMotionListener(lbl));
		
		setVisible(true);
	}	
	
	public static void main(String[] args) {
		new MouseMotionTest2();
	}

}
