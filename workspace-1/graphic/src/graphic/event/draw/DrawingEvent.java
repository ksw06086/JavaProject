package graphic.event.draw;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingEvent extends JFrame implements ActionListener {
	JButton btnRect = new JButton("사각형");
	JButton btnOval = new JButton("원");
	int wRect = 0, hRect = 0;
	int wOval = 0, hOval = 0;
	
	public DrawingEvent() {
		setTitle("이벤트로 도형 그리기");
		
		MyPan pan = new MyPan();
		JPanel pan2 = new JPanel();
		pan2.add(btnRect);
		pan2.add(btnOval);
		btnRect.addActionListener(this);
		btnOval.addActionListener(this);
		
		add("North", pan2);
		add("Center",pan);
		setSize(300, 210);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(80, 50, wRect, hRect);
			g.drawOval(80,50,wOval, hOval);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRect) {
			wRect = 120;
			hRect = 70;
			wOval = 0;
			hOval = 0;
			repaint();
		} else if(e.getSource() == btnOval) {
			wRect = 0;
			hRect = 0;
			wOval = 120;
			hOval = 70;
			repaint();
		}
		
	}

	public static void main(String[] args) {
		new DrawingEvent(); 
	}
}
