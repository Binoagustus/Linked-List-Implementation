package com.linkedList;

public class LinkedListFunctions<T> {

	Node<T> head;
	Node<T> tail;

	void add(T key) {
		Node<T> node = new Node<T>(key);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	void print() {
		Node<T> tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.key + " ");
			System.out.println(tempNode.next + " ");
			tempNode = tempNode.next;
		}
	}
}
