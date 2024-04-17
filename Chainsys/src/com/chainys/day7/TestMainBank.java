package com.chainys.day7;

import java.util.Scanner;

public class TestMainBank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		
//
//		
//		
//		System.out.println("Enter your phone No");
//		String phNo=sc.next();
//		long phoneNo = BankValidation.validatePhoneNo(phNo);
//		System.out.println("Enter IFSC in caps and aphanumeric");
//		String ifsc=sc.next();
//		ifsc= BankValidation.validateIfsc(ifsc);
		
		System.out.println("Enter your Account No");
		String accntNoString = sc.next();
		long accntNo=BankValidation.validateAccntNo(accntNoString);
		AbcBank bank = new AbcBank(); 
		bank.deposit(accntNo, 3000);
		System.out.println("Enter your phone No");
		String phNo=sc.next();
		long phoneNo = BankValidation.validatePhoneNo(phNo);
		bank.deposit(50000,phoneNo);
		System.out.println("Enter IFSC in caps and aphanumeric");
		String ifsc=sc.next();
		ifsc= BankValidation.validateIfsc(ifsc);
		bank.deposit(ifsc, 300000);
	}
}
