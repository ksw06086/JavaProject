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
	
	Date now; // Ŭ���� ��¥
	DailyCalendarView calendarPan;
	DailyEditView editPan;
	DailyDefaultView defaultPan;
	DailyEmotionView emotionPan;
	DailyTodolistView todolistPan;

	// �� â VO��
	DailyDefaultVO defaultVO = null;
	ArrayList<DailyEmotionVO> emotionList = new ArrayList<DailyEmotionVO>();
	ArrayList<DailyTodoVO> todoList = new ArrayList<DailyTodoVO>();
	
	// Ķ���� �� ��ư��
	JButton[] calendarBtns;  // the buttons on the face of the view
	JButton prevBtn, nextBtn, goBtn;
	
	// �ۼ� â ��ư
	JButton defaultSaveBtn, emotionSaveBtn, todoSaveBtn;
	
	public DailyController() {
		Toolkit theKit = getToolkit();				//������ ��Ŷ ���ϱ�
		Dimension wndSize = theKit.getScreenSize();	//ȭ�� ũ�� ���ϱ�

		//��ġ�� ȭ�� ���, ũ��� ȭ�� ũ���� 1/2 X 3/5
		setBounds(wndSize.width/4, wndSize.height/4,		//��ġ
						wndSize.width/2, (wndSize.height/5) * 3);	//ũ��
		
		con = JDBCConnector.getCon();
		dao = new DailyDAO();
		
		// Ķ���� �� (ù ȭ��)
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
	
	// Ķ������ ��¥ ��ư Ŭ�� �� �׼ǿ� ���� ������ ����
	ActionListener calendarBtnL = new ActionListener() {
		
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!((JButton)e.getSource()).getText().equals(""))   // it's not the blank space, is it?
			{ 
				//������ ��ư�� ��¥ ���ϱ�
				now = calendarPan.getDate(Integer.parseInt(((JButton)e.getSource()).getText()));
				now.setYear(now.getYear()-1900);
				
				// �Ϲ� �ϱ�
				defaultPan = new DailyDefaultView(now);
				defaultVO = dao.defaultSelect(now);
				defaultPan.setDailyDefaulyVO(defaultVO);
				defaultPan.initView();
				
				// ���� �ϱ�
				emotionPan = new DailyEmotionView(now);
				emotionList = dao.emotionSelect(now);
				emotionPan.setDailyEmotionList(emotionList);
				emotionPan.initView();
				
				// To do list
				todolistPan = new DailyTodolistView(now);
				todoList = dao.todolistSelect(now);
				todolistPan.setDailyTodoList(todoList);
				todolistPan.initView();

				// �ϱ� ��ư �ʱ�ȭ
				defaultSaveBtn = defaultPan.getBtnSave();
				emotionSaveBtn = emotionPan.getBtnSave();
				todoSaveBtn = todolistPan.getBtnSave();
				
				// Save ��ư ������
				defaultSaveBtn.addActionListener(SaveL);
				emotionSaveBtn.addActionListener(SaveL);
				todoSaveBtn.addActionListener(SaveL);
				
				//�޸��� ����
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
					JOptionPane.showMessageDialog(editPan, "�߰��Ǿ����ϴ�", "�ϱ� �߰�", JOptionPane.PLAIN_MESSAGE);
				} else {
					defaultVO = defaultPan.neededData();
					dao.defaultUpdate(defaultVO);
					JOptionPane.showMessageDialog(editPan, "����Ǿ����ϴ�", "�ϱ� ����", JOptionPane.PLAIN_MESSAGE);
				}
			} else if(btn == emotionSaveBtn) {
				emotionList = dao.emotionSelect(now);
				if(emotionList.size() == 0) {
					dao.emotionInsert(emotionPan.neededEmotionData());
					JOptionPane.showMessageDialog(editPan, "�߰��Ǿ����ϴ�", "���� �߰�", JOptionPane.PLAIN_MESSAGE);
				} else {
					emotionList = emotionPan.neededEmotionData();
					dao.emotionUpdate(emotionList);
					JOptionPane.showMessageDialog(editPan, "����Ǿ����ϴ�", "���� ����", JOptionPane.PLAIN_MESSAGE);
				}
			} else if(btn == todoSaveBtn) {
				todoList = dao.todolistSelect(now);
				if(todoList.size() == 0) {
					dao.todolistInsert(todolistPan.neededTodoData());
					JOptionPane.showMessageDialog(editPan, "�߰��Ǿ����ϴ�", "Todo �߰�", JOptionPane.PLAIN_MESSAGE);
				} else {
					todoList = todolistPan.neededTodoData();
					dao.todolistUpdate(todoList);
					JOptionPane.showMessageDialog(editPan, "����Ǿ����ϴ�", "Todo ����", JOptionPane.PLAIN_MESSAGE);
				}
			}
		}
	};
	
	// Ķ���� �� â �� ��ư�� ���� ������ ����
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
				catch (NumberFormatException ex)		//�⵵ �Է��ʵ忡 ���ڰ� �ƴ� ���� �Էµ� ���
				{
					JOptionPane.showMessageDialog(null,		//���� �޽����� ���
						"Error: Bad input year on the text field.");
				}
			}
		}
	};
	
	
	public static void main(String[] args) {
		new DailyController();
	}
}
