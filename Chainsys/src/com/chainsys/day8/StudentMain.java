package com.chainsys.day8;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Student Apllication");
		System.out.println("Enter the Option"+"\n"+"1) updateName"+"\n"+"2) updateAttendence"+"\n"
		+"3) updateStudentRank"+"\n"+"4) updateStudentClass"+"\n"+"5) updateStudentMentor"+"\n"+
		"6) updateStudentTotal"+"\n"+"7) deleteStudent"+"\n"+"8) addStudent"+"\n"+"9) Exit");
		int n=1;
		while(n==1) {
			int num=sc.nextInt();
			switch(num) {
	
			case 1: System.out.println("Enter the Student Name");
					String name=sc.next();
					System.out.println("Enter your RollNo");
					int rollNo=sc.nextInt();
					StudentDb.updateName(rollNo, name);
			}
		}
	}

}
