package random.access.file;

import java.io.RandomAccessFile;

/**
 * 
 * <클래스>
 * - RandomAccessFile : 파일의 임의의 위치에서 데이터를 읽거나 쓸 수 있게 해주는 클래스(입출력 스트림 어디에도 속하지 않음)
 * <생성자>
 * - RandomAccessFile(String name, String mode)	- 파일명이 name인 파일에 연결된 RandomAccessFile
 * - RandomAccessFile(File file, String mode)	- file 객체가 가리키는 파일에 연결된 RandomAccessFile
 * +++ mode : r - 읽기 모드, rw - 읽기/쓰기 모드
 * <주요메소드>
 * - long getFilePointer()						- 파일 포인터의 위치 반환
 * - int skipBytes(int n)						- 파일 포인터를 현재 위치로부터 n 바이트만큼 이동
 * - void seek(long pos)						- 파일 포인터를 pos로 이동
 * - int read()									- 현재의 파일 포인터 위치에 있는 데이터를 읽음
 * - String readLine()							- 현재의 파일 포인터 위치로부터 한줄을 읽음
 * - void write(byte b[])						- 현재의 파일 포인터 위치에 바이트 배열 b를 저장
 * - long length()								- 파일의 길이를 바이트 단위로 반환
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
			System.out.println("파일을 사용할 수 없습니다.");
		}
	}
}
