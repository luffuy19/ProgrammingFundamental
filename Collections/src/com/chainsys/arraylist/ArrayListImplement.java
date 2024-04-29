package com.chainsys.arraylist;

import java.util.ArrayList;

public class ArrayListImplement {
	public static ArrayList<Object> al=new ArrayList<Object> ();
	public void addAl(Object t) {
		al.add(t);
	}
	public void deleteAl(int index) {
		al.remove(index);
	}
	public static void main(String[] args) {
		ArrayListImplement arrayListImplement = new ArrayListImplement();
		Integer al1=1;
		String al2="Dharani";
		Character al3='d';
		Character al4='d';
		arrayListImplement.addAl(al1); arrayListImplement.addAl(al2); arrayListImplement.addAl(al3); arrayListImplement.addAl(al4);
		System.out.println(al.indexOf('d'));
		System.out.println(al);
	}
	
}
