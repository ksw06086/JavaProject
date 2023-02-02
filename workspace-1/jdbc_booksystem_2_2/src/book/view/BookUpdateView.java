package book.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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

public class BookUpdateView extends JPanel{
	ArrayList<BookVO> bookList;
	JTable table;
	DefaultTableModel model;
	String searchWord = "";
	JPanel panS = new JPanel(new GridLayout(4,4));
	String[] header = {"도서번호", "도서명", "저자명", "출판사", "가격", "분류명"};
	String[] comStr = {"IT도서", "개발도서", "웹툰", "에세이", "경제"};
	JLabel[] lbls = new JLabel[header.length];
	JTextField[] tf = new JTextField[lbls.length-1];
	JComboBox<String> comboCategory = new JComboBox<String>(comStr);
	JButton btnUpdate = new JButton("도서수정");
	
	public BookUpdateView() {
		setLayout(new BorderLayout(10, 10));
		
		for (int i = 0; i < header.length; i++) {
			lbls[i] = new JLabel(header[i]);
			panS.add(lbls[i]);
			if(i < 5) {
				tf[i] = new JTextField();
				panS.add(tf[i]);
			} else {
				panS.add(comboCategory);
			}
		}
		
		panS.add(new JLabel("")); panS.add(new JLabel("")); panS.add(new JLabel(""));
		panS.add(btnUpdate);
	}
	
	public void setTextField(int row) {
		for (int i = 0; i < tf.length; i++) {
			tf[i].setText(model.getValueAt(row, i)+"");
		}
		comboCategory.setSelectedItem(model.getValueAt(row, 5));
	}
	
	public void initView() {
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
		add("Center", scroll);
		add("South", panS);
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
	
	public BookVO neededUpdateData() {
		BookVO vo = new BookVO();
		vo.setIsbn(Integer.parseInt(tf[0].getText()));
		vo.setName(tf[1].getText());
		vo.setAuthor(tf[2].getText());
		vo.setPublish(tf[3].getText());
		vo.setPrice(Integer.parseInt(tf[4].getText()));
		vo.setCategory((String)comboCategory.getSelectedItem());
		
		return vo;
	}
	
	public void initData() {
		for (int i = 0; i < tf.length; i++) {
			tf[i].setText("");
		}
		comboCategory.setSelectedIndex(0);
	}
	
	public JButton getBtnUpdate() {
		return btnUpdate;
	}
	
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	public JTable getTable() {
		return table;
	}
	
}
