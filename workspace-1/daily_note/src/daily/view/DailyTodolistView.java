package daily.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import daily.vo.DailyTodoVO;

public class DailyTodolistView  extends JPanel{
	public static final int NUM_TODO = 14;	//To do list �ۼ� ����
	ArrayList<DailyTodoVO> todoList = new ArrayList<DailyTodoVO>();
	Date date;
	JLabel datelbl;
	JTextArea[] toDoList = new JTextArea[NUM_TODO]; 
	JButton[] checkBtns = new JButton[NUM_TODO];
	Color checkColor = new Color(212,254,210);
	JPanel panC = new JPanel(new GridLayout(NUM_TODO/2, 4));
	JPanel panS = new JPanel(new FlowLayout());
	JButton btnSave = new JButton("�ϱ� ����");
	
	public DailyTodolistView(Date date) {
		setLayout(new BorderLayout());
		this.date = date;
		datelbl = new JLabel((date.getYear()+1900)+"��"+(date.getMonth() + 1)+"��"+date.getDate()+"��");
		
		for(int i = 0; i < NUM_TODO; i++) {
			toDoList[i] = new JTextArea("");
			toDoList[i].setLineWrap(true);
			JScrollPane sp = new JScrollPane(toDoList[i]);
			panC.add(sp);
			checkBtns[i] = new JButton("V");
			checkBtns[i].addActionListener(btnL);
			panC.add(checkBtns[i]);
		}
		
		setBorder(BorderFactory.createRaisedBevelBorder()); //�׵θ�
		setBackground(new Color(255, 242, 245)); // ��� ����
		
		panS.add(btnSave);
	}
	
	ActionListener btnL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton check = (JButton)e.getSource();
			if(check.getBackground() == checkColor) {
				check.setBackground(btnSave.getBackground());
			} else {
				check.setBackground(checkColor);
			}
			
		}
	};
	
	
	
	public void initView() {
		putDailyResult();
		
		panC.setBorder(BorderFactory.createRaisedBevelBorder()); //�׵θ�
		panC.setOpaque(true); // ��� �����ϰ�
		panC.setBackground(new Color(255, 242, 245)); // ��� ����
		
		panS.setBorder(BorderFactory.createRaisedBevelBorder()); //�׵θ�
		panS.setOpaque(true); // ��� �����ϰ�
		panS.setBackground(new Color(255, 242, 245)); // ��� ����
		
		add("North", datelbl);
		add("Center", panC);
		add("South", panS);
	}
	
	public void putDailyResult() {
		for (int i = 0; i < todoList.size(); i++) {
			toDoList[i].setText(todoList.get(i).getTodo());
			if(todoList.get(i).getChecked() == 1) {
				checkBtns[i].setBackground(checkColor);
			}
		}
	}
	
	public ArrayList<DailyTodoVO> neededTodoData() {
		ArrayList<DailyTodoVO> todoList = new ArrayList<DailyTodoVO>();
		for(int i = 0; i < NUM_TODO; i++) {
			DailyTodoVO vo = new DailyTodoVO();
			vo.setIsbn(i+1);
			vo.setDate(date);
			vo.setTodo(toDoList[i].getText());
			if(checkBtns[i].getBackground() == checkColor) {
				vo.setChecked(1);
			} else {
				vo.setChecked(0);
			}
			todoList.add(vo);
		}
		
		return todoList;
	}
	
	public void initData() {
		for (int i = 0; i < NUM_TODO; i++) {
			toDoList[i].setText("");
			checkBtns[i].setBackground(btnSave.getBackground());
		}
	}
	
	public JButton getBtnSave() {
		return btnSave;
	}
	
	public void setDailyTodoList(ArrayList<DailyTodoVO> todoList) {
		this.todoList = todoList; 
	}
	
}
