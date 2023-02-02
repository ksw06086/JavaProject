package event.key;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnMoveFrame extends JFrame implements KeyListener {
	public static final int W = 100;
	public static final int H = 50;
	int x, y;
	JButton btn;
	
	public BtnMoveFrame() {
		setLayout(null);
		btn = new JButton("움직이는 버튼");
		btn.setBounds(x, y, W, H);
		add(btn);
		addKeyListener(this);
		
		// 화면 기본 설정
		setTitle("키리스너 연습2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
		requestFocus();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) 
		{	
			case KeyEvent.VK_UP:
				x = btn.getX();
				y = btn.getY() - 10;
				break;
			case KeyEvent.VK_DOWN: 
				x = btn.getX();
				y = btn.getY() + 10;
				break;
			case KeyEvent.VK_RIGHT: 
				x = btn.getX() + 10;
				y = btn.getY();
				break;
			case KeyEvent.VK_LEFT: 
				x = btn.getX() - 10;
				y = btn.getY();
				break;
			case KeyEvent.VK_F1: 
				btn.setBackground(new Color(255,231,200));
				break;
			case KeyEvent.VK_F2: 
				btn.setBackground(new Color(200,200,255));
				break;
		}
		if(x < 0  || x > 390 || y < 0 || y > 520) {
			
		} else {
			btn.setLocation(x,y);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new BtnMoveFrame();
	}
}
