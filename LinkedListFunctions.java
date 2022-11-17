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
			node.next = head; // add next node after head
			head = node; // allocation of key to head position
		}
	}

	void append(T key) {
		Node<T> node = new Node<T>(key);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node; //add node next to tail
			tail = node; //make the node as tail
		}
	}
	
	void insert(T key) {
		Node<T> node = new Node<T>(key);
		if(head == null) {
			head = node;
			tail = node;
		} else {
			head.next = node;
			node.next = tail;
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
