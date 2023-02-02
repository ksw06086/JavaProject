package test.menu;

import java.awt.Color;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import event.move.FrameDimens;

// 이 예제를 공부해야한다.
public class MenuTest2 extends JFrame {
	JTextField t1 = new JTextField();
	JLabel lbl = new JLabel("",JLabel.CENTER);
	String[] itemStrs = {"총", "폭탄", "레이저", "전진", "후진"};
	JMenuItem[] menuItems;
	JButton[] btns;
	ImageIcon icon;
	
	public MenuTest2() {
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		lbl.setBackground(Color.white);
		lbl.setOpaque(true);
		
		// 상위메뉴(파일)
		JMenu mKill = new JMenu("공격");
		JMenu mMove = new JMenu("이동");
		bar.add(mKill);
		bar.add(mMove);
		
		// 상위 메뉴 파일 속 하위메뉴들
		menuItems = new JMenuItem[itemStrs.length];
		
		for (int i = 0; i < menuItems.length; i++) {
			menuItems[i] = new JMenuItem(itemStrs[i]);
			if(i < 3) {
				mKill.add(menuItems[i]);
			} else {
				mMove.add(menuItems[i]);
			}
			menuItems[i].addActionListener(actionListener);
		}
		
		makeToolbar();
		
		add("Center",lbl);
		add("South", t1);
		// 화면 기본 설정
		setTitle("메뉴 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	public void makeToolbar() {
		JToolBar toolBar = new JToolBar();
		btns = new JButton[itemStrs.length];
		for (int i = 0; i < itemStrs.length; i++) {
			btns[i] = new JButton(new ImageIcon("img/" + (i+1) + " - 복사본.jpg"));
			if(i == 3)
				toolBar.addSeparator();
			toolBar.add(btns[i]);
			btns[i].addActionListener(btnL);
		}
		getContentPane().add(toolBar, "North");
	}
	
	ActionListener btnL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btns[0]) {
				 icon = new ImageIcon("img/1.jpg");
				t1.setText("탕탕탕");
			} else if(e.getSource() == btns[1]) {
				 icon = new ImageIcon("img/2.jpg");
				t1.setText("펑!");
			} else if(e.getSource() == btns[2]) {
				 icon = new ImageIcon("img/3.jpg");
				t1.setText("찡~잉!");
			} else if(e.getSource() == btns[3]) {
				 icon = new ImageIcon("img/4.jpg");
				t1.setText("전진합니다");
			} else if(e.getSource() == btns[4]) {
				 icon = new ImageIcon("img/5.jpg");
				t1.setText("후진합니다");
			}
			lbl.setIcon(icon);
		}
	};
	
	ActionListener actionListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand() == itemStrs[0]) {
				 icon = new ImageIcon("img/1.jpg");
				t1.setText("탕탕탕");
			} else if(e.getActionCommand() == itemStrs[1]) {
				icon = new ImageIcon("img/2.jpg");
				t1.setText("펑!");
			} else if(e.getActionCommand() == itemStrs[2]) {
				icon = new ImageIcon("img/3.jpg");
				t1.setText("찡~잉");
			} else if(e.getActionCommand() == itemStrs[3]) {
				icon = new ImageIcon("img/4.jpg");
				t1.setText("전진합니다");
			} else if(e.getActionCommand() == itemStrs[4]) {
				icon = new ImageIcon("img/5.jpg");
				t1.setText("후진합니다");
			}
			lbl.setIcon(icon);
			
		}
	};
	
	public static void main(String[] args) {
		new MenuTest2();
	}
}
