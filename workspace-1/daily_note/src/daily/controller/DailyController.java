package daily.controller;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import daily.dao.JDBCConnector;
import daily.dao.DailyDAO;
import daily.view.DailyCalendarView;
import daily.view.DailyDefaultView;
import daily.view.DailyEditView;
import daily.view.DailyEmotionView;
import daily.view.DailyTodolistView;
import daily.vo.DailyDefaultVO;
import daily.vo.DailyEmotionVO;
import daily.vo.DailyTodoVO;

public class DailyController extends JFrame {
	Connection con;
	DailyDAO dao;
	
	Date now; // 클릭된 날짜
	DailyCalendarView calendarPan;
	DailyEditView editPan;
	DailyDefaultView defaultPan;
	DailyEmotionView emotionPan;
	DailyTodolistView todolistPan;

	// 각 창 VO들
	DailyDefaultVO defaultVO = null;
	ArrayList<DailyEmotionVO> emotionList = new ArrayList<DailyEmotionVO>();
	ArrayList<DailyTodoVO> todoList = new ArrayList<DailyTodoVO>();
	
	// 캘린더 뷰 버튼들
	JButton[] calendarBtns;  // the buttons on the face of the view
	JButton prevBtn, nextBtn, goBtn;
	
	// 작성 창 버튼
	JButton defaultSaveBtn, emotionSaveBtn, todoSaveBtn;
	
	public DailyController() {
		Toolkit theKit = getToolkit();				//윈도우 툴킷 구하기
		Dimension wndSize = theKit.getScreenSize();	//화켠 크기 구하기

		//위치는 화면 가운데, 크기는 화면 크기의 1/2 X 3/5
		setBounds(wndSize.width/4, wndSize.height/4,		//위치
						wndSize.width/2, (wndSize.height/5) * 3);	//크기
		
		con = JDBCConnector.getCon();
		dao = new DailyDAO();
		
		// 캘린더 뷰 (첫 화면)
		calendarPan = new DailyCalendarView();
		calendarBtns = calendarPan.getButton();
		prevBtn = calendarPan.getPrevBtn();
		nextBtn = calendarPan.getNextBtn();
		goBtn = calendarPan.getGoBtn();
		for(int i = 0; i < calendarBtns.length; i++) {
			calendarBtns[i].addActionListener(calendarBtnL);
		}
		prevBtn.addActionListener(BtnL);
		nextBtn.addActionListener(BtnL);
		goBtn.addActionListener(BtnL);
		
		add(calendarPan);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("KSW Diary");
		setVisible(true);
	}
	
	// 캘린더뷰 날짜 버튼 클릭 시 액션에 대한 리스너 구현
	ActionListener calendarBtnL = new ActionListener() {
		
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!((JButton)e.getSource()).getText().equals(""))   // it's not the blank space, is it?
			{ 
				//눌려진 버튼의 날짜 구하기
				now = calendarPan.getDate(Integer.parseInt(((JButton)e.getSource()).getText()));
				now.setYear(now.getYear()-1900);
				
				// 일반 일기
				defaultPan = new DailyDefaultView(now);
				defaultVO = dao.defaultSelect(now);
				defaultPan.setDailyDefaulyVO(defaultVO);
				defaultPan.initView();
				
				// 감정 일기
				emotionPan = new DailyEmotionView(now);
				emotionList = dao.emotionSelect(now);
				emotionPan.setDailyEmotionList(emotionList);
				emotionPan.initView();
				
				// To do list
				todolistPan = new DailyTodolistView(now);
				todoList = dao.todolistSelect(now);
				todolistPan.setDailyTodoList(todoList);
				todolistPan.initView();

				// 일기 버튼 초기화
				defaultSaveBtn = defaultPan.getBtnSave();
				emotionSaveBtn = emotionPan.getBtnSave();
				todoSaveBtn = todolistPan.getBtnSave();
				
				// Save 버튼 리스너
				defaultSaveBtn.addActionListener(SaveL);
				emotionSaveBtn.addActionListener(SaveL);
				todoSaveBtn.addActionListener(SaveL);
				
				//메모장 열기
				editPan = new DailyEditView(now, defaultPan, emotionPan, todolistPan);
			}
			
		}
	};
	
	ActionListener SaveL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == defaultSaveBtn) {
				defaultVO = dao.defaultSelect(now);
				if(defaultVO == null) {
					dao.defaultInsert(defaultPan.neededData());
					JOptionPane.showMessageDialog(editPan, "추가되었습니다", "일기 추가", JOptionPane.PLAIN_MESSAGE);
				} else {
					defaultVO = defaultPan.neededData();
					dao.defaultUpdate(defaultVO);
					JOptionPane.showMessageDialog(editPan, "저장되었습니다", "일기 저장", JOptionPane.PLAIN_MESSAGE);
				}
			} else if(btn == emotionSaveBtn) {
				emotionList = dao.emotionSelect(now);
				if(emotionList.size() == 0) {
					dao.emotionInsert(emotionPan.neededEmotionData());
					JOptionPane.showMessageDialog(editPan, "추가되었습니다", "감정 추가", JOptionPane.PLAIN_MESSAGE);
				} else {
					emotionList = emotionPan.neededEmotionData();
					dao.emotionUpdate(emotionList);
					JOptionPane.showMessageDialog(editPan, "저장되었습니다", "감정 저장", JOptionPane.PLAIN_MESSAGE);
				}
			} else if(btn == todoSaveBtn) {
				todoList = dao.todolistSelect(now);
				if(todoList.size() == 0) {
					dao.todolistInsert(todolistPan.neededTodoData());
					JOptionPane.showMessageDialog(editPan, "추가되었습니다", "Todo 추가", JOptionPane.PLAIN_MESSAGE);
				} else {
					todoList = todolistPan.neededTodoData();
					dao.todolistUpdate(todoList);
					JOptionPane.showMessageDialog(editPan, "저장되었습니다", "Todo 저장", JOptionPane.PLAIN_MESSAGE);
				}
			}
		}
	};
	
	// 캘린더 뷰 창 각 버튼에 대한 리스너 구현
	ActionListener BtnL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if((JButton)e.getSource() == prevBtn) {
				calendarPan.prevMonth();
				calendarPan.update();
			} else if((JButton)e.getSource() == nextBtn) {
				calendarPan.nextMonth();
				calendarPan.update();
			} else if((JButton)e.getSource() == goBtn) {
				try
				{
					int year = Integer.parseInt(calendarPan.getYearField().getText());
					int month = Integer.parseInt(calendarPan.getMonthChoice().getSelectedItem().trim());
					calendarPan.goMonth(year, month - 1);
					calendarPan.update();
				}
				catch (NumberFormatException ex)		//년도 입력필드에 숫자가 아닌 것이 입력될 경우
				{
					JOptionPane.showMessageDialog(null,		//에러 메시지를 출력
						"Error: Bad input year on the text field.");
				}
			}
		}
	};
	
	
	public static void main(String[] args) {
		new DailyController();
	}
}