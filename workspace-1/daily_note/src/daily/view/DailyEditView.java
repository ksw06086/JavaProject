package daily.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class DailyEditView extends JFrame{
	private static int count = 0;	//count number of text editor
	
	public DailyEditView(Date date, DailyDefaultView defaultPan, DailyEmotionView emotionPan, DailyTodolistView todolistPan) {
		Container cp = getContentPane();
	    cp.setLayout(new BorderLayout());
		
		count++;	//�޸��� ���� ����
		if (count > 10)
			count = 0;
		
		//�޸����� ���������� ��ġ�� ��ȭ��Ų��
		setLocation(300 + count * 30, 200 + count * 30); //��ġ
		
		JTabbedPane tab = new JTabbedPane();
		
		// �Ӹ���
		tab.add("�Ϲ��ϱ�", defaultPan);
		tab.add("�����ϱ�", emotionPan);
		tab.add("To do list", todolistPan);
		
		cp.add(tab);
		
		tab.setBorder(BorderFactory.createRaisedBevelBorder()); //�׵θ�
		tab.setBackground(new Color(255, 242, 245)); // ��� ����
		
		setTitle("Memo - " + (date.getYear()+1900) +"��"+(date.getMonth() + 1)+"��"+date.getDate()+"��");
		pack();
		setVisible(true);
	}
}
