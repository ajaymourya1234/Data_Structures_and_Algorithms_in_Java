package ds.circularlinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList() {
		first = null;
		last = null;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first; // newNode --> old first
		first = newNode; // first place
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // point the last node to the new node
			last = newNode; // assign the newly created node as to be the last node
		}
	}

	public int deleteFirst() {
		int temp = first.data;

		if (first.next == null) {
			last = null;
		}

		first = first.next; // next node will become the first node
		return temp;
	}

	public void displayList() {
		System.out.println("List (first --> last)");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
