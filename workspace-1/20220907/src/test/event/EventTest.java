package test.event;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventTest extends JFrame implements MouseListener, KeyListener{
	JTextField t1 = null;
	JButton btn = null;
	JLabel lbl = null;
	
	public EventTest() {
		t1 = new JTextField();
		btn = new JButton("클릭하세요.");
		lbl = new JLabel();
		
		add(t1,"North");
		add(btn,"South");
		add(lbl,"Center");
		
		btn.addMouseListener(this);
		t1.addKeyListener(this);
		
		// 화면 기본 설정
		setTitle("JEvent 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 150, 500, 400);
		setVisible(true);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("텍스트필드에 키가 눌렸어요!");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("버튼이 클릭되었습니다.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("마우스커서가 버튼 안으로 들어옴.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("마우스커서가 버튼 밖으로 나감.");
	}
	
	
	public static void main(String[] args) {
		new EventTest();
	}
}
