package daily.view;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;
import java.sql.Date;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import daily.vo.CellFace;

public class DailyCalendarView extends JPanel {
	public static final int NUM_CELL = 37;	//날짜 버튼의 총 갯수
	private CellFace[] cell; // 화면에 보이는 캘린더
	
	private GregorianCalendar today;	//오늘 달력
	private GregorianCalendar calendar;	//화면에 보여줄 달력
	
	private JLabel titleLabel;
	private JTextField yearField;
	private Choice monthChoice;

	private JButton[] button;  // the buttons on the face of the view
	private JButton prevBtn, nextBtn, goBtn;
	
	public DailyCalendarView() {

			today = new GregorianCalendar();
			calendar = new GregorianCalendar();
			cell = new CellFace[NUM_CELL];
			goMonth(today.get(today.YEAR), today.get(today.MONTH));
			
			//상단의 년도와 달 이동 버튼 패널과 요일 레이블 패널
			JPanel upperPanel = new JPanel();	
			upperPanel.setBorder(BorderFactory.createRaisedBevelBorder()); //테두리
			upperPanel.setOpaque(true); // 배경 투명하게
			upperPanel.setBackground(new Color(255, 242, 245)); // 배경 핑쿠
			//상단의 년도와 달 이동 버튼 패널
			JPanel titlePanel = new JPanel(new FlowLayout());
			titlePanel.setBorder(BorderFactory.createLoweredBevelBorder()); //테두리
			titlePanel.setOpaque(true); // 배경 투명하게
			titlePanel.setBackground(Color.white); // 배경 하얀색
			
			prevBtn = new JButton("<");
			setForeground(Color.black);	//글자색 지정
			setBorder(BorderFactory.createRaisedBevelBorder()); //버튼 테두리 추가
			
			titlePanel.add(prevBtn); 
			titleLabel = new JLabel();
			titleLabel.setForeground(Color.black);
			titlePanel.add(titleLabel);
			
			nextBtn = new JButton(">");
			setForeground(Color.black);	//글자색 지정
			setBorder(BorderFactory.createRaisedBevelBorder()); //버튼 테두리 추가
			titlePanel.add(nextBtn);
			
			upperPanel.add(titlePanel, BorderLayout.NORTH);


			
			//	//상단의 요일 라벨 패널, 가운데 날짜 버튼 패널
			JPanel datePanel = new JPanel(new GridLayout(7, 7));
			datePanel.setBorder(BorderFactory.createRaisedBevelBorder()); //테두리
			datePanel.setOpaque(true); // 배경 투명하게
			datePanel.setBackground(new Color(255, 242, 245)); // 배경 핑쿠
			JLabel label;
			datePanel.add(label = new JLabel("         일요일"));
			// label.setFont(new Font("a옛날사진관2", Font.PLAIN, 13));
			label.setForeground(Color.red);
			datePanel.add(label = new JLabel("         월요일"));
			datePanel.add(label = new JLabel("         화요일"));
			datePanel.add(label = new JLabel("         수요일"));
			datePanel.add(label = new JLabel("         목요일"));
			datePanel.add(label = new JLabel("         금요일"));
			datePanel.add(label = new JLabel("        토요일")); 
			label.setForeground(Color.blue);
			button = new JButton[NUM_CELL];
			for( int i = 0; i < button.length; i++ )
			{
				button[i] = new JButton("");
				datePanel.add(button[i]);
			}

			
			//아래쪽 원하는 년도와 달로 직접 이동 패널
			JPanel bottomPanel = new JPanel(new FlowLayout());
			bottomPanel.setOpaque(true); // 배경 투명하게
			bottomPanel.setBackground(new Color(255, 242, 245)); // 배경 핑쿠
			JLabel nameLabel = new JLabel("선우의 일기장     ");
			nameLabel.setFont(new Font("a옛날사진관3", Font.ITALIC, 14));
			bottomPanel.add(nameLabel);
			yearField = new JTextField("", 5);
			yearField.setBorder(BorderFactory.createLoweredBevelBorder());
			bottomPanel.add(yearField);
			bottomPanel.add(new JLabel(" / "));
			monthChoice = new Choice();
			for(int i = 1; i <= 12; i++) 
				monthChoice.addItem(String.valueOf(i)+" "); //원하는 달로 직접가기
			bottomPanel.add(monthChoice);
			bottomPanel.add(new JLabel("   "));
			
			goBtn = new JButton(" Go ");
			goBtn.setBorder(BorderFactory.createRaisedBevelBorder()); //버튼 테두리 추가
			bottomPanel.add(goBtn);

			//Add top, center and bottom panel to content pane
			setLayout(new BorderLayout());
			add(upperPanel, BorderLayout.NORTH);
			add(datePanel , BorderLayout.CENTER);
			add(bottomPanel , BorderLayout.SOUTH);

			update();  // initialize the pieces with their numbers
	}
	
	public void update()
	{
	  	for(int i = 0; i < button.length; i++)
	  	{ 
			button[i].setText(cell[i].getValue());		//날짜버튼의 내용 지정
			button[i].setForeground(cell[i].getColor());//날짜버튼의 색 지정
			button[i].setBackground(new Color(240,240,240));
			if (button[i].getText().equals(""))
				button[i].setVisible(false);	//공백 날짜 버튼 안보이게
			else
				button[i].setVisible(true);		//공백이 아닌 날짜 버튼 보이게
	  	}
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);

		//상단패널의 년도와 달 갱신
		titleLabel.setText("     " + year + "  /  " + (month + 1) + "     ");
		yearField.setText(year + "");	// 년도 필드 갱신
		monthChoice.select(month);	// 달이동 쵸이스 갱신
	
	}
	
	public void goMonth(int year, int month) 
	{
		// 해당 년,월의 1일로 세팅
		calendar.set(year, month, 1);
		
		int day = 1;
		for ( int i = 0; i < NUM_CELL; i++ )
	    { 
			// 1일 전 요일이 아니고, 해당 월의 day보다 크지 않아야 함
			if (i >= calendar.get(calendar.DAY_OF_WEEK)-1 && day <= calendar.getActualMaximum(calendar.DAY_OF_MONTH))
			{
				if(	today.get(today.MONTH) == calendar.get(calendar.MONTH) &&
					today.get(today.YEAR) == calendar.get(calendar.YEAR) &&
					today.get(today.DATE) == day )
				{	cell[i] = new CellFace(String.valueOf(day), Color.cyan); } //오늘
				else if (i % 7 == 0)
				{	cell[i] = new CellFace(String.valueOf(day).toString(), Color.red); }//일요일
					else if (i % 7 == 6)
					{	cell[i] = new CellFace(String.valueOf(day).toString(), Color.blue); }//토요일
						else 
						{	cell[i] = new CellFace(String.valueOf(day).toString(), Color.black); }//평일
				day++;
	
			}
			else {
				cell[i] = new CellFace("", Color.black); //날짜가 없는 cell
			}
	    }
	}

    // 전으로 버튼 클릭시 캘린더 초기화
	public void prevMonth()
	{
		goMonth(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) - 1);
	}

    // 다음으로 버튼 클릭시 캘린더 초기화
	public void nextMonth()
	{
		goMonth(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1);
	}
	
	// 날짜 가져오기(2022-10-13)
	public Date getDate(int date)
	{
		Date click_date = new Date(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), date); 
		return click_date;
	}

	public JButton[] getButton() {
		return button;
	}

	public JButton getPrevBtn() {
		return prevBtn;
	}

	public JButton getNextBtn() {
		return nextBtn;
	}

	public JButton getGoBtn() {
		return goBtn;
	}

	public JTextField getYearField() {
		return yearField;
	}

	public Choice getMonthChoice() {
		return monthChoice;
	}
	
	
		
}
