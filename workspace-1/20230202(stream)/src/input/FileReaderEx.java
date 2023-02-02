package input;

import java.io.FileReader;
import java.io.IOException;

/**
 * <Ŭ����>
 * FileInputStream : ������ �ԷµǾ� �ִ� ������ �д� ��Ʈ�� Ŭ����
 * FileReader : ���� ���� �ٸ� ���� ������ �ԷµǾ� �ִ� ������ �д� ��Ʈ�� Ŭ����
 * <������>
 * - FileInputStream
 * + FileInputStream(String name)	- ���ϸ��� name�� ���Ͽ��� �Է� �޴� FileInputStream
 * + FileInputStream(File file)			- file ��ü�� ����Ű�� ���Ͽ��� �Է� �޴� FileInputStream
 * - FileReader 
 * + FileReader(String name)	- ���ϸ��� name�� ���Ͽ��� �Է� �޴� FileReader
 * + FileReader(File file)			- file ��ü�� ����Ű�� ���Ͽ��� �Է� �޴� FileReader
 * 
 * **/
public class FileReaderEx {
	public static void main(String[] args) {
		int i;
		
		try {
			FileReader in = new FileReader("c:///tmp/FileRdEx.java");
			
			while((i = in.read()) != -1) {
				char c = (char)i;
				System.out.print(c);
			}
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
