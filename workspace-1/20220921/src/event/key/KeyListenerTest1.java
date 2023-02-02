package event.key;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerTest1 extends JFrame {
	JLabel lbl;
	
	public KeyListenerTest1() {
		
		lbl = new JLabel("Ű�� �����ּ���.");
		add("North", lbl);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lbl.setText("ŰType�� ���������ϴ�. : " + e.getKeyChar());
			}
		});
		
		// ȭ�� �⺻ ����
		setTitle("Ű������ ����1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
		requestFocus();
	}
	
	
//	 @Override
//	 public void keyTyped(KeyEvent e) { 
//		 lbl.setText("ŰType�� ���������ϴ�. : " + e.getKeyChar()); 
//	 }
//	 
//	 @Override 
//	 public void keyPressed(KeyEvent e) { 
//		 lbl.setText("Ű�� ���������ϴ�. : " + e.getKeyText(e.getKeyCode()));
//	 }
//	 
//	 @Override 
//	 public void keyReleased(KeyEvent e) { 
//		 lbl.setText("Ű�� ���������ϴ�. : " + e.getKeyText(e.getKeyCode())); 
//	 }
	 
	
	public static void main(String[] args) {
		new KeyListenerTest1();
	}
}
