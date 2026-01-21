package com.MiniProjects.logic.StudentMarkManagement.usingArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentDetails {
	public static void main(String[]args) {
   Scanner sc=new Scanner(System.in);
   ArrayList<Student> students=new ArrayList<>();
   System.out.println("Enter Number of Students:");
   int count=sc.nextInt();
   sc.nextLine();
   for(int i=1;i<=count;i++) {
	   System.out.println("Enter Student Details"+i);
	   System.out.println("Enter Student rollno:");
	   int rollno=sc.nextInt();
	   sc.nextLine();
	   System.out.println("Enter student Name:");
	   String name=sc.nextLine();
	   System.out.println("Enter student marks:");
	   int marks=sc.nextInt();
	   Student s = new Student(rollno, name, marks);

       // Store in ArrayList
       students.add(s);
   }

   // Print all students
   System.out.println("\n--- Student List ---");
   for (Student s : students) {
       System.out.println(
           "Roll No: " + s.getStudentRollno() +
           ", Name: " + s.getStudentName() +
           ", Marks: " + s.getStudentMarks()
       );
   }

   sc.close();
	   
   }
   
}

