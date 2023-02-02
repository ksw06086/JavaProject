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
	String[] itemStrs = {"열기", "저장하기", "닫기", "복사하기", "붙여넣기", "도움말","저장하고 종료하기", "저장 안하고 종료하기"};
	JMenuItem[] menuItems;
	
	public MenuTest1() {
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		
		// 상위메뉴(파일)
		JMenu mFile = new JMenu("파일");
		JMenu mEdit = new JMenu("편집");
		JMenu mHelp = new JMenu("도움말");
		JMenu fExit = new JMenu("종료하기");
		bar.add(mFile);
		bar.add(mEdit);
		bar.add(mHelp);
		
		// 상위 메뉴 파일 속 하위메뉴들
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
		// 화면 기본 설정
		setTitle("간단 계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	ActionListener actionListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			area.setText(e.getActionCommand() + "를(을) 선택하셨습니다.");
		}
	};
	
	public static void main(String[] args) {
		new MenuTest1();
	}
}
