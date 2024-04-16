package com.chainys.day7;

public class AbcBank {
	public void deposit(long accntNo,int depositAmount) {
		System.out.println("Rs."+depositAmount+" credited to ABC-XXXX"+accntNo%10000);
	}
	public void deposit(String holderName,String Ifsc,int depositAmount) {
		System.out.println("Rs."+depositAmount+" credited to ABC Bank,Holder Name  "+holderName);
	}
	public void deposit(String holderName,long phoneNo,int depositAmount) {
		System.out.println("Rs."+depositAmount+" credited to ABC Bank,Holder Name "+holderName);
	}
}
