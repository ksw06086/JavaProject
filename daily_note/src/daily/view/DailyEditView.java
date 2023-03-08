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
		
		count++;	//메모장 갯수 증가
		if (count > 10)
			count = 0;
		
		//메모장이 열릴때마다 위치를 변화시킨다
		setLocation(300 + count * 30, 200 + count * 30); //위치
		
		JTabbedPane tab = new JTabbedPane();
		
		// 머리판
		tab.add("일반일기", defaultPan);
		tab.add("감정일기", emotionPan);
		tab.add("To do list", todolistPan);
		
		cp.add(tab);
		
		tab.setBorder(BorderFactory.createRaisedBevelBorder()); //테두리
		tab.setBackground(new Color(255, 242, 245)); // 배경 핑쿠
		
		setTitle("Memo - " + (date.getYear()+1900) +"년"+(date.getMonth() + 1)+"월"+date.getDate()+"일");
		pack();
		setVisible(true);
	}
}
