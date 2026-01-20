package com.MiniProjects.logic.StudentMarkManagement.usingArrayList;

public class Student {
	int studentRollno;
    String studentName;
    int  studentMarks;
    Student(int studentRollno,String studentName, int  studentMarks){
    	this.studentRollno=studentRollno;
    	this.studentName=studentName;
    	this.studentMarks=studentMarks;
    }
    public int getStudentRollno() {
    	return studentRollno;
    }
    public String getStudentName() {
    	return studentName;
    }
    public int getStudentMarks() {
    	return studentMarks;
    }
}
