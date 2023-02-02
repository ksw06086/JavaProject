package test.list;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListTest extends JFrame {
	public JListTest() {
		// 화면 기본 설정
		setTitle("JList 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 150, 300, 300);
		setLayout(new FlowLayout());
		
		// 화면 출력 객체 생성
		JLabel lbl = new JLabel("과일 선택");
		String[] items = {"복숭아", "사과", "포도", "배", "오렌지"};
		JList<String> jl = new JList<String>(items);
		
		// 화면에 객체 추가 및 실행
		add(lbl);
		add(jl);
		setVisible(true);
		
		// North에 Jpanel을 추가해서 사용 할 것
	}
	
	public static void main(String[] args) {
		new JListTest();
	}
}
