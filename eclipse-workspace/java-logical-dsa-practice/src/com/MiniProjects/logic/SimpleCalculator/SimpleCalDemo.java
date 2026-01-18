package com.MiniProjects.logic.SimpleCalculator;
import java.util.Scanner;
public class SimpleCalDemo {
	public static void main(String [] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter  number1:");
  double userInput1=sc.nextDouble();
  System.out.println("Enter  number2:");
  double userInput2=sc.nextDouble();
  System.out.println("choose one operator:");
  System.out.println("1.Addition");
  System.out.println("2.Subtraction");
  System.out.println("3.Division");
  System.out.println("4.Multiplication");
  System.out.println("5.Exist");
  int operator=sc.nextInt();
 // int result=userInput1+userInput2;
  if(operator==1) {
	  double result=userInput1+userInput2;
	  System.out.printf("%.0f + %.0f = %.0f%n", userInput1, userInput2, result);
  }
  else if(operator==2) {
	  double result=userInput1-userInput2;
	  System.out.printf("%.0f + %.0f = %.0f%n", userInput1, userInput2, result);
  }else if(operator==3) {
	  if(userInput2==0) {
		  System.out.println("invalid number");  
	  }else {
		  double result=userInput1/userInput2;
		  System.out.println(userInput1+"/"+userInput2+"="+result);
	  }
  }else if(operator==4) {
	  double result=userInput1*userInput2;
	  System.out.println(userInput1+"*"+userInput2+"="+result); 
  }else if(operator==5) {
	 System.out.println("exiting calculator");  
  }
  
}
}

