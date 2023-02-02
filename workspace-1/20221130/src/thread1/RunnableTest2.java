package thread1;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

// ���� �ð� �ǽð� ���̰� �ϱ�
// ����ȭ ��� : ��ũ�γ���� �־��ָ� ��
// ���ε�ſ� ������ => �����͸� ���� �ְ� ���� �� ���ε�ſ� �������� => �����͸� �ְ� �޾ƾ��� �� ���ε�ſ� ������ �����
// ���ε�ſ� ������ ���� �� �� �ʿ��� ����  wait�� notify��
/** 
 * Buffer : â�� Ŭ���� { ����(data) }�� �ȿ� ���� => �ȿ� ���� ä��
 * Flag ���� - available ( O - ä���� ���� / X - ��� ���� )
 * ä��� ���� - Producer(������ Thread)<push()> / �������� ���� - Consumer(�Һ��� Thread)<get()>
 * ���ۿ� ���̳� Ǫ�� �޼ҵ忡 ũ��Ƽ�� ������ �־��ָ� ��
 * 
 * */
public class RunnableTest2 extends JFrame implements Runnable{
	JLabel lbl = new JLabel("", JLabel.CENTER);
	
	public RunnableTest2() {
		add("Center", lbl);
		lbl.setFont(new Font("���� ���", Font.BOLD, 30));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,200,300,200);
		setVisible(true);

		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		Calendar calendar = null;
		while(true) {
			calendar = Calendar.getInstance();
			int h = calendar.get(Calendar.HOUR_OF_DAY);
			int m = calendar.get(Calendar.MINUTE);
			int s = calendar.get(Calendar.SECOND);
			
			lbl.setText(h + "�� " + m + "�� " + s + "��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new RunnableTest2();
	}
}
