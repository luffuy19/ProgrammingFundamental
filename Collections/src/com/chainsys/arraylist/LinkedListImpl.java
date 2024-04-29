package com.chainsys.arraylist;

import java.util.LinkedList;

public class LinkedListImpl {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Mani");
		ll.add('A');
		ll.add(123);
		ll.add(2, "kishore");
		System.out.println(ll);
		
	}
}
