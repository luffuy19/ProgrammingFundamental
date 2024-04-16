package com.chainys.day7;

import java.util.Scanner;

public class TestMainBank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Account No");
		String saccntNo = sc.next();
		long accntNo=BankValidation.validateAccntNo(saccntNo);
		System.out.println("Enter Account Holder Name");
		String name=sc.next();
		name = BankValidation.validateName(name);
		System.out.println("Enter your Bank Location");
		String location=sc.next();
		location=BankValidation.validateName(location);
		System.out.println("Enter your phone No");
		String phNo=sc.next();
		long PhoneNo = BankValidation.validatePhoneNo(phNo);
		System.out.println("Enter IFSC in caps and aphanumeric");
		String ifsc=sc.next();
		ifsc= BankValidation.validateIfsc(ifsc);
		Bank b1=new Bank();
		b1.setBankAccntNo(accntNo);
		b1.setHolderName(name);
		b1.setBranchLocation(location);
		b1.setPhoneNo(PhoneNo);
		b1.setIfscCode(ifsc);
		System.out.println(b1);
		AbcBank bank = new AbcBank(); 
		bank.deposit(b1.getBankAccntNo(), 3000);
		bank.deposit(b1.getHolderName(), b1.getPhoneNo(), 50000);
		bank.deposit(b1.getHolderName(), b1.getIfscCode(), 300000);
	}
}
