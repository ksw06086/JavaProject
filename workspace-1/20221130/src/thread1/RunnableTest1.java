package thread1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTest1 extends JFrame implements Runnable{
	Container pane;
	JLabel lbl;
	ImageIcon icon = new ImageIcon();
	
	public RunnableTest1() {
		pane = getContentPane();
		lbl = new JLabel("", JLabel.CENTER);
		add(lbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,600);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		RunnableTest1 r = new RunnableTest1();
		Thread t = new Thread(r);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] images = {"1.jpg", "2.jpg", "3.jpg"};
		String[] titles = {"ÇÑ", "µÎ", "¼¼"};
		Color[] colors = {Color.GREEN, Color.RED, Color.BLUE};
		
		int i = 0;
		while(true) {
				setTitle(titles[i]);
				pane.setBackground(colors[i]);
				icon = new ImageIcon("images/" + images[i]);
				lbl.setIcon(icon);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i = ++i % colors.length;
		}
	}

}


