package output;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * <Ŭ����>
 * PrintStream : OutputStream Ŭ������ ������ �޼ҵ带 print(), println()�޼ҵ常���� ����� �� �ֵ��� ������ ���ͽ�Ʈ�� Ŭ����
 * PrintWriter : OutputStreamWriter Ŭ������ ������ �޼ҵ带 print(), println()�޼ҵ常���� ����� �� �ֵ��� ������ ���ͽ�Ʈ�� Ŭ����
 * 
 * */
public class PrtWrEx {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		out.print("�ڹ� ���α׷���");
		out.flush();
	}
}
