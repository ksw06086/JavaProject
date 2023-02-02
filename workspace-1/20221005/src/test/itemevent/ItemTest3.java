package test.itemevent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import event.move.FrameDimens;

public class ItemTest3 extends JFrame{
	JTextArea area;
	JRadioButton[] radios;
	
	public ItemTest3() {
		Font font = new Font("a옛날사진관2", Font.BOLD, 15);
		JLabel lbl = new JLabel("좋아하는 디저트를 선택하세요.");
		JPanel p1 = new JPanel();
		area = new JTextArea();
		area.setFont(font);
		area.setEditable(false);
		area.setBackground(Color.white);
		
		String[] radioStrs = {"커피", "케이크", "푸딩", "과일"};
		// 바뀐 부분: 라디오버튼 그룹화
		ButtonGroup bg = new ButtonGroup();
		radios = new JRadioButton[radioStrs.length];
		for (int i = 0; i < radioStrs.length; i++) {
			radios[i] = new JRadioButton(radioStrs[i]);
			radios[i].addItemListener(radioL);
			// 바뀐 부분 
			bg.add(radios[i]);
			p1.add(radios[i]);
		}
		
		add("North", lbl);
		add("Center", area);
		add("South", p1);
		
		// 화면 기본 설정
		setTitle("isSelected() 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	ItemListener radioL = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			area.setText("");
			
			// enhanced For(for~each): 배열이나 ArrayList와 같은 Collection 저장된 객체를 순서대로 가져와서 반복
			for (JRadioButton radio : radios) {
				if(radio.isSelected()) {
					area.append(radio.getText() + "을(를) 선택하였습니다.");
				}
			}
		}
	};
	
	public static void main(String[] args) {
		new ItemTest3();
	}
}
