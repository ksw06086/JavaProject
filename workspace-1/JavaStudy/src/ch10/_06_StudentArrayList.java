package ch10;

import java.util.ArrayList;
import java.util.List;

public class _06_StudentArrayList {
	private List<_06_Student> list;
	
	public _06_StudentArrayList() {
		list = new ArrayList<_06_Student>();
	}
	
	// 학생 추가
	public void addStudent(_06_Student student) {
		list.add(student);
	}
	
	// 학생 삭제
	public boolean deleteStudent(String studentID) {
		for (int i = 0; i < list.size(); i++) {
			_06_Student std = list.get(i);
			String tempID = std.getStudentID();
			
			// 이게 왜 같을까? tempID에 들어간 값도 사실 처음에 상수풀에 들어간 값이 전달된 것이고
			// studentID는 애초에 상수풀에 값이 들어가다보니 같다
			if(tempID == studentID) {
				System.out.println(System.identityHashCode(tempID));
				System.out.println(System.identityHashCode(studentID));
				list.remove(i);
				return true;
			}
		}
		
		System.out.println("해당 ID를 찾을 수 없습니다.");
		return false;
	}
	
	// 모든 학생 정보 출력
	public void showStudentInfo() {
		for (_06_Student student : list) {
			System.out.println(student);
		}
		System.out.println();
	}
	
}