package input;

import java.io.FileReader;
import java.io.IOException;

/**
 * <클래스>
 * FileInputStream : 영문이 입력되어 있는 파일을 읽는 스트림 클래스
 * FileReader : 영문 포함 다른 나라 언어까지 입력되어 있는 파일을 읽는 스트림 클래스
 * <생성자>
 * - FileInputStream
 * + FileInputStream(String name)	- 파일명이 name인 파일에서 입력 받는 FileInputStream
 * + FileInputStream(File file)			- file 객체가 가리키는 파일에서 입력 받는 FileInputStream
 * - FileReader 
 * + FileReader(String name)	- 파일명이 name인 파일에서 입력 받는 FileReader
 * + FileReader(File file)			- file 객체가 가리키는 파일에서 입력 받는 FileReader
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
