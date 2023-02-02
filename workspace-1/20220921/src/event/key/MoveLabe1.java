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
	JLabel lbl;																							// Label 전역변수
	ImageIcon icon;																				// 이미지 변수
	public static final int BOY = 1;													// 남자 캐릭터
	public static final int GIRL1 = 2;													// 여자1 캐릭터
	public static final int GIRL2 = 3;													// 여자2 캐릭터
	int imgnum = BOY;																			// 이미지 변경 변수: 남자캐릭터로 초기화
	public static final int W = 60;														// 캐릭터 크기(가로)
	public static final int H = 70;														// 캐릭터 크기(세로)
	int x = FrameDimens.FW/2-W, y = FrameDimens.FH/2-H;			// 개릭터 처음 위치 변수
	
	public MoveLabe1() {
		setLayout(null);																								// 정해진 레이아웃이 없음
		
		Container contentPane = getContentPane();													// 화면의 색깔을 바꿀 때 관련 API가 들어있는 클래스 생성
		contentPane.setBackground(Color.WHITE);													// 화면 색깔 변경
		
		icon = new ImageIcon("img/1left.png");															// 캐릭터 이미지 초기화
		lbl = new JLabel(icon);																					// Label의 내용을 이미지로 넣음
		lbl.setBounds(x, y, W, H);																				// 처음 위치 초기화
		
		add(lbl);																											// Label 추가
		addKeyListener(this);																						// 적용할 Key 이벤트 함수 선정	
		
		// 화면 기본 설정
		setTitle("moveLabe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
		requestFocus();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {															// 키 누름 이벤트 함수
		switch (e.getKeyCode()) 																			// 키 Type에 따라 조건에 맞는 처리를 하는 Switch 조건문
		{	
			case KeyEvent.VK_UP:																			// 위쪽 방향키를 눌렀을 때: 위로 이동
				icon = new ImageIcon("img/"+ imgnum +"up.png");
				x = lbl.getX();
				if(y >= 0) {
					y = lbl.getY() - 10;
				}
				break;
			case KeyEvent.VK_DOWN:																		// 아래쪽 방향키를 눌렀을 때: 아래로 이동
				icon = new ImageIcon("img/"+ imgnum +"down.png");
				x = lbl.getX();
				if(y < FrameDimens.FH - 100) {
					y = lbl.getY() + 10;
				}
				break;
			case KeyEvent.VK_RIGHT: 																	// 오른쪽 방향키를 눌렀을 때: 오른쪽으로 이동
				icon = new ImageIcon("img/" + imgnum + "right.png");
				if(x < FrameDimens.FW - 60) {
					x = lbl.getX() + 10;
				}
				y = lbl.getY();
				break;
			case KeyEvent.VK_LEFT: 																		// 왼쪽 방향키를 눌렀을 때: 왼쪽으로 이동
				icon = new ImageIcon("img/" + imgnum + "left.png");
				if(x >= 0) {
					x = lbl.getX() - 10;
				}
				y = lbl.getY();
				break;
			case KeyEvent.VK_F1: 																			// F1 키를 눌렀을 때: 남자 캐릭터로 변경
				imgnum = BOY;
				icon = new ImageIcon("img/" + imgnum + "down.png");
				break;
			case KeyEvent.VK_F2: 																			// F2 키를 눌렀을 때: 여자1 캐릭터로 변경
				imgnum = GIRL1;
				icon = new ImageIcon("img/" + imgnum + "down.png");
				break;
			case KeyEvent.VK_F3: 																			// F3 키를 눌렀을 때: 여자2 캐릭터로 변경
				imgnum = GIRL2;
				icon = new ImageIcon("img/" + imgnum + "down.png");
				break;
		}
		lbl.setIcon(icon);																							// 이미지 초기화
		lbl.setLocation(x,y);																					// 위치 초기화
	}
	
	// 안씀
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	// 안씀
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new MoveLabe1();																						// JFrame 윈도우 창 생성
	}

}
