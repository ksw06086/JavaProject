package test.menu;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import event.move.FrameDimens;

public class MenuTest1 extends JFrame {
	JTextArea area = new JTextArea();
	String[] itemStrs = {"����", "�����ϱ�", "�ݱ�", "�����ϱ�", "�ٿ��ֱ�", "����","�����ϰ� �����ϱ�", "���� ���ϰ� �����ϱ�"};
	JMenuItem[] menuItems;
	
	public MenuTest1() {
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		
		// �����޴�(����)
		JMenu mFile = new JMenu("����");
		JMenu mEdit = new JMenu("����");
		JMenu mHelp = new JMenu("����");
		JMenu fExit = new JMenu("�����ϱ�");
		bar.add(mFile);
		bar.add(mEdit);
		bar.add(mHelp);
		
		// ���� �޴� ���� �� �����޴���
		menuItems = new JMenuItem[itemStrs.length];
		
		for (int i = 0; i < menuItems.length; i++) {
			menuItems[i] = new JMenuItem(itemStrs[i]);
			if(i < 3) {
				mFile.add(menuItems[i]);
			} else if(i<5) {
				mEdit.add(menuItems[i]);
			} else if(i<6){
				mHelp.add(menuItems[i]);
			} else {
				fExit.add(menuItems[i]);
			}
			menuItems[i].addActionListener(actionListener);
		}
		mFile.add(fExit);
		
		add("Center", area);
		// ȭ�� �⺻ ����
		setTitle("���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	ActionListener actionListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			area.setText(e.getActionCommand() + "��(��) �����ϼ̽��ϴ�.");
		}
	};
	
	public static void main(String[] args) {
		new MenuTest1();
	}
}
