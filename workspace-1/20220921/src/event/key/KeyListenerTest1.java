package event.key;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerTest1 extends JFrame {
	JLabel lbl;
	
	public KeyListenerTest1() {
		
		lbl = new JLabel("키를 눌러주세요.");
		add("North", lbl);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lbl.setText("키Type가 눌러졌습니다. : " + e.getKeyChar());
			}
		});
		
		// 화면 기본 설정
		setTitle("키리스너 연습1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
		requestFocus();
	}
	
	
//	 @Override
//	 public void keyTyped(KeyEvent e) { 
//		 lbl.setText("키Type가 눌러졌습니다. : " + e.getKeyChar()); 
//	 }
//	 
//	 @Override 
//	 public void keyPressed(KeyEvent e) { 
//		 lbl.setText("키가 눌러졌습니다. : " + e.getKeyText(e.getKeyCode()));
//	 }
//	 
//	 @Override 
//	 public void keyReleased(KeyEvent e) { 
//		 lbl.setText("키가 떼어졌습니다. : " + e.getKeyText(e.getKeyCode())); 
//	 }
	 
	
	public static void main(String[] args) {
		new KeyListenerTest1();
	}
}
