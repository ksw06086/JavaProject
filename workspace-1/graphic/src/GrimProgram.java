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
		setTitle("간단 그림판");
		setLayout(new BorderLayout());
		menus[0] = new JMenu("색상");
		menus[1] = new JMenu("도형");
		menus[2] = new JMenu("채우기");
		for(int i = 0; i<3; i++) 
			mbar.add(menus[i]);
		
		colors[0] = new JMenuItem("빨강");
		colors[1] = new JMenuItem("초록");
		colors[2] = new JMenuItem("파랑");
		colors[3] = new JMenuItem("하양");
		colors[4] = new JMenuItem("검정");
		for(int i = 0; i<5; i++) {
			colors[i].addActionListener(this);
			menus[0].add(colors[i]);
		}
		
		shapes[0] = new JMenuItem("선");
		shapes[1] = new JMenuItem("사각형");
		shapes[2] = new JMenuItem("타원");
		for(int i = 0; i<3; i++) { 
			shapes[i].addActionListener(this);
			menus[1].add(shapes[i]);
		}
		
		fills[0] = new JMenuItem("테두리");
		fills[1] = new JMenuItem("채우기");
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
		case "빨강":
			cColor = Color.RED;
			break;
		case "초록":
			cColor = Color.GREEN;
			break;
		case "파랑":
			cColor = Color.BLUE;
			break;
		case "하양":
			cColor = Color.WHITE;
			break;
		case "검정":
			cColor = Color.BLACK;
			break;
		case "선":
			cShape = "Line";
			break;
		case "사각형":
			cShape = "Rect";
			break;
		case "타원":
			cShape = "Oval";
			break;
		case "테두리":
			cFill = "draw";
			break;
		case "채우기":
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
