package graphic.event.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ColorDrawingEvent extends JFrame implements ActionListener {
	JRadioButton btnRed = new JRadioButton("»¡°­");
	JRadioButton btnBlue = new JRadioButton("ÆÄ¶û");
	JRadioButton btnYellow = new JRadioButton("³ë¶û");
	ButtonGroup rg = new ButtonGroup();
	Color color = new Color(0, 0, 0); 
	
	public ColorDrawingEvent() {
		setTitle("ÀÌº¥Æ®·Î µµÇü ±×¸®±â");
		
		MyPan pan = new MyPan();
		JPanel pan2 = new JPanel();
		pan2.add(btnRed);
		pan2.add(btnBlue);
		pan2.add(btnYellow);
		btnRed.addActionListener(this);
		btnBlue.addActionListener(this);
		btnYellow.addActionListener(this);
		
		rg.add(btnRed);
		rg.add(btnBlue);
		rg.add(btnYellow);
		
		add("North", pan2);
		add("Center",pan);
		setSize(300, 210);
		setVisible(true);
	}
	
	class MyPan extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(color);
			g.fillOval(80,30,120, 70);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRed) {
			color = Color.RED;
			repaint();
		} else if(e.getSource() == btnBlue) {
			color = Color.BLUE;
			repaint();
		} else if(e.getSource() == btnYellow) {
			color = Color.YELLOW;
			repaint();
		}
	}

	public static void main(String[] args) {
		new ColorDrawingEvent(); 
	}
}
