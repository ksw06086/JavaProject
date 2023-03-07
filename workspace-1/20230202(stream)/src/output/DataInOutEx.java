package output;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <클래스>
 * DataOutputStream : 문자,문자열이 아닌 일반 데이터(숫자, Bool, 실수 등)를 출력할 때 사용하는 스트림 클래스
 * <메소드>
 * + writeBoolean(), writeByte(), writeInt(), writeLong(), writeFloat(), writeDouble()
 * 
 * **/
public class DataInOutEx {
	public static void main(String[] args) {
		char c = 'A';
		byte b = 15;
		boolean bool = true;
		
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data"));
			
			out.writeChar(c);
			out.writeByte(b);
			out.writeBoolean(bool);
			out.flush();
			out.close();
			
			DataInputStream in = new DataInputStream(new FileInputStream("data"));
			c = in.readChar();
			System.out.println("Char : " + c);
			b = in.readByte();
			System.out.println("Byte : " + b);
			bool = in.readBoolean();
			System.out.println("Boolean : " + bool);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
}
