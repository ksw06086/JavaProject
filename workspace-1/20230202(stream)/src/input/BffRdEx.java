package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <Ŭ����>
 * BifferedInputStream : InputStream���� ���� ������ �����صΰ� ������Դ� ��Ʈ�� Ŭ����
 * BufferedReader : InputStreamReader�� ���� ������ �����صΰ� ������Դ� ��Ʈ�� Ŭ����
 * <������>
 * - �� Ŭ������ ����Ŭ�����̱� ������ ȥ�ڼ� ����� �� ���� Ŭ�����̴�.
 * 
 * <Ŭ����>
 * DataInputStream : ����,���ڿ��� �ƴ� �Ϲ� ������(����, Bool, �Ǽ� ��)�� �Է¹��� �� ����ϴ� ��Ʈ�� Ŭ����
 * <�޼ҵ�>
 * + readBoolean(), readByte(), readInt(), readLong(), readFloat(), readDouble()
 * **/
public class BffRdEx {
	public static void main(String[] args) {
		InputStreamReader Rd = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(Rd);
		
		try {
			String str = in.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
