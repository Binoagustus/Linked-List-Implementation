package com.linkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedListFunctions<Integer> list = new LinkedListFunctions<>();
		list.append(56);
		list.append(30);
		list.append(70);
		list.print();
		System.out.println();
		System.out.println("Popped element is " + list.popLast());
		list.print();
	}
}
