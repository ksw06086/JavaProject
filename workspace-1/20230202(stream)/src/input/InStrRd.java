package input;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <클래스>
 * InputStream : 영문을 사용할 때 입력 스트림 클래스
 * InputStreamReader : 영문 포함 다른 나라 언어까지 사용할 때 입력 스트림 클래스
 * <메소드>
 * int read(byte [] b) 		- b 배열만큼 데이터를 입력
 * int read(char [] cb) 	- cb 배열만큼 데이터를 입력
 * long skip(long n)			- n개 만큼 읽어 들일 데이터를 건너 뜀
 * void close()					- 스트림을 닫음(종료)
 * 
 * **/
public class InStrRd {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		try {
			while(true) {
				int i = in.read();
				char myChar = (char)i;
				System.out.print(myChar);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
