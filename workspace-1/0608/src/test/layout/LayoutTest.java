package test.layout;

import javax.swing.JButton;
import javax.swing.JFrame;

import test.center.LocationCenter;

public class LayoutTest extends JFrame {
	
	public LayoutTest() {
		int w = 300;
		int h = 300;
		setTitle("��ġ�����ڸ� ����(������� ����)");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LocationCenter lc = new LocationCenter(w, h);
		setBounds(lc.getX(), lc.getY(), w, h);
		setVisible(true);
		
		// borderLayout ����
		setLayout(null);
		
		// ��ư 4�� ��ü ���� �� ��ġ ����
		int[] x = {60,20,100,60};
		int[] y = {10,30,50,50};
		JButton[] btns = new JButton[4];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(i+1+"");
			
			// ��ư 4�� ��ġ�� ũ�� ���� �� �߰�
			btns[i].setBounds(x[i], y[i], 60, 30);
			add(btns[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		new LayoutTest();
	}
}
/// 1. ���蹮�� jframe�� ���õ� �ڵ�� �ۼ�
/// setTitle("��ġ�����ڸ� ����(������� ����)");
/// setDefaultCloseOperation(EXIT_ON_CLOSE);
/// setBounds(200, 250, w, h);
/// setVisible(true);
/// 
/// main�� new ������();
/// ---> ���⼭ 1~2���� ���� ����
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