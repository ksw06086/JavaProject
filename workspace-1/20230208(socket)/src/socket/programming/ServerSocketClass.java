package socket.programming;

public class ServerSocketClass {
/**
 * <클래스>
 * - ServerSocket : 요청한 데이터를 제공해주는 서버 측 컴퓨터에서 사용되는 서버 소켓을 생성
 * + 클라이언트로부터의 연결 요청을 대기하기 위해 사용함
 * + 클라이언트로부터 요청이 들어오면 이를 수락하고 Socket 객체를 새롭게 생성하여 데이터 송수신에 사용하게 된다.
 * <생성자>
 * - ServerSocket(int port)						- 지정된 포트 번호와 결합된 소켓을 생성한다.
 * <메소드>
 * - Socket accept()								- 연결 요청을 기다리다 요청이 들어오면 수라하고 Socket 객체 반환
 * - void close()										- 서버 소켓을 닫는다.
 * - InetAddress getInetAddress()			- 서버 소켓에 연결된 로컬 주소 반환
 * - int getLocalPort()								- 서버 소켓이 연결 요청을 모니터링하는 포트 번호 반환
 * - boolean isBound()							- 서버 소켓이 로컬 주소에 연결되어 있으면 true 반환
 * - boolean isClosed()							- 서버 소켓이 닫혀 있으면 true 반환
 * - void setSoTimeout(int timeout)		- accept()에 대한 타임아웃 시간 지정. 0이면 타임아웃 해제
 * 
 * <방법>
 * - (서버용 소켓 생성)
 * + ServerSocket Server = new ServerSocket(8080);
 * 
 * - (클라이언트로부터의 연결 요청 대기) 
 * + Socket socket = Server.accept();								// accept() 메소드를 이용하여 생성된 socket 객체를 사용하여 데이터 송수신
 * 
 * - (네트워크를 통한 데이터 입출력 스트림 생성)
 * + BufferedReader In = new BufferedReader(new InputStream(socket.getInputStream()));
 * + BufferedWriter Out = new BufferedWriter(new OutputStream(socket.getOutputStream()));
 * 
 * - (클라이언트로부터의 데이터 입력)
 * + int a = In.read();
 * + String line = In.readLine();
 * 
 * - (클라이언트로 데이터 출력)
 * + Out.write("Hello Client");
 * + Out.flush();
 * 
 * - (네트워크 연결 종료   /   서버 프로그램 종료)
 * + socket.close();     /     Server.close();
 *
 * **/
}