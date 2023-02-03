package output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <클래스>
 * BifferedOutputStream : InputStream으로 읽은 내용을 저장해두고 꺼내써먹는 스트림 클래스
 * BufferedWriter : InputStreamReader로 읽은 내용을 저장해두고 꺼내써먹는 스트림 클래스
 * <주의점>
 * - 이 클래스는 필터클래스이기 때문에 혼자서 사용할 수 없는 클래스이다.
 * 
 * **/
public class BfrdWrEx {
	public static void main(String[] args) {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			out.write("버퍼를 이용한 문자열 출력");
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
