package event.key;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabe1 extends JFrame implements KeyListener{
	JLabel lbl;																							// Label ��������
	ImageIcon icon;																				// �̹��� ����
	public static final int BOY = 1;													// ���� ĳ����
	public static final int GIRL1 = 2;													// ����1 ĳ����
	public static final int GIRL2 = 3;													// ����2 ĳ����
	int imgnum = BOY;																			// �̹��� ���� ����: ����ĳ���ͷ� �ʱ�ȭ
	public static final int W = 60;														// ĳ���� ũ��(����)
	public static final int H = 70;														// ĳ���� ũ��(����)
	int x = FrameDimens.FW/2-W, y = FrameDimens.FH/2-H;			// ������ ó�� ��ġ ����
	
	public MoveLabe1() {
		setLayout(null);																								// ������ ���̾ƿ��� ����
		
		Container contentPane = getContentPane();													// ȭ���� ������ �ٲ� �� ���� API�� ����ִ� Ŭ���� ����
		contentPane.setBackground(Color.WHITE);													// ȭ�� ���� ����
		
		icon = new ImageIcon("img/1left.png");															// ĳ���� �̹��� �ʱ�ȭ
		lbl = new JLabel(icon);																					// Label�� ������ �̹����� ����
		lbl.setBounds(x, y, W, H);																				// ó�� ��ġ �ʱ�ȭ
		
		add(lbl);																											// Label �߰�
		addKeyListener(this);																						// ������ Key �̺�Ʈ �Լ� ����	
		
		// ȭ�� �⺻ ����
		setTitle("moveLabe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
		requestFocus();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {															// Ű ���� �̺�Ʈ �Լ�
		switch (e.getKeyCode()) 																			// Ű Type�� ���� ���ǿ� �´� ó���� �ϴ� Switch ���ǹ�
		{	
			case KeyEvent.VK_UP:																			// ���� ����Ű�� ������ ��: ���� �̵�
				icon = new ImageIcon("img/"+ imgnum +"up.png");
				x = lbl.getX();
				if(y >= 0) {
					y = lbl.getY() - 10;
				}
				break;
			case KeyEvent.VK_DOWN:																		// �Ʒ��� ����Ű�� ������ ��: �Ʒ��� �̵�
				icon = new ImageIcon("img/"+ imgnum +"down.png");
				x = lbl.getX();
				if(y < FrameDimens.FH - 100) {
					y = lbl.getY() + 10;
				}
				break;
			case KeyEvent.VK_RIGHT: 																	// ������ ����Ű�� ������ ��: ���������� �̵�
				icon = new ImageIcon("img/" + imgnum + "right.png");
				if(x < FrameDimens.FW - 60) {
					x = lbl.getX() + 10;
				}
				y = lbl.getY();
				break;
			case KeyEvent.VK_LEFT: 																		// ���� ����Ű�� ������ ��: �������� �̵�
				icon = new ImageIcon("img/" + imgnum + "left.png");
				if(x >= 0) {
					x = lbl.getX() - 10;
				}
				y = lbl.getY();
				break;
			case KeyEvent.VK_F1: 																			// F1 Ű�� ������ ��: ���� ĳ���ͷ� ����
				imgnum = BOY;
				icon = new ImageIcon("img/" + imgnum + "down.png");
				break;
			case KeyEvent.VK_F2: 																			// F2 Ű�� ������ ��: ����1 ĳ���ͷ� ����
				imgnum = GIRL1;
				icon = new ImageIcon("img/" + imgnum + "down.png");
				break;
			case KeyEvent.VK_F3: 																			// F3 Ű�� ������ ��: ����2 ĳ���ͷ� ����
				imgnum = GIRL2;
				icon = new ImageIcon("img/" + imgnum + "down.png");
				break;
		}
		lbl.setIcon(icon);																							// �̹��� �ʱ�ȭ
		lbl.setLocation(x,y);																					// ��ġ �ʱ�ȭ
	}
	
	// �Ⱦ�
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	// �Ⱦ�
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new MoveLabe1();																						// JFrame ������ â ����
	}

}
