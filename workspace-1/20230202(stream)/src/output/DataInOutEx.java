package output;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <Ŭ����>
 * DataOutputStream : ����,���ڿ��� �ƴ� �Ϲ� ������(����, Bool, �Ǽ� ��)�� ����� �� ����ϴ� ��Ʈ�� Ŭ����
 * <�޼ҵ�>
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
