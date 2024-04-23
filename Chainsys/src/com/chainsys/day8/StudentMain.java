package com.chainsys.day8;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Student Application");
		System.out.println("------------------------------");
		int n=1;
		int num=0;
		while(n==1) {
			System.out.println("Enter the Option"+"\n"+"\n"+"1 ) Update Name"+"\n"+"2 ) Update Attendence"+"\n"
					+"3 ) Update StudentRank"+"\n"+"4 ) Update StudentClass"+"\n"+"5 ) Update Student Mentor"+"\n"+
					"6 ) Update Student Total"+"\n"+"7 ) Update Student Standard"+"\n"+"8 ) Delete Student"+"\n"+"9 ) Add Student"+"\n"+
					"10) Show Student Detail"+"\n"+"11) Exit");
			num=sc.nextInt();
			switch(num) {
	
			case 1 : System.out.println("Enter the Student Name");
					 String name=sc.next();
					 System.out.println("Enter your RollNo");
					 String rollNo=sc.next();
					 System.out.println(StudentDb.updateName(rollNo, name));
					 break;
			case 2 : System.out.println("Enter the Student Attendence percentage");
					 String attendence=sc.next();
					 System.out.println("Enter your RollNo");
					 String attendenceRollNo=sc.next();
					 System.out.println(StudentDb.updateAttendence(attendenceRollNo,attendence));
					 break;
			case 3 : System.out.println("Enter the Student Rank");
					 String rank=sc.next();
					 System.out.println("Enter your RollNo");
					 String rankRollNo=sc.next();
					 System.out.println(StudentDb.updateStudentRank(rankRollNo, rank));
					 break;
			case 4 : System.out.println("Enter the Student Class");
				 	 String studentClass=sc.next();
				 	 System.out.println("Enter your RollNo");
				 	 String classRollNo=sc.next();
				 	 System.out.println(StudentDb.updateStudentClass(classRollNo,studentClass));
				 	 break;
			case 5 : System.out.println("Enter the Student Mentor");
					 String mentor=sc.next();
					 System.out.println("Enter your RollNo");
					 String mentorRollNo=sc.next();
					 System.out.println(StudentDb.updateStudentMentor(mentorRollNo, mentor));
					 break;
			case 6 : System.out.println("Enter your Total");
					 String total=sc.next();
					 System.out.println("Enter the RollNo");
					 String totalRollNo=sc.next();
					 System.out.println(StudentDb.updateStudentTotal(totalRollNo,total));
					 break;
			case 7 : System.out.println("Enter the standard");
					 String standard=sc.next();
					 System.out.println("Enter the RollNo");
					 String standardRollNo=sc.next();
					 System.out.println(StudentDb.updateStandard(standardRollNo, standard));
			case 8 : System.out.println("Enter the RollNo");
					 String deleteRollNo=sc.next();
					 StudentDb.deleteStudent(deleteRollNo);
					 break;
			case 9 : System.out.println(StudentDb.addStudent());
					 break;
			case 10 : StudentDb.showStudentDetails();
					  break;
			case 11 : n=3;
					  break;
			}
			
		}
	}

}
