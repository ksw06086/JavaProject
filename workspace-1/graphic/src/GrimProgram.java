import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GrimProgram extends JFrame implements MouseListener, MouseMotionListener, ActionListener{
	JMenuBar mbar = new JMenuBar();
	JMenu[] menus = new JMenu[3];
	JMenuItem[] colors = new JMenuItem[5];
	JMenuItem[] shapes = new JMenuItem[3];
	JMenuItem[] fills = new JMenuItem[2];
	Color cColor = Color.BLACK;
	String cShape = "Line", cFill = "draw";
	int startX, startY, endX, endY;
	
	public GrimProgram() {
		setTitle("���� �׸���");
		setLayout(new BorderLayout());
		menus[0] = new JMenu("����");
		menus[1] = new JMenu("����");
		menus[2] = new JMenu("ä���");
		for(int i = 0; i<3; i++) 
			mbar.add(menus[i]);
		
		colors[0] = new JMenuItem("����");
		colors[1] = new JMenuItem("�ʷ�");
		colors[2] = new JMenuItem("�Ķ�");
		colors[3] = new JMenuItem("�Ͼ�");
		colors[4] = new JMenuItem("����");
		for(int i = 0; i<5; i++) {
			colors[i].addActionListener(this);
			menus[0].add(colors[i]);
		}
		
		shapes[0] = new JMenuItem("��");
		shapes[1] = new JMenuItem("�簢��");
		shapes[2] = new JMenuItem("Ÿ��");
		for(int i = 0; i<3; i++) { 
			shapes[i].addActionListener(this);
			menus[1].add(shapes[i]);
		}
		
		fills[0] = new JMenuItem("�׵θ�");
		fills[1] = new JMenuItem("ä���");
		for(int i = 0; i<2; i++) { 
			fills[i].addActionListener(this);
			menus[2].add(fills[i]);
		}
			
		setJMenuBar(mbar);
		MyPanel pan = new MyPanel();
		pan.addMouseListener(this);
		pan.addMouseMotionListener(this);
		
		add("Center", pan);
		setSize(400, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(cColor);
			switch (cShape) {
			case "Line":
			{
				g.drawLine(startX, startY, endX, endY);
			}
				break;
			case "Rect":
			{
				if(cFill == "draw")
					g.drawRect(startX, startY, endX, endY);
				else
					g.fillRect(startX, startY, endX, endY);
			}
				break;
			case "Oval":
			{
				if(cFill == "draw")
					g.drawOval(startX, startY, endX, endY);
				else
					g.fillOval(startX, startY, endX, endY);
			}
				break;
			default:
				break;
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		startX = e.getX();
		startY = e.getY();
	}	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = ((JMenuItem) e.getSource()).getText();
		switch (text) {
		case "����":
			cColor = Color.RED;
			break;
		case "�ʷ�":
			cColor = Color.GREEN;
			break;
		case "�Ķ�":
			cColor = Color.BLUE;
			break;
		case "�Ͼ�":
			cColor = Color.WHITE;
			break;
		case "����":
			cColor = Color.BLACK;
			break;
		case "��":
			cShape = "Line";
			break;
		case "�簢��":
			cShape = "Rect";
			break;
		case "Ÿ��":
			cShape = "Oval";
			break;
		case "�׵θ�":
			cFill = "draw";
			break;
		case "ä���":
			cFill = "fill";
			break;
		default:
			break;
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		endX = e.getX();
		endY = e.getY();
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new GrimProgram();
	}
}
