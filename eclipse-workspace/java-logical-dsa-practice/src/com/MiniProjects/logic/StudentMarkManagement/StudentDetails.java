package com.MiniProjects.logic.StudentMarkManagement;
import java.util.Scanner;
public class StudentDetails {
	public static void main(String[]args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Student RollNo:");
   int rollNo1 = sc.nextInt();
   sc.nextLine();

   System.out.println("Enter Student 1 Name:");
   String name1 = sc.nextLine();

   System.out.println("Enter Student 1 Marks:");
   int marks1 = sc.nextInt();
   sc.nextLine();
   
  System.out.println("Enter Student RollNo:");
   int rollNo2 = sc.nextInt();
   sc.nextLine();

   System.out.println("Enter Student 1 Name:");
   String name2 = sc.nextLine();
   sc.nextLine();
   System.out.println("Enter Student 1 Marks:");
   int marks2 = sc.nextInt();
   sc.nextLine();
   if(marks1>marks2) {
	   System.out.println("Highest Marks is:"+name1+":"+marks1);
   }else if(marks1<marks2) {
	   System.out.println("Highest Marks is:"+name2+":"+marks2);
   }
 } 
}
