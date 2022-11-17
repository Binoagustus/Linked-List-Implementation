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
			tail.next = node; // add node next to tail
			tail = node; // make the node as tail
		}
	}

	void insert(T key) {
		Node<T> node = new Node<T>(key);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			head.next = node;
			node.next = tail;
		}
	}

	public T pop() {
		if (head != null) {
			T popKey = head.key; // head element is stored in popkey
			head = head.next; // head is moved to next position
			return popKey;
		} else {
			return null;
		}
	}

	public T popLast() {
		Node<T> tempNode = head;
		T popKeyLast = tail.key;
		while (tempNode.next != tail) {
			tempNode = tempNode.next;
		}
		tempNode.next = null;// last element is made null
		tempNode = tail;// make the previous node tempNode as tail
		return popKeyLast;
	}
	
	public Node<T> search(T key) {
		Node<T> node = new Node<T>(key);//to search
		Node<T> tempNode = head;//to traverse
		while(tempNode != null) {
			if(tempNode.key.equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.next;
		}return null;
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
