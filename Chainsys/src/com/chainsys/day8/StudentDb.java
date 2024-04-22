package com.chainsys.day8;
import java.util.HashMap;
import java.util.Scanner;

public class StudentDb {
	public static HashMap<Integer,Student> studentDetail() {
		Student student1=new Student(3500,"Ajith",90,2,490,'A',"Sachinnathan");
		Student student2=new Student(3501,"Kishore",75,1,500,'E',"Suresh");
		Student student3=new Student(3502,"Vishnu",95,4,450,'A',"Sachinnathan");
		Student student4=new Student(3503,"Vikram",85,5,390,'C',"Vinitha");
		Student student5=new Student(3504,"Manoj",96,3,460,'B',"Suji");
		Student student6=new Student(3505,"Babu",98,1,500,'E',"Suresh");
		HashMap<Integer, Student> student= new HashMap<Integer,Student>();
		student.put(3500, student1);
		student.put(3501, student2);
		student.put(3502, student3);
		student.put(3503, student4);
		student.put(3504, student5);
		student.put(3505, student6);
		return student;
	}
	
	public static String updateName(int rollNo,String name) {
		String validateName = StudentValidation.validateName(name);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(rollNo);
		student.setStudentName(validateName);
		return "Name was changed";
	}
	public static void updateAttendence(int rollNo,String attendence) {
		int validateNumber = StudentValidation.validateNumber(attendence);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(rollNo);
		student.setAttendence(validateNumber);
	}
	public static void updateStudentRank(int rollNo,String rank) {
		int validateNumber = StudentValidation.validateNumber(rank);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(rollNo);
		student.setStudentRank(validateNumber);
	}
	public static void updateStudentClass(int rollNo,String studentClass) {
		char validateclass = StudentValidation.validateCharacter(studentClass);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(rollNo);
		student.setStudentClass(validateclass);
	}
	public static String updateStudentMentor(int rollNo,String name) {
		System.out.println("Enter your Name");
		String validateName = StudentValidation.validateName(name);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(3500);
		student.setMentorName(validateName);
		return "Name was changed";
	}
	public static void updateStudentTotal(int rollNo,String total) {
		int validateNumber = StudentValidation.validateNumber(total);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(rollNo);
		student.setTotal(validateNumber);
	}
	public static void deleteStudent(int rollNo) {
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(rollNo);
		studentDetail.remove(student);
		System.out.println(student+" details was removed");
	}
	public static void addStudent() {
		int rollNo=3506;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.next();
		String validateName = StudentValidation.validateName(name);
		System.out.println("Enter your Attedence percentage");
		String attendence=sc.next();
		int validateAttendence = StudentValidation.validateNumber(attendence);
		System.out.println("Enter your Rank");
		String rank=sc.next();
		int validateRank = StudentValidation.validateNumber(rank);
		System.out.println("Enter your Total");
		String total=sc.next();
		int validateTotal = StudentValidation.validateNumber(total);
		System.out.println("Enter your Class");
		String StudentClass=sc.next();
		char validateCharacter = StudentValidation.validateCharacter(StudentClass);
		System.out.println("Enter your mentor");
		String mentor=sc.next();
		String validateMentor = StudentValidation.validateName(mentor);
		Student student=new Student(rollNo,validateName,validateAttendence,validateRank,validateTotal,validateCharacter,validateMentor);
		
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		studentDetail.put(rollNo, student);
		sc.close();
		
	}
	
}
