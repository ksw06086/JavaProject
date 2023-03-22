package socket.programming;

public class SocketClass {
/**
 * <클래스>
 * - Socket : 서버와 통신하기 위한 클라이언트 프로그램에서 사용하는 소켓(서버의 IP주소, 포트번호를 인수로 받음)
 * <생성자>
 * - Socket(InetAddress address, int port)							- 소켓을 생성하여 지정된 IP주소와 포트번호에 연결한다.
 * - Socket(String host, int port)										- 소켓을 생성하여 지정된 호스트와 포트번호에 연결한다.				
 * <메소드>
 * - void close()																	- 소켓을 닫는다.
 * - void connect(SocketAddress endpoint)							- 서버에 연결한다.
 * - InetAddress getInetAddress()										- 연결한 서버의 주소 반환
 * - InputStream getInputStream()										- 소켓에 대한 입력 스트림 반환
 * - InetAddress getLocalAddress()										- 소켓이 연결된 로컬 주소 반환
 * - int getLocalPort()															- 소켓이 연결된 로컬 포트 번호 반환
 * - int getPort()																	- 소켓이 연결된 서버의 포트 번호 반환
 * - OutputStream getOutputStream()									- 소켓에 대한 출력 스트림 반환
 * - boolean isBound()														- 소켓이 로컬 주소에 연결되어 있으면 true 반환
 * - boolean isConnected()													- 소켓이 서버에 연결되어 있으면 true 반환
 * - boolean isClosed()														- 소켓이 닫혀 있으면 true 반환
 * - void setSoTimeout(int timeout)									- 데이터 읽기 타임아웃 시간 지정. 0이면 타임아웃 해제
 * <방법>
 * - (클라이언트 소켓 생성)
 * + Socket CilentSocket = new Socket("150.150.1.1", "8080");
 * - (네트워크를 통한 데이터 입출력 스트림 생성)
 * + BufferedReader In = new  BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));
 * + BufferedWriter Out = new BufferedWriter(new OutputStreamWriter(CilentSocket.getOutputStream()));
 * - (클라이언트에서 서버로 데이터 출력)
 * + Out.write("Good Morning!");
 * + Out.flush();									// 스트림에 남아있을 수 있는 데이터를 모두 남기지 않고 출력
 * - (서버로부터의 데이터 입력)
 * + int a = In.read();
 * + String line = In.readLine();
 * - (서버와의 연결 종료)
 * + ClientSocket.close();
 * 
 * 
 * **/
}
