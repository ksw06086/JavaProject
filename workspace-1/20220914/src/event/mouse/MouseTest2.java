package event.mouse;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 내부 클래스로 MouseListener 구현
public class MouseTest2 extends JFrame {
	JLabel lbl;
	
	public MouseTest2() {
		// 화면 기본 설정
		setTitle("마우스이벤트 연습2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 150, 500, 300);
		
		JPanel pan = new JPanel();
		lbl = new JLabel("마우스 동작에 따라 문자열 변경됨");
		lbl.setFont(new Font("맑은 고닥", Font.BOLD, 20));
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
			lbl.setText("마우스가 클릭되었습니다.");
			lbl.setForeground(Color.pink);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("마우스가 눌러졌습니다.");
			lbl.setForeground(new Color(255, 124, 126));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("마우스가 떨어졌습니다.");
			lbl.setForeground(Color.BLUE);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("마우스가 들어왔습니다.");
			lbl.setForeground(new Color(124, 255, 126));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setText("마우스가 나갔습니다.");
			lbl.setForeground(Color.LIGHT_GRAY);
		}
	}
}
