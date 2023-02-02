package thread1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTest2 extends JFrame{
	Container pane;
	JLabel lbl;
	
	public ThreadTest2() {
		pane = getContentPane();
		lbl = new JLabel("", JLabel.CENTER);
		add(lbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,600);
		setVisible(true);
		
		MyThread t = new MyThread();
		t.start();
	}
	
	

	public class MyThread extends Thread{
		ImageIcon icon = new ImageIcon();
		@Override
		public void run() {
			String[] images = {"1.jpg", "2.jpg", "3.jpg"};
			String[] titles = {"ÇÑ", "µÎ", "¼¼"};
			Color[] colors = {Color.GREEN, Color.RED, Color.BLUE};
			
			try {
				int i = 0;
				while(true) {
						setTitle(titles[i]);
						pane.setBackground(colors[i]);
						icon = new ImageIcon("images/" + images[i]);
						lbl.setIcon(icon);
						sleep(500);
						i = ++i % colors.length;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}

	public static void main(String[] args) {
		new ThreadTest2();
	}
}


