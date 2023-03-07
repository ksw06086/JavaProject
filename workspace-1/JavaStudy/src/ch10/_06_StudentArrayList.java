package ch10;

import java.util.ArrayList;
import java.util.List;

public class _06_StudentArrayList {
	private List<_06_Student> list;
	
	public _06_StudentArrayList() {
		list = new ArrayList<_06_Student>();
	}
	
	// �л� �߰�
	public void addStudent(_06_Student student) {
		list.add(student);
	}
	
	// �л� ����
	public boolean deleteStudent(String studentID) {
		for (int i = 0; i < list.size(); i++) {
			_06_Student std = list.get(i);
			String tempID = std.getStudentID();
			
			// �̰� �� ������? tempID�� �� ���� ��� ó���� ���Ǯ�� �� ���� ���޵� ���̰�
			// studentID�� ���ʿ� ���Ǯ�� ���� ���ٺ��� ����
			if(tempID == studentID) {
				System.out.println(System.identityHashCode(tempID));
				System.out.println(System.identityHashCode(studentID));
				list.remove(i);
				return true;
			}
		}
		
		System.out.println("�ش� ID�� ã�� �� �����ϴ�.");
		return false;
	}
	
	// ��� �л� ���� ���
	public void showStudentInfo() {
		for (_06_Student student : list) {
			System.out.println(student);
		}
		System.out.println();
	}
	
}
