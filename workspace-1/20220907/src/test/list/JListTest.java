package test.list;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListTest extends JFrame {
	public JListTest() {
		// ȭ�� �⺻ ����
		setTitle("JList ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 150, 300, 300);
		setLayout(new FlowLayout());
		
		// ȭ�� ��� ��ü ����
		JLabel lbl = new JLabel("���� ����");
		String[] items = {"������", "���", "����", "��", "������"};
		JList<String> jl = new JList<String>(items);
		
		// ȭ�鿡 ��ü �߰� �� ����
		add(lbl);
		add(jl);
		setVisible(true);
		
		// North�� Jpanel�� �߰��ؼ� ��� �� ��
	}
	
	public static void main(String[] args) {
		new JListTest();
	}
}
