package test.itemevent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import event.move.FrameDimens;

public class ItemTest1 extends JFrame{
	JTextArea area;
	JCheckBox[] checks;
	
	public ItemTest1() {
		Font font = new Font("a옛날사진관3", Font.BOLD, 15);
		JLabel lbl = new JLabel("좋아하는 과일을 선택하세요.");
		JPanel p1 = new JPanel();
		area = new JTextArea();
		area.setFont(font);
		area.setEditable(false);
		area.setBackground(Color.white);
		
		String[] chkStrs = {"포도", "사과", "배", "천도복숭아"};
		checks = new JCheckBox[chkStrs.length];
		for (int i = 0; i < chkStrs.length; i++) {
			checks[i] = new JCheckBox(chkStrs[i]);
			checks[i].addItemListener(chkL);
			p1.add(checks[i]);
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
	
	ItemListener chkL = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			area.setText("");
			
			// enhanced For(for~each): 배열이나 ArrayList와 같은 Collection 저장된 객체를 순서대로 가져와서 반복
			for (JCheckBox check : checks) {
				if(check.isSelected()) {
					area.append("<<" + check.getText() + ">>");
				}
			}
		}
	};
	
	public static void main(String[] args) {
		new ItemTest1();
	}
}
