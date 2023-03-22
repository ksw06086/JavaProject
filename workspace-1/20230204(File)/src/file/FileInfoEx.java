package file;

import java.io.File;

/**
 * <클래스>
 * - File : 파일 이름의 변경, 파일 삭제, 파일의 존재 확인 등 파일 그 자체를 다루고 싶을 때 사용하는 클래스
 * <생성자>
 * - File(String path)					- path 경로명에 해당하는 File
 * - File(String path, String name)		- path 홀더에 존재하는 name 이름의 File
 * - File(File dir, String name)		- dir 객체와 같은 홀더에 존재하는 name 이름의 File
 * <메소드>
 * - String getName()					- 파일 이름을 반환
 * - String getParent()					- 파일 상위 경로 반환
 * - File getParentFile()				- 파일의 상위 경로에 해당하는 File 객체 반환
 * - String getPath()					- 파일의 상대 경로 반환
 * - String getAbsolutePath()			- 파일의 절대 경로 반환
 * - URL toURL()						- 경로명은 URL로 변환
 * - boolean exists()					- 파일이 실제로 존재하는 지의 여부 반환
 * - boolean canWrite()					- 파일에 쓸 수 있는 지의 여부 반환
 * - boolean canRead()					- 파일을 읽을 수 있는 지의 여부 반환
 * - boolean isFile()					- 현재의 File 객체가 파일인 지의 여부 반환
 * - boolean isDirectory()				- 현재의 File 객체가 디렉토리인 지의 여부 반환
 * - boolean isHidden()					- 숨겨진 파일인 지에 대한 여부 반환
 * - long lastModified()				- 파일이 마지막으로 수정된 시간 반환
 * - long length()						- 파일의 길이를 바이트 단위로 반환
 * - boolean mkdir()					- 디렉토리를 생성하고 성공 여부 반환
 * - boolean renameTo(File dest)		- 파일의 이름을 dest로 바꾸고 성공 여부 반환
 * - boolean delete()					- 파일을 삭제하고 성공 여부 반환
 * - boolean createNewFile()			- 파일이 존재하지 않는다면 비어있는 새 파일 생성
 * - boolean setReadOnly()				- 파일을 읽기 전용으로 변경하고 성공 여부 반환
 * - String[] list()					- 현재의 File 객체가 디렉토리라면 해당 디렉토리 내의 파일 이름을 배열에 저장하여 반환
 * 
 * 
 * **/

// ���Ͽ� ���� ���� ���
public class FileInfoEx {
	public static void main(String[] args) {
		File my_file = new File("C:/Users/Happy/Downloads/test.txt");
		if(my_file.exists()) {
			System.out.println("파일 이름 : " + my_file.getName());
			System.out.println("상대 경로 : " + my_file.getPath());
			System.out.println("절대 경로 : " + my_file.getAbsolutePath());
			System.out.println("쓰기 가능 : " + my_file.canWrite());
			System.out.println("읽기 가능 : " + my_file.canRead());
			System.out.println("파일 : " + my_file.isFile());
			System.out.println("디렉토리 : " + my_file.isDirectory());
			System.out.println("파일 크기 : " + my_file.length());
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}
