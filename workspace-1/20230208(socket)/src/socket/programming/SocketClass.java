package socket.programming;

public class SocketClass {
/**
 * <Ŭ����>
 * - Socket : ������ ����ϱ� ���� Ŭ���̾�Ʈ ���α׷����� ����ϴ� ����(������ IP�ּ�, ��Ʈ��ȣ�� �μ��� ����)
 * <������>
 * - Socket(InetAddress address, int port)							- ������ �����Ͽ� ������ IP�ּҿ� ��Ʈ��ȣ�� �����Ѵ�.
 * - Socket(String host, int port)										- ������ �����Ͽ� ������ ȣ��Ʈ�� ��Ʈ��ȣ�� �����Ѵ�.				
 * <�޼ҵ�>
 * - void close()																	- ������ �ݴ´�.
 * - void connect(SocketAddress endpoint)							- ������ �����Ѵ�.
 * - InetAddress getInetAddress()										- ������ ������ �ּ� ��ȯ
 * - InputStream getInputStream()										- ���Ͽ� ���� �Է� ��Ʈ�� ��ȯ
 * - InetAddress getLocalAddress()										- ������ ����� ���� �ּ� ��ȯ
 * - int getLocalPort()															- ������ ����� ���� ��Ʈ ��ȣ ��ȯ
 * - int getPort()																	- ������ ����� ������ ��Ʈ ��ȣ ��ȯ
 * - OutputStream getOutputStream()									- ���Ͽ� ���� ��� ��Ʈ�� ��ȯ
 * - boolean isBound()														- ������ ���� �ּҿ� ����Ǿ� ������ true ��ȯ
 * - boolean isConnected()													- ������ ������ ����Ǿ� ������ true ��ȯ
 * - boolean isClosed()														- ������ ���� ������ true ��ȯ
 * - void setSoTimeout(int timeout)									- ������ �б� Ÿ�Ӿƿ� �ð� ����. 0�̸� Ÿ�Ӿƿ� ����
 * <���>
 * - (Ŭ���̾�Ʈ ���� ����)
 * + Socket CilentSocket = new Socket("150.150.1.1", "8080");
 * - (��Ʈ��ũ�� ���� ������ ����� ��Ʈ�� ����)
 * + BufferedReader In = new  BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));
 * + BufferedWriter Out = new BufferedWriter(new OutputStreamWriter(CilentSocket.getOutputStream()));
 * - (Ŭ���̾�Ʈ���� ������ ������ ���)
 * + Out.write("Good Morning!");
 * + Out.flush();									// ��Ʈ���� �������� �� �ִ� �����͸� ��� ������ �ʰ� ���
 * - (�����κ����� ������ �Է�)
 * + int a = In.read();
 * + String line = In.readLine();
 * - (�������� ���� ����)
 * + ClientSocket.close();
 * 
 * 
 * **/
}
