package event.adapter;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

import event.move.FrameDimens;

public class MouseAdapterTest extends JFrame {
	JLabel lbl;
	
	public MouseAdapterTest() {
		lbl = new JLabel("마우스를 동작해보세요");
		add("South", lbl);
		addMouseListener(new MouseListener1());
		addMouseMotionListener(new MouseMotionListener1());
		
		// 화면 기본 설정
		setTitle("마우스이벤트(어댑터)");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	// MouseListener를 Adapter 클래스를 상속받아서 구현 : 내부(Inner) 클래스
	public class MouseListener1 extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			lbl.setText("마우스가 클릭되었습니다.");
		}
	}
	
	// MouseMotionListener를 Adapter 클래스를 상속받아서 구현 : 내부(Inner) 클래스
	public class MouseMotionListener1 extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			lbl.setText("마우스가 드래그되었습니다. : " + e.getX() + ", " + e.getY());
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterTest();
	}
}
