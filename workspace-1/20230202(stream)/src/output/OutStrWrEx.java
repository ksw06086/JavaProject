package output;

import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * <클래스>
 * OutputStream : 영문을 사용할 때 입력 스트림 클래스
 * OutputStreamWriter : 영문 포함 다른 나라 언어까지 사용할 때 입력 스트림 클래스
 * <메소드>
 * writer()		- 출력할 내용 쓰기
 * flush()			- 쓰인 내용 출력
 * 
 * **/
public class OutStrWrEx {
	public static void main(String[] args) {
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		try {
			out.write("자바 프로그래밍");
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
}
