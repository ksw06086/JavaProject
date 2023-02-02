package event.action;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import event.move.FrameDimens;

public class ActionTest1 extends JFrame{
	JLabel lbl;
	JButton btn;
	Font fontOrigin;
	
	public ActionTest1() {
		btn = new JButton("변경");
		JButton btn2 = new JButton("원래대로");
		lbl = new JLabel("버튼을 클릭해보세요.");														// 위쪽 정렬
		fontOrigin = lbl.getFont();
		JPanel pan = new JPanel();
		pan.add(btn);
		pan.add(btn2);
		add("North", pan);
		add("Center", lbl);
		
		btn.addActionListener(btnListener);
		btn2.addActionListener(btnListener);
		
		// 화면 기본 설정
		setTitle("ActionEvent 사용");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FrameDimens.FX, FrameDimens.FY, FrameDimens.FW, FrameDimens.FH);
		setVisible(true);
	}
	
	ActionListener btnListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				lbl.setText("버튼이 클릭되었습니다.");
				Font font = new Font("맑은 고딕", Font.BOLD+Font.ITALIC, 35);
				lbl.setFont(font);
				lbl.setForeground(new Color(255,201,194));
				lbl.setBackground(Color.white);
				lbl.setOpaque(true);
			} else {
				lbl.setFont(fontOrigin);
				lbl.setOpaque(false);
				lbl.setForeground(Color.black);
			}
		}
	};	
	
	public static void main(String[] args) {
		new ActionTest1();
	}


}
