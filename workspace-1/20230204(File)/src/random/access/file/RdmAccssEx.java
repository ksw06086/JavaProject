package random.access.file;

import java.io.RandomAccessFile;

/**
 * 
 * <Ŭ����>
 * - RandomAccessFile : ������ ������ ��ġ���� �����͸� �аų� �� �� �ְ� ���ִ� Ŭ����(����� ��Ʈ�� ��𿡵� ������ ����)
 * <������>
 * - RandomAccessFile(String name, String mode)		- ���ϸ��� name�� ���Ͽ� ����� RandomAccessFile
 * - RandomAccessFile(File file, String mode)				- file ��ü�� ����Ű�� ���Ͽ� ����� RandomAccessFile
 * +++ mode : r - �б� ���, rw - �б�/���� ���
 * <�ֿ�޼ҵ�>
 * - long getFilePointer()						- ���� �������� ��ġ ��ȯ
 * - int skipBytes(int n)						- ���� �����͸� ���� ��ġ�κ��� n ����Ʈ��ŭ �̵�
 * - void seek(long pos)						- ���� �����͸� pos�� �̵�
 * - int read()										- ������ ���� ������ ��ġ�� �ִ� �����͸� ����
 * - String readLine()							- ������ ���� ������ ��ġ�κ��� ������ ����
 * - void write(byte b[])						- ������ ���� ������ ��ġ�� ����Ʈ �迭 b�� ����
 * - long length()								- ������ ���̸� ����Ʈ ������ ��ȯ
 * 
 * */
public class RdmAccssEx {
	public static void main(String[] args) {
		byte[] data = {12,34,56,78,98,76,54,32,10};
		try {
			RandomAccessFile r = new RandomAccessFile("test.txt", "rw");
			r.write(data);
			
			for (int i = 0; i < data.length; i++) {
				r.seek(i);
				System.out.println(r.read());
			}
			
			r.close();
		} catch (Exception e) {
			System.out.println("������ ����� �� �����ϴ�.");
		}
	}
}
