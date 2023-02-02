package input;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <Ŭ����>
 * InputStream : ������ ����� �� �Է� ��Ʈ�� Ŭ����
 * InputStreamReader : ���� ���� �ٸ� ���� ������ ����� �� �Է� ��Ʈ�� Ŭ����
 * <�޼ҵ�>
 * int read(byte [] b) 		- b �迭��ŭ �����͸� �Է�
 * int read(char [] cb) 	- cb �迭��ŭ �����͸� �Է�
 * long skip(long n)			- n�� ��ŭ �о� ���� �����͸� �ǳ� ��
 * void close()					- ��Ʈ���� ����(����)
 * 
 * **/
public class InStrRd {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		try {
			while(true) {
				int i = in.read();
				char myChar = (char)i;
				System.out.print(myChar);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
