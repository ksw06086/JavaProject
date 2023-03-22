package socket.cilent.chat;

// 프로그램 구동 메인 프로그램
public class ClientGuiMain {
	public static void main(String[] args) {
		StartingJFrame frame = new StartingJFrame();
		ClientGui bp = new ClientGui(frame, "192.168.1.3", 9876);
		bp.giveAndTake();
		frame.setMainJpanel(bp);
		frame.setSize(400, 300);
		frame.validate();
	}
}
