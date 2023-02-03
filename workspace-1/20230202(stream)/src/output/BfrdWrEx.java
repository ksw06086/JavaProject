package output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <Ŭ����>
 * BifferedOutputStream : InputStream���� ���� ������ �����صΰ� ������Դ� ��Ʈ�� Ŭ����
 * BufferedWriter : InputStreamReader�� ���� ������ �����صΰ� ������Դ� ��Ʈ�� Ŭ����
 * <������>
 * - �� Ŭ������ ����Ŭ�����̱� ������ ȥ�ڼ� ����� �� ���� Ŭ�����̴�.
 * 
 * **/
public class BfrdWrEx {
	public static void main(String[] args) {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			out.write("���۸� �̿��� ���ڿ� ���");
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
