package daily.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.sql.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import daily.vo.DailyDefaultVO;
import daily.vo.DailyEmotionVO;

public class DailyEmotionView  extends JPanel{
	public static final int NUM_EDIT = 4;	//감정일기 작성 갯수
	ArrayList<DailyEmotionVO> emotionList = new ArrayList<DailyEmotionVO>();
	Date date;
	JLabel datelbl;
	JTextField[] emotion = new JTextField[NUM_EDIT]; 
	JTextArea[] content = new JTextArea[NUM_EDIT];
	JPanel panC = new JPanel(new BorderLayout());
	JPanel emotionPan = new JPanel(new GridLayout(1,NUM_EDIT));
	JPanel contentPan = new JPanel(new GridLayout(1,NUM_EDIT));
	JPanel panS = new JPanel(new FlowLayout());
	JButton btnSave = new JButton("일기 저장");
	
	public DailyEmotionView(Date date) {
		setLayout(new BorderLayout());
		this.date = date;
		datelbl = new JLabel((date.getYear()+1900)+"년"+(date.getMonth() + 1)+"월"+date.getDate()+"일");
		
		for(int i = 0; i < NUM_EDIT; i++) {
			emotion[i] = new JTextField("");
			emotionPan.add(emotion[i]);
			content[i] = new JTextArea(15,20);
			content[i].setLineWrap(true); 
			JScrollPane sp = new JScrollPane(content[i]);
			contentPan.add(sp);
		}
		
		setBorder(BorderFactory.createRaisedBevelBorder()); //테두리
		setOpaque(true); // 배경 투명하게
		setBackground(new Color(255, 242, 245)); // 배경 핑쿠
		
		panC.add("North", emotionPan); panC.add("Center", contentPan);
		panS.add(btnSave);

		panC.setBorder(BorderFactory.createRaisedBevelBorder()); //테두리
		panC.setOpaque(true); // 배경 투명하게
		panC.setBackground(new Color(255, 242, 245)); // 배경 핑쿠
		
		panS.setBorder(BorderFactory.createRaisedBevelBorder()); //테두리
		panS.setOpaque(true); // 배경 투명하게
		panS.setBackground(new Color(255, 242, 245)); // 배경 핑쿠
	}
	
	public void initView() {
		putDailyResult();
		
		add("North", datelbl);
		add("Center", panC);
		add("South", panS);
	}
	
	public void putDailyResult() {
		for (int i = 0; i < emotionList.size(); i++) {
			emotion[i].setText(emotionList.get(i).getEmotion());
			content[i].setText(emotionList.get(i).getContent());
		}
	}
	
	@SuppressWarnings("deprecation")
	public ArrayList<DailyEmotionVO> neededEmotionData() {
		ArrayList<DailyEmotionVO> emotionList = new ArrayList<DailyEmotionVO>();
		for(int i = 0; i < NUM_EDIT; i++) {
			DailyEmotionVO vo = new DailyEmotionVO();
			vo.setIsbn(i+1);
			vo.setDate(date);
			vo.setEmotion(emotion[i].getText());
			vo.setContent(content[i].getText());
			emotionList.add(vo);
		}
		
		return emotionList;
	}
	
	public void initData() {
		for (int i = 0; i < NUM_EDIT; i++) {
			emotion[i].setText("");
			content[i].setText("");
		}
	}
	
	public JButton getBtnSave() {
		return btnSave;
	}
	
	public void setDailyEmotionList(ArrayList<DailyEmotionVO> emotionList) {
		this.emotionList = emotionList; 
	}
}