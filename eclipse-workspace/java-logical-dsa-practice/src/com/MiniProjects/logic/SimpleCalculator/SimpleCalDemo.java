package com.MiniProjects.logic.SimpleCalculator;
import java.util.Scanner;
public class SimpleCalDemo {
	public static void main(String [] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter  number1:");
  int userInput1=sc.nextInt();
  System.out.println("Enter  number2:");
  int userInput2=sc.nextInt();
  System.out.println("choose one operator:");
  System.out.println("1.Addition");
  System.out.println("2.Subtraction");
  System.out.println("3.Division");
  System.out.println("4.Multiplication");
  System.out.println("5.Exist");
  int operator=sc.nextInt();
 // int result=userInput1+userInput2;
  if(operator==1) {
	  int result=userInput1+userInput2;
	  System.out.println(userInput1+"+"+userInput2+"="+result);
	 
  }
  else if(operator==2) {
	  int result=userInput1-userInput2;
	  System.out.println(userInput1+"-"+userInput2+"="+result);
	  
  }else if(operator==3) {
	  if(userInput2>0) {
		  int result=userInput1/userInput2;
	  System.out.println(userInput1+"/"+userInput2+"="+result);
	  }else {
		  System.out.println("invalid number");
	  }
  }else if(operator==4) {
	  int result=userInput1*userInput2;
	  System.out.println(userInput1+"*"+userInput2+"="+result); 
  }else if(operator==5) {
	  
	  System.out.println("existing calculator");  
  }
  
}
}

