package book.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import book.dao.BookDAO;
import book.dao.JDBCConnector;
import book.view.BookInsertView;
import book.view.BookSearchView;
import book.view.BookUpdateView;
import book.vo.BookVO;

public class BookController extends JFrame {
	static final int YES = 0;
	static final int NO = 1;
	
	Connection con;
	BookDAO dao;
	ArrayList<BookVO> bookList;
	BookSearchView searchPan;
	BookInsertView insertPan;
	BookUpdateView updatePan;
	JButton searchBtn;
	JButton insertBtn;
	JButton updateBtn;
	JTable table;
	
	public BookController() {
		JTabbedPane tab = new JTabbedPane();
		// DB Connector
		con = JDBCConnector.getCon();
		dao = new BookDAO();
		
		// ���� �˻�
		searchPan = new BookSearchView();
		bookList = dao.select(searchPan.getSearchWord(), 0);
		searchPan.setBookList(bookList);
		searchPan.initView();
		// ���� �߰�
		insertPan = new BookInsertView();
		bookList = dao.select( "", 0);
		insertPan.setBookList(bookList);
		insertPan.initView();
		// ���� ����
		updatePan = new BookUpdateView();
		bookList = dao.select( "", 0);
		updatePan.setBookList(bookList);
		updatePan.initView();
		
		// �����˻���ư
		searchBtn = searchPan.getBtnSearch();
		searchBtn.addActionListener(btnL);
		searchPan.putSearchResult();
		// �����߰���ư
		insertBtn = insertPan.getBtnInsert();
		insertBtn.addActionListener(btnL);
		// ����������ư
		updateBtn = updatePan.getBtnUpdate();
		updateBtn.addActionListener(btnUpdateL);
		table = updatePan.getTable();
		table.addMouseListener(tableL);
		
		// �Ӹ���
		tab.add("�����˻�", searchPan);
		tab.add("�����߰�", insertPan);
		tab.add("�������� �� ����", updatePan);
		
		add(tab);
		
		setTitle("���������ý���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 500, 600, 500);
		setVisible(true);
	}
	
	MouseAdapter tableL = new MouseAdapter() {
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if(e.getClickCount() == 1) {
				int row = table.getSelectedRow();
				updatePan.setTextField(row);
			}
			
			if(e.getClickCount() == 2) {
				// PLAIN_MESSAGE�� ������ �ȸ������, �� : 0 / �ƴϿ� : 1
				int result = JOptionPane.showConfirmDialog(BookController.this, "������ �����Ͻðڽ��ϱ�?", "��������", JOptionPane.WARNING_MESSAGE);
				if(result == YES) {
					BookVO vo = updatePan.neededUpdateData();
					dao.delete(vo);
					updateView();		
				}
			}
		};
	};
	
	ActionListener btnL = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(searchBtn == e.getSource()) {
				System.out.println(searchPan.getSearchWord() + searchPan.getComboSearch().getSelectedIndex());
				bookList.clear();
				bookList = dao.select(searchPan.getSearchWord(), searchPan.getComboSearch().getSelectedIndex());
				searchPan.setBookList(bookList);
				searchPan.putSearchResult();
			} else if(insertBtn == e.getSource()) {
				dao.insert(insertPan.neededInsertData());
				bookList.clear();
				updateView();
			}
		}
	};
	
	ActionListener btnUpdateL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			BookVO vo = updatePan.neededUpdateData();
			dao.update(vo);
			updateView();			
		}
	};
	
	public void updateView() {
		bookList = dao.select("", 0);
		insertPan.setBookList(bookList);
		insertPan.putSearchResult();
		insertPan.initData();
		updatePan.setBookList(bookList);
		updatePan.putSearchResult();
		searchPan.setBookList(bookList);
		searchPan.putSearchResult();
	}
	
	public static void main(String[] args) {
		new BookController();
	}
}
