package output;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * <클래스>
 * PrintStream : OutputStream 클래스의 복잡한 메소드를 print(), println()메소드만으로 사용할 수 있도록 정리한 필터스트림 클래스
 * PrintWriter : OutputStreamWriter 클래스의 복잡한 메소드를 print(), println()메소드만으로 사용할 수 있도록 정리한 필터스트림 클래스
 * 
 * */
public class PrtWrEx {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		out.print("자바 프로그래밍");
		out.flush();
	}
}
