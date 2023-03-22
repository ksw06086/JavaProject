package output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <클래스>
 * FileWriter : 영문 포함 다른 나라 언어까지 입력되어 있는 파일에 내용을 출력하는 스트림 클래스
 * <생성자>
 * - FileWriter
 * + FileWriter(String name)				- 파일명이 name인 파일에 출력하는 FileWriter
 * + FileWriter(String name, boolean apnd)	- 파일명이 name인 파일을 열어서 apnd 값에 따라 추가하거나 새로 출력하는 FileWriter
 * + FileWriter(File file)					- file 객체가 가리키는 파일에 출력하는 FileWriter
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
