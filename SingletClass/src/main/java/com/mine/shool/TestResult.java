package com.mine.shool;

public class TestResult {
	private Student student;
	private Subject subject;
	private float scores;
	
	TestResult(Student student,Subject subject,float scores){
		this.student=student;
		this.subject=subject;
		this.scores=scores;
	}
	
	public String toString() {
		return student.getName()+":" + subject.getId() +":" +  subject.getName()+":" + scores;
		
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public float getScores() {
		return scores;
	}
	public void setScores(float scores) {
		this.scores = scores;
	}

}
