package com.linkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedListFunctions<Integer> list = new LinkedListFunctions<>();
		list.append(56);
		list.append(30);
		list.append(70);
		System.out.println();
		System.out.println("search position of 30 is "+list.search(30));
		System.out.println();
		list.print();
	}
}
