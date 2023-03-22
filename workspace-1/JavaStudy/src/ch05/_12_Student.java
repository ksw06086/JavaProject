package ch05;

import java.util.ArrayList;

public class _12_Student {
	int studentID;
	String studentName;
	ArrayList<_12_Subject> subjectList;
	
	public _12_Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<_12_Subject>();
	}
	
	public void addSubject(String name, int score) {
		_12_Subject subject = new _12_Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(_12_Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
}
