package com.linkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedListFunctions<Integer> list = new LinkedListFunctions<>();
		list.append(56);
		list.append(30);
		list.append(70);
		list.insertAfter(30, 40);
		System.out.println("Element removed from link "+list.popKey(30));
		System.out.println("List size is "+list.size());
		System.out.println();
		list.print();
	}
}
