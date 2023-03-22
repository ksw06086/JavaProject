package output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <클래스>
 * FileOutputStream : 영문이 입력되어 있는 파일에 내용을 출력하는 스트림 클래스
 * <생성자>
 * - FileOutputStream
 * + FileOutputStream(String name)	- 파일명이 name인 파일에 출력하는 FileOutputStream
 * + FileOutputStream(File file)	- file 객체가 가리키는 파일에 출력하는 FileOutputStream
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
