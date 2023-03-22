package socket.cilent.chat;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 구현된 클라이언트 프로그램의 실행화면을 모니터 중앙에 위치하도록 해주는 기능
public class StartingJFrame extends JFrame{
	private JPanel mainp;
	public StartingJFrame() {
		System.out.println(this.getClass().getName()+"   Start!!!!");
		inits();
	}
	private void inits() {
		mainp = (JPanel)this.getContentPane();
		mainp.setLayout(new BorderLayout());
		this.setSize(new Dimension(400, 300));
		initFrame();
		
		this.setTitle(this.getClass().getName());
	}
	
	public void addListener() {
		
	}
	
	private void initFrame() {
		Dimension monitorSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		if(frameSize.height > monitorSize.height) {
			frameSize.height = monitorSize.height;
		}
		if(frameSize.width > monitorSize.width) {
			frameSize.width = monitorSize.width;
		}
		int locationX = (monitorSize.width - frameSize.width)/2;
		int locationY = (monitorSize.height - frameSize.height)/2;
		this.setLocation(locationX, locationY);
		this.setVisible(true);
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
	}
	
	public void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if(e.getID() == WindowEvent.WINDOW_CLOSING) {
			System.out.println(this.getClass().getName()+"  End!!");
			System.exit(1);
		}
	}
	
	public void setMainJpanel(JComponent c) {
		mainp.add(c);
	}
}
