package output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <Ŭ����>
 * FileWriter : ���� ���� �ٸ� ���� ������ �ԷµǾ� �ִ� ���Ͽ� ������ ����ϴ� ��Ʈ�� Ŭ����
 * <������>
 * - FileWriter
 * + FileWriter(String name)								- ���ϸ��� name�� ���Ͽ� ����ϴ� FileWriter
 * + FileWriter(String name, boolean apnd)		- ���ϸ��� name�� ������ ��� apnd ���� ���� �߰��ϰų� ���� ����ϴ� FileWriter
 * + FileWriter(File file)									- file ��ü�� ����Ű�� ���Ͽ� ����ϴ� FileWriter
 * 
 * **/
public class FileCopyEx {
	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("c://temp/data1.txt");
			FileWriter out = new FileWriter("c://temp/data2.txt");
			int ch;
			while((ch = in.read()) != -1) {
				out.write(ch);
			}
			
			in.close();
			out.close();
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
