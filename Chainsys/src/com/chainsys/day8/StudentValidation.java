package com.chainsys.day8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentValidation {
	public static Scanner sc=new Scanner(System.in);
	public static String validateName(String name) {
		if(Pattern.matches("^[a-zA-Z]{3,25}", name)) {
			return name;
		}
		System.out.println(name+" is not in alphabet Enter correct creditional");
		name=sc.next();
		return validateName(name);
	}
	
	public static int validateNumber(String attendence) {
		if(attendence.matches("^[0-9]{1,3}$")) {
			return Integer.parseInt(attendence);
		}
		System.out.println("Enter Value in Number "+attendence+" is not a number");
		attendence=sc.next();
		return validateNumber(attendence);
	}	
	public static char validateCharacter(String studentClass) {
		if(studentClass.matches("^[A-Z]{1}$")) {
			return studentClass.charAt(0);
		}
		System.out.println("Enter Value in character "+studentClass+" is not a character");
		studentClass=sc.next();
		return validateCharacter(studentClass);
	}	
}
