package test.combo;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboTest extends JFrame implements ItemListener {
	JComboBox<String> comboMeal, comboDrink;
	JLabel lblMeal, lblDrink;
	JPanel pC;
	
	public JComboTest() {
		// ȭ�� �⺻ ����
		setTitle("JComboBox ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 150, 500, 400);
		setLayout(new BorderLayout());
		
		JPanel pN = new JPanel(new FlowLayout());
		String[] meal = {"�ܹ���","����","ġŲ","������","����","�ʹ�","������ũ","�Ľ�Ÿ"};
		String[] drink = {"�ݶ�","���̴�","�Ŀ����̵�","��ī��","�ϴú���","��ũƼ","Ŀ��"};
		comboMeal = new JComboBox<String>(meal);
		comboDrink = new JComboBox<String>(drink);
		JLabel lblM = new JLabel("�Ļ�: ");
		JLabel lblD = new JLabel("����: ");
		pN.add(lblM); pN.add(comboMeal); pN.add(lblD); pN.add(comboDrink);
		
		pC = new JPanel(new GridLayout(1,2,20,20));
		ImageIcon iconM = new ImageIcon("images/m0.jpg");
		lblMeal = new JLabel(iconM);
		ImageIcon iconD = new ImageIcon("images/d0.jpg");
		lblDrink = new JLabel(iconD);
		pC.add(lblMeal); pC.add(lblDrink);
		
		comboMeal.addItemListener(this);
		comboDrink.addItemListener(this);
		
		add(pN, "North");
		add(pC, "Center");
		setVisible(true);		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == comboMeal) {
			int selectIndex = comboMeal.getSelectedIndex();
			ImageIcon icon = new ImageIcon("images/m" + selectIndex + ".jpg");
			lblMeal.setIcon(icon);
		} else {
			int selectIndex = comboDrink.getSelectedIndex();
			ImageIcon icon = new ImageIcon("images/d" + selectIndex + ".jpg");
			lblDrink.setIcon(icon);
		}
	}
	
	public static void main(String[] args) {
		new JComboTest();
	}

}
