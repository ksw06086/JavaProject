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
		lbl = new JLabel("���콺�� �����غ�����");
		add("South", lbl);
		addMouseListener(new MouseListener1());
		addMouseMotionListener(new MouseMotionListener1());
		
		// ȭ�� �⺻ ����
		setTitle("���콺�̺�Ʈ(�����)");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	// MouseListener�� Adapter Ŭ������ ��ӹ޾Ƽ� ���� : ����(Inner) Ŭ����
	public class MouseListener1 extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			lbl.setText("���콺�� Ŭ���Ǿ����ϴ�.");
		}
	}
	
	// MouseMotionListener�� Adapter Ŭ������ ��ӹ޾Ƽ� ���� : ����(Inner) Ŭ����
	public class MouseMotionListener1 extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			lbl.setText("���콺�� �巡�׵Ǿ����ϴ�. : " + e.getX() + ", " + e.getY());
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterTest();
	}
}
