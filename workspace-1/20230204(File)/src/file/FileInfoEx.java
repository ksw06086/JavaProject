package file;

import java.io.File;

/**
 * <Ŭ����>
 * - File : ���� �̸��� ����, ���� ����, ������ ���� Ȯ�� �� ���� �� ��ü�� �ٷ�� ���� �� ����ϴ� Ŭ����
 * <������>
 * - File(String path)							- path ��θ� �ش��ϴ� File
 * - File(String path, String name)		- path Ȧ���� �����ϴ� name �̸��� File
 * - File(File dir, String name)				- dir ��ü�� ���� Ȧ���� �����ϴ� name �̸��� File
 * <�޼ҵ�>
 * - String getName()							- ���� �̸��� ��ȯ
 * - String getParent()						- ���� ���� ��� ��ȯ
 * - File getParentFile()						- ������ ���� ��ο� �ش��ϴ� File ��ü ��ȯ
 * - String getPath()							- ������ ��� ��� ��ȯ
 * - String getAbsolutePath()				- ������ ���� ��� ��ȯ
 * - URL toURL()									- ��θ��� URL�� ��ȯ
 * - boolean exists()							- ������ ������ �����ϴ� ���� ���� ��ȯ
 * - boolean canWrite()						- ���Ͽ� �� �� �ִ� ���� ���� ��ȯ
 * - boolean canRead()						- ������ ���� �� �ִ� ���� ���� ��ȯ
 * - boolean isFile()								- ������ File ��ü�� ������ ���� ���� ��ȯ
 * - boolean isDirectory()					- ������ File ��ü�� ���丮�� ���� ���� ��ȯ
 * - boolean isHidden()						- ������ ������ ���� ���� ���� ��ȯ
 * - long lastModified()						- ������ ���������� ������ �ð� ��ȯ
 * - long length()								- ������ ���̸� ����Ʈ ������ ��ȯ
 * - boolean mkdir()							- ���丮�� �����ϰ� ���� ���� ��ȯ
 * - boolean renameTo(File dest)		- ������ �̸��� dest�� �ٲٰ� ���� ���� ��ȯ
 * - boolean delete()							- ������ �����ϰ� ���� ���� ��ȯ
 * - boolean createNewFile()				- ������ �������� �ʴ´ٸ� ����ִ� �� ���� ����
 * - boolean setReadOnly()					- ������ �б� �������� �����ϰ� ���� ���� ��ȯ
 * - String[] list()								- ������ File ��ü�� ���丮��� �ش� ���丮 ���� ���� �̸��� �迭�� �����Ͽ� ��ȯ
 * 
 * 
 * **/

// ���Ͽ� ���� ���� ���
public class FileInfoEx {
	public static void main(String[] args) {
		File my_file = new File("C:/Users/Happy/Downloads/test.txt");
		if(my_file.exists()) {
			System.out.println("���� �̸� : " + my_file.getName());
			System.out.println("��� ��� : " + my_file.getPath());
			System.out.println("���� ��� : " + my_file.getAbsolutePath());
			System.out.println("���� ���� : " + my_file.canWrite());
			System.out.println("�б� ���� : " + my_file.canRead());
			System.out.println("���� : " + my_file.isFile());
			System.out.println("���丮 : " + my_file.isDirectory());
			System.out.println("���� ũ�� : " + my_file.length());
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}
}
