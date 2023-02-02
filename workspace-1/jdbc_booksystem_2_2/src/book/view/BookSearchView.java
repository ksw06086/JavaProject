package book.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import book.controller.BookController;
import book.dao.BookDAO;
import book.vo.BookVO;

public class BookSearchView extends JPanel{
	JLabel lbl;
	JTextField tf;
	JButton btnSearch;
	String[] comboStr = {"도서명", "출판사", "저자명"};
	JComboBox<String> comboSearch;
	ArrayList<BookVO> bookList;
	JPanel panN;
	JTable table;
	DefaultTableModel model;
	String searchWord = "";
	
	public BookSearchView() {
		setLayout(new BorderLayout(10, 10));
		lbl = new JLabel("도서: ");
		tf = new JTextField(20);
		btnSearch = new JButton("도서검색");
		comboSearch = new  JComboBox<String>(comboStr);
		panN = new JPanel();
		panN.add(comboSearch); panN.add(lbl); panN.add(tf); panN.add(btnSearch);
		
	}
	
	public void initView() {
		String[] header = {"도서번호", "도서명", "저자명", "출판사", "가격", "분류명"};
		model = new DefaultTableModel(header, bookList.size()) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// 수정할 수 없게 만들어주기 위해서 false를 함 true를 하면 수정 가능
				return false;
			}
		};
		putSearchResult();
		table = new JTable(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(50);
		JScrollPane scroll = new JScrollPane(table);
		add("North", panN); add("Center", scroll);
	}
	
	public void putSearchResult() {
		model.setRowCount(bookList.size());
		for (int i = 0; i < bookList.size(); i++) {
			model.setValueAt(bookList.get(i).getIsbn(), i, 0);
			model.setValueAt(bookList.get(i).getName(), i, 1);
			model.setValueAt(bookList.get(i).getAuthor(), i, 2);
			model.setValueAt(bookList.get(i).getPublish(), i, 3);
			model.setValueAt(bookList.get(i).getPrice(), i, 4);
			model.setValueAt(bookList.get(i).getCategory(), i, 5);
		}
	}
	
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	public JButton getBtnSearch() {
		return btnSearch;
	}
	
	public JComboBox<String> getComboSearch() {
		return comboSearch;
	}
	
	public String getSearchWord() {
		searchWord = tf.getText();
		return searchWord;
	}
	
}
