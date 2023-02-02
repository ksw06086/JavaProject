package event.mouse;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 독립된 클래스로 MouseAdapter 구현
public class MouseTest5 extends JFrame {
	JLabel lbl;
	
	public MouseTest5() {
		// 화면 기본 설정
		setTitle("마우스이벤트 연습2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		JButton btn = new JButton("버튼입니다.");
		lbl = new JLabel("마우스 동작에 따라 문자열 변경됨");
		lbl.setFont(new Font("맑은 고닥", Font.BOLD, 20));
		pan.add(lbl);
		pan.add(btn);
		add("North", pan);

		btn.addMouseListener(new ButtonMouseListener(lbl,btn));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseTest5();
	}
}
