package output;

import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * <Ŭ����>
 * OutputStream : ������ ����� �� �Է� ��Ʈ�� Ŭ����
 * OutputStreamWriter : ���� ���� �ٸ� ���� ������ ����� �� �Է� ��Ʈ�� Ŭ����
 * <�޼ҵ�>
 * writer()		- ����� ���� ����
 * flush()			- ���� ���� ���
 * 
 * **/
public class OutStrWrEx {
	public static void main(String[] args) {
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		try {
			out.write("�ڹ� ���α׷���");
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
}
