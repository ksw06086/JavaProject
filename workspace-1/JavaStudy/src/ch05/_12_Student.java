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
			System.out.println("�л� " + studentName + "�� " + s.getName() + "���� ������ " + s.getScorePoint() + "�Դϴ�.");
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + "�Դϴ�.");
	}
}
