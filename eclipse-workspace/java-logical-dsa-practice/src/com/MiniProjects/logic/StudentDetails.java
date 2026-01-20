package com.MiniProjects.logic;

public class StudentDetails {
   private int rollNumber;
   private String name;
   private String department;
   private int marks;
   StudentDetails(int rollNumber,String name,String department,int marks){
	   this.rollNumber=rollNumber;
	   this.name=name;
	   this.department=department;
	   this.marks=marks;
   }
   public int getRollNumber() {
	   return rollNumber;
   }
   public void setName(String name) {
	   this.name=name;
   }
   public String getName() {
	   return name;
   }
   public void setDepartment(String department) {
	   this.department=department;
   }
   public String getDepartment() {
	   return department;
   }
   public void setMarks(int marks) {
	   this.marks=marks;
   }
   public int getMarks() {
	   return marks;
   }
}
