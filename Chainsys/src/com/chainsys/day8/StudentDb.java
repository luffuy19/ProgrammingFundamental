package com.chainsys.day8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDb {
	  
	private static HashMap<Integer, Student> studentDB=studentDetail();
	public static HashMap<Integer,Student> studentDetail() {
		HashMap<Integer,Student> student= new HashMap<Integer,Student>();
		student.put(3500, new Student(3500,"Ajith",90,2,490,"X",'A',"Sachinnathan"));
		student.put(3501, new Student(3501,"Kishore",75,1,500,"X",'D',"Suresh"));
		student.put(3502, new Student(3502,"Vishnu",95,4,450,"X",'A',"Sachinnathan"));
		student.put(3503, new Student( 3503,"Vikram",85,5,390,"X",'C',"Vinitha"));
		student.put(3504, new Student(3504,"Manoj",96,3,460,"X",'B',"Suji"));
		student.put(3505, new Student(3505,"Babu",98,1,500,"X",'D',"Suresh"));
		
		return student;
	}
	public static HashMap<Integer,Student> studentDetail(Student s) {
		if(s!=null) {
			studentDB.replace(s.getRollNo(), s);
		}
		return studentDB;
	}
	
	public static Student updateName(String rollNo,String name) {
		int validateNumber = StudentValidation.validateNumber(rollNo);
		String validateName = StudentValidation.validateName(name);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(validateNumber);
		student.setStudentName(validateName);
		StudentDb.studentDetail(student);
		return student;
	}
	public static Student updateAttendence(String rollNo,String attendence) {
		int validateNumber = StudentValidation.validateNumber(rollNo);
		int validateAttendence = StudentValidation.validateNumber(attendence);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(validateNumber);
		student.setAttendence(validateAttendence);
		StudentDb.studentDetail(student);
		return student;
	}
	public static Student updateStudentRank(String rollNo,String rank) {
		int validateNumber = StudentValidation.validateNumber(rank);
		int validateRollNo = StudentValidation.validateNumber(rollNo);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(validateRollNo);
		student.setStudentRank(validateNumber);
		StudentDb.studentDetail(student);
		return student;
	}
	public static Student updateStudentClass(String rollNo,String studentClass) {
		char validateclass = StudentValidation.validateCharacter(studentClass);
		int validateRollNo = StudentValidation.validateNumber(rollNo);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(validateRollNo);
		student.setStudentClass(validateclass);
		StudentDb.studentDetail(student);
		return student;
	}
	public static Student updateStudentMentor(String mentorRollNo,String name) {
		int validateRollNo = StudentValidation.validateNumber(mentorRollNo);
		String validateName = StudentValidation.validateName(name);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(validateRollNo);
		student.setMentorName(validateName);
		StudentDb.studentDetail(student);
		return student;
	}
	public static Student updateStudentTotal(String rollNo,String total) {
		int validateRollNo = StudentValidation.validateNumber(rollNo);
		int validateTotal = StudentValidation.validateNumber(total);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(validateRollNo);
		student.setTotal(validateTotal);
		StudentDb.studentDetail(student);
		return student;
	}
	public static Student updateStandard(String rollNo,String standard) {
		String validateStandard = StudentValidation.validateStandard(standard);
		int validateRollNo = StudentValidation.validateNumber(rollNo);
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		Student student = studentDetail.get(validateRollNo);
		student.setStandard(validateStandard);
		StudentDb.studentDetail(student);
		return student;
	}
	public static void deleteStudent(String rollNo) {
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail();
		int validateRollNo = StudentValidation.validateNumber(rollNo);
		Student student = studentDetail.get(validateRollNo);
		studentDetail.remove(student);
		StudentDb.studentDetail(student);
		System.out.println(student+" details was removed");
	}
	public static Student addStudent() {
		int rollNo=3506;
		String a="Sachinnathan";
		String b="Suji";
		String c="Vinitha";
		String d="Suresh";
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
		System.out.println("Enter the Student standard");
		String standard=sc.next();
		String validateStandard = StudentValidation.validateStandard(standard);
		System.out.println("Enter your Class");
		String StudentClass=sc.next();
		char validateCharacter = StudentValidation.validateCharacter(StudentClass);
		String validateMentor="";
		if(validateCharacter=='A')
			validateMentor=a;
		else if(validateCharacter=='B')
			validateMentor=b;
		else if(validateCharacter=='C')
			validateMentor=c;
		else if(validateCharacter=='D')
			validateMentor=d;
		Student student=new Student(rollNo,validateName,validateAttendence,validateRank,validateTotal,validateStandard,validateCharacter,validateMentor);
		studentDB.put(student.getRollNo(), student);
		return student;
		
	}
	public static void showStudentDetails() {
		HashMap<Integer, Student> studentDetail = StudentDb.studentDetail(null);
		for(Map.Entry<Integer,Student> student : studentDetail.entrySet()) {
			System.out.println(student);
		}
	}
	
}
