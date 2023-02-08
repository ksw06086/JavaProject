package socket.programming;

public class ServerSocketClass {
/**
 * <Ŭ����>
 * - ServerSocket : ��û�� �����͸� �������ִ� ���� �� ��ǻ�Ϳ��� ���Ǵ� ���� ������ ����
 * + Ŭ���̾�Ʈ�κ����� ���� ��û�� ����ϱ� ���� �����
 * + Ŭ���̾�Ʈ�κ��� ��û�� ������ �̸� �����ϰ� Socket ��ü�� ���Ӱ� �����Ͽ� ������ �ۼ��ſ� ����ϰ� �ȴ�.
 * <������>
 * - ServerSocket(int port)						- ������ ��Ʈ ��ȣ�� ���յ� ������ �����Ѵ�.
 * <�޼ҵ�>
 * - Socket accept()								- ���� ��û�� ��ٸ��� ��û�� ������ �����ϰ� Socket ��ü ��ȯ
 * - void close()										- ���� ������ �ݴ´�.
 * - InetAddress getInetAddress()			- ���� ���Ͽ� ����� ���� �ּ� ��ȯ
 * - int getLocalPort()								- ���� ������ ���� ��û�� ����͸��ϴ� ��Ʈ ��ȣ ��ȯ
 * - boolean isBound()							- ���� ������ ���� �ּҿ� ����Ǿ� ������ true ��ȯ
 * - boolean isClosed()							- ���� ������ ���� ������ true ��ȯ
 * - void setSoTimeout(int timeout)		- accept()�� ���� Ÿ�Ӿƿ� �ð� ����. 0�̸� Ÿ�Ӿƿ� ����
 * 
 * <���>
 * - (������ ���� ����)
 * + ServerSocket Server = new ServerSocket(8080);
 * 
 * - (Ŭ���̾�Ʈ�κ����� ���� ��û ���) 
 * + Socket socket = Server.accept();								// accept() �޼ҵ带 �̿��Ͽ� ������ socket ��ü�� ����Ͽ� ������ �ۼ���
 * 
 * - (��Ʈ��ũ�� ���� ������ ����� ��Ʈ�� ����)
 * + BufferedReader In = new BufferedReader(new InputStream(socket.getInputStream()));
 * + BufferedWriter Out = new BufferedWriter(new OutputStream(socket.getOutputStream()));
 * 
 * - (Ŭ���̾�Ʈ�κ����� ������ �Է�)
 * + int a = In.read();
 * + String line = In.readLine();
 * 
 * - (Ŭ���̾�Ʈ�� ������ ���)
 * + Out.write("Hello Client");
 * + Out.flush();
 * 
 * - (��Ʈ��ũ ���� ����   /   ���� ���α׷� ����)
 * + socket.close();     /     Server.close();
 *
 * **/
}
