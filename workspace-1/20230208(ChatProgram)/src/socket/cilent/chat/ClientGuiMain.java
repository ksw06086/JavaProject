package socket.cilent.chat;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 순서
// 1. 화면 생성
// 2. 클라이언트가 서버에게 소켓 생성해달라고 함
// 3. 서버는 포트열고 요청 올때까지 기다리다가 생성해달라고 하면 해당 클라이언트에 대한 소켓 1개를 생성해줌
// 4. 클라이언트, 서버 연거 다 포함해서 frame 추가/수정된 부분 반영해서 이제 화면이 띄워짐
// 5. 서버 열 때 서버쪽에서 [대화명을 넣으세요: ] 해서 클라이언트 이름 입력하게 함
// 6. 입력하면 area 화면에 누구 입장했다고 띄워줌
// 7. 그 후 메시지 왔다갔다 함

// 프로그램 구동 메인 프로그램
public class ClientGuiMain {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ipAddress = InetAddress.getLocalHost();
		// +++ 현재 나의 컴퓨터 +++ : InetAddress ipAddress = InetAddress.getLocalHost();
		// +++ 현재 쿠팡 사이트 +++ : InetAddress ipAddress = InetAddress.getByName("www.coupang.com");
		// ipAddress.getHostAddress() - IP
		// ipAddress.getHostName() - host명
		StartingJFrame frame = new StartingJFrame();
		ClientGui bp = new ClientGui(frame, ipAddress.getHostAddress(), 9876);
		bp.giveAndTake();
		// ClientGui에서 추가/수정된 JFrame을 StartingJFrame에 입혀줌
		frame.setMainJpanel(bp);
		// 화면에 출력
		frame.setSize(400, 300);
		frame.validate();
	}
}
