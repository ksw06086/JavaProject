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
	public static final int NUM_CELL = 37;	//��¥ ��ư�� �� ����
	private CellFace[] cell; // ȭ�鿡 ���̴� Ķ����
	
	private GregorianCalendar today;	//���� �޷�
	private GregorianCalendar calendar;	//ȭ�鿡 ������ �޷�
	
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
			
			//����� �⵵�� �� �̵� ��ư �гΰ� ���� ���̺� �г�
			JPanel upperPanel = new JPanel();	
			upperPanel.setBorder(BorderFactory.createRaisedBevelBorder()); //�׵θ�
			upperPanel.setOpaque(true); // ��� �����ϰ�
			upperPanel.setBackground(new Color(255, 242, 245)); // ��� ����
			//����� �⵵�� �� �̵� ��ư �г�
			JPanel titlePanel = new JPanel(new FlowLayout());
			titlePanel.setBorder(BorderFactory.createLoweredBevelBorder()); //�׵θ�
			titlePanel.setOpaque(true); // ��� �����ϰ�
			titlePanel.setBackground(Color.white); // ��� �Ͼ��
			
			prevBtn = new JButton("<");
			setForeground(Color.black);	//���ڻ� ����
			setBorder(BorderFactory.createRaisedBevelBorder()); //��ư �׵θ� �߰�
			
			titlePanel.add(prevBtn); 
			titleLabel = new JLabel();
			titleLabel.setForeground(Color.black);
			titlePanel.add(titleLabel);
			
			nextBtn = new JButton(">");
			setForeground(Color.black);	//���ڻ� ����
			setBorder(BorderFactory.createRaisedBevelBorder()); //��ư �׵θ� �߰�
			titlePanel.add(nextBtn);
			
			upperPanel.add(titlePanel, BorderLayout.NORTH);


			
			//	//����� ���� �� �г�, ��� ��¥ ��ư �г�
			JPanel datePanel = new JPanel(new GridLayout(7, 7));
			datePanel.setBorder(BorderFactory.createRaisedBevelBorder()); //�׵θ�
			datePanel.setOpaque(true); // ��� �����ϰ�
			datePanel.setBackground(new Color(255, 242, 245)); // ��� ����
			JLabel label;
			datePanel.add(label = new JLabel("         �Ͽ���"));
			// label.setFont(new Font("a����������2", Font.PLAIN, 13));
			label.setForeground(Color.red);
			datePanel.add(label = new JLabel("         ������"));
			datePanel.add(label = new JLabel("         ȭ����"));
			datePanel.add(label = new JLabel("         ������"));
			datePanel.add(label = new JLabel("         �����"));
			datePanel.add(label = new JLabel("         �ݿ���"));
			datePanel.add(label = new JLabel("        �����")); 
			label.setForeground(Color.blue);
			button = new JButton[NUM_CELL];
			for( int i = 0; i < button.length; i++ )
			{
				button[i] = new JButton("");
				datePanel.add(button[i]);
			}

			
			//�Ʒ��� ���ϴ� �⵵�� �޷� ���� �̵� �г�
			JPanel bottomPanel = new JPanel(new FlowLayout());
			bottomPanel.setOpaque(true); // ��� �����ϰ�
			bottomPanel.setBackground(new Color(255, 242, 245)); // ��� ����
			JLabel nameLabel = new JLabel("������ �ϱ���     ");
			nameLabel.setFont(new Font("a����������3", Font.ITALIC, 14));
			bottomPanel.add(nameLabel);
			yearField = new JTextField("", 5);
			yearField.setBorder(BorderFactory.createLoweredBevelBorder());
			bottomPanel.add(yearField);
			bottomPanel.add(new JLabel(" / "));
			monthChoice = new Choice();
			for(int i = 1; i <= 12; i++) 
				monthChoice.addItem(String.valueOf(i)+" "); //���ϴ� �޷� ��������
			bottomPanel.add(monthChoice);
			bottomPanel.add(new JLabel("   "));
			
			goBtn = new JButton(" Go ");
			goBtn.setBorder(BorderFactory.createRaisedBevelBorder()); //��ư �׵θ� �߰�
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
			button[i].setText(cell[i].getValue());		//��¥��ư�� ���� ����
			button[i].setForeground(cell[i].getColor());//��¥��ư�� �� ����
			button[i].setBackground(new Color(240,240,240));
			if (button[i].getText().equals(""))
				button[i].setVisible(false);	//���� ��¥ ��ư �Ⱥ��̰�
			else
				button[i].setVisible(true);		//������ �ƴ� ��¥ ��ư ���̰�
	  	}
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);

		//����г��� �⵵�� �� ����
		titleLabel.setText("     " + year + "  /  " + (month + 1) + "     ");
		yearField.setText(year + "");	// �⵵ �ʵ� ����
		monthChoice.select(month);	// ���̵� ���̽� ����
	
	}
	
	public void goMonth(int year, int month) 
	{
		// �ش� ��,���� 1�Ϸ� ����
		calendar.set(year, month, 1);
		
		int day = 1;
		for ( int i = 0; i < NUM_CELL; i++ )
	    { 
			// 1�� �� ������ �ƴϰ�, �ش� ���� day���� ũ�� �ʾƾ� ��
			if (i >= calendar.get(calendar.DAY_OF_WEEK)-1 && day <= calendar.getActualMaximum(calendar.DAY_OF_MONTH))
			{
				if(	today.get(today.MONTH) == calendar.get(calendar.MONTH) &&
					today.get(today.YEAR) == calendar.get(calendar.YEAR) &&
					today.get(today.DATE) == day )
				{	cell[i] = new CellFace(String.valueOf(day), Color.cyan); } //����
				else if (i % 7 == 0)
				{	cell[i] = new CellFace(String.valueOf(day).toString(), Color.red); }//�Ͽ���
					else if (i % 7 == 6)
					{	cell[i] = new CellFace(String.valueOf(day).toString(), Color.blue); }//�����
						else 
						{	cell[i] = new CellFace(String.valueOf(day).toString(), Color.black); }//����
				day++;
	
			}
			else {
				cell[i] = new CellFace("", Color.black); //��¥�� ���� cell
			}
	    }
	}

    // ������ ��ư Ŭ���� Ķ���� �ʱ�ȭ
	public void prevMonth()
	{
		goMonth(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) - 1);
	}

    // �������� ��ư Ŭ���� Ķ���� �ʱ�ȭ
	public void nextMonth()
	{
		goMonth(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1);
	}
	
	// ��¥ ��������(2022-10-13)
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
