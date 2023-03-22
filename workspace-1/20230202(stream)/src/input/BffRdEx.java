package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <클래스>
 * BifferedInputStream : InputStream으로 읽은 내용을 저장해두고 꺼내써먹는 스트림 클래스
 * BufferedReader : InputStreamReader로 읽은 내용을 저장해두고 꺼내써먹는 스트림 클래스
 * <주의점>
 * - 이 클래스는 필터클래스이기 때문에 혼자서 사용할 수 없는 클래스이다.
 * 
 * <클래스>
 * DataInputStream : 문자,문자열이 아닌 일반 데이터(숫자, Bool, 실수 등)를 입력받을 때 사용하는 스트림 클래스
 * <메소드>
 * + readBoolean(), readByte(), readInt(), readLong(), readFloat(), readDouble()
 * **/
public class BffRdEx {
	public static void main(String[] args) {
		InputStreamReader Rd = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(Rd);
		
		try {
			String str = in.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
