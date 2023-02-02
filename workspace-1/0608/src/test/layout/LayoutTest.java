package test.layout;

import javax.swing.JButton;
import javax.swing.JFrame;

import test.center.LocationCenter;

public class LayoutTest extends JFrame {
	
	public LayoutTest() {
		int w = 300;
		int h = 300;
		setTitle("배치관리자를 제거(사용하지 않음)");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LocationCenter lc = new LocationCenter(w, h);
		setBounds(lc.getX(), lc.getY(), w, h);
		setVisible(true);
		
		// borderLayout 제거
		setLayout(null);
		
		// 버튼 4개 객체 생성 및 위치 지정
		int[] x = {60,20,100,60};
		int[] y = {10,30,50,50};
		JButton[] btns = new JButton[4];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(i+1+"");
			
			// 버튼 4개 위치와 크기 설정 및 추가
			btns[i].setBounds(x[i], y[i], 60, 30);
			add(btns[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		new LayoutTest();
	}
}
/// 1. 시험문제 jframe과 관련된 코드들 작성
/// setTitle("배치관리자를 제거(사용하지 않음)");
/// setDefaultCloseOperation(EXIT_ON_CLOSE);
/// setBounds(200, 250, w, h);
/// setVisible(true);
/// 
/// main에 new 생성자();
/// ---> 여기서 1~2문제 나올 에정
//  
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 