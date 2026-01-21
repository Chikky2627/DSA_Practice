package com.MiniProjects.logic;
import java.util.ArrayList;
public class StudentService {
  
public boolean addStudent(StudentDetails student) {
	int rollNumber=student.getRollNumber();
	if(rollNumber>0) {
		return false;
	}
	
	return false;
  }
}
