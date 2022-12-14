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

	public void append(T key) {
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

	public Node<T> popKey(T key) {
		Node<T> searchNode;
		searchNode = this.search(key); // holds position of the key
		Node<T> tempNode = head;
		while (tempNode.next != searchNode) {
			tempNode = tempNode.next;
		}
		tempNode.next = searchNode.next;// assign link between two nodes after pop
		return tempNode.next;
	}

	public Node<T> search(T key) {
		Node<T> node = new Node<T>(key);// to search
		Node<T> tempNode = head;// to traverse
		while (tempNode != null) {
			if (tempNode.key.equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.next;
		}
		return null;
	}

	public Node<T> insertAfter(T searchKey, T insertKey) {
		Node<T> node = new Node<>(insertKey);
		Node<T> searchNode = this.search(searchKey);
		if (searchNode != null) {
			node.next = searchNode.next;
			searchNode.next = node;
			return node.next;
		}
		return node.next;
	}

	public int size() {
		int count = 0;
		Node<T> tempNode = head;
		while (tempNode != null) {
			tempNode = tempNode.next;
			count = count + 1;
		}
		return count;
	}

	public void print() {
		Node<T> tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.key + " ");
			System.out.println(tempNode.next + " ");
			tempNode = tempNode.next;
		}
	}
}
