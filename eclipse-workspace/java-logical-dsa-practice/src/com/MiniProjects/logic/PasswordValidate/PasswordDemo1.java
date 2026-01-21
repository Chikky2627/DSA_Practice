package com.MiniProjects.logic.PasswordValidate;
import java.util.Scanner;
public class PasswordDemo1 {
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";

  public static void main(String [] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter password to validate");
	  String password=sc.nextLine();
	  if(password.length()<8) {
		  System.out.println("password must be 8 characters");
	  return;
	  }
	  boolean hasUpperCase=false;
	  boolean hasLowerCase=false;
	  boolean hasDigit=false;
	  boolean hasSpecial=false;
	  for(int i=0;i<password.length();i++) {
		  char ch=password.charAt(i);
		  if(Character.isUpperCase(ch)) {
			  hasUpperCase=true;
		  }else if(Character.isLowerCase(ch)) {
			  hasLowerCase=true;
		  }else if(Character.isDigit(ch)) {
			  hasDigit=true;
		  }else hasSpecial=true;
			  
		  }
	  if(hasUpperCase&&hasLowerCase&&hasDigit&&hasSpecial) {
		  System.out.println(GREEN+"password is strong"+RESET);
	  }else {
		  if(hasUpperCase==false) {
			  System.out.println(RED+"password must include Uppercase"+RESET);
		  }if(hasLowerCase==false) {
			  System.out.println(RED+"password must include lowercase"+RESET);
		  }if(hasDigit==false) {
			  System.out.println(RED+"password must include Digit"+RESET);
		  }if(hasSpecial==false) {
			  System.out.println(RED+"password must include SpecialCharacter"+RESET);
		  }
		  sc.close();
	  }
	  }
 
	  
  }


