package output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <Ŭ����>
 * FileOutputStream : ������ �ԷµǾ� �ִ� ���Ͽ� ������ ����ϴ� ��Ʈ�� Ŭ����
 * <������>
 * - FileOutputStream
 * + FileOutputStream(String name)					- ���ϸ��� name�� ���Ͽ� ����ϴ� FileOutputStream
 * + FileOutputStream(File file)						- file ��ü�� ����Ű�� ���Ͽ� ����ϴ� FileOutputStream
 * 
 * **/
public class FileInOutEx {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("test.dat");
			for(int i = 1; i <= 10; i++) {
				out.write(i);
			}
			
			FileInputStream file = new FileInputStream("test.dat");
			InputStreamReader in = new InputStreamReader(file);
			
			int c;
			while((c=in.read()) != -1) {
				System.out.println(c);
			}
			
			in.close();
			out.close();
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
