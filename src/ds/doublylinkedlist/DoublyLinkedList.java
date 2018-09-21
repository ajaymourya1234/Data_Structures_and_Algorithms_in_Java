package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode; // if empty last and first will refer to the same node
		} else {
			first.previous = newNode;
		}

		newNode.next = first; // newNode's next field will point to the old first node
		this.first = newNode;

	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // the last node points to the new node
		}

		newNode.previous = last; // the previous of the new node points to last node
		this.last = newNode; // the newnode is assigned to be the last node
	}

	// assume non empty list
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) { // there is only one item in the list
			last = null;
		} else {
			first.next.previous = null;
		}

		first = first.next;
		return temp;
	}

	// assume non empty list
	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) { // there is only one item in the list
			first = null;
		} else {
			last.previous.next = null;
		}

		last = last.previous;
		return temp;
	}

	// assume non empty list
	public boolean insertAfter(Integer key, int data) {
		Node current = first; // we start from the beginning of the list
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		Node newNode = new Node();
		newNode.data = data;

		if (current == last) {
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}

		newNode.previous = current;
		current.next = newNode;

		return true;
	}

	// assume non empty list
	public Node deleteKey(int key) {
		Node current = first;  //start from the beginning
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}

		if (current == first) {
			first = current.next; //make the first field point to the node following current since current node will deleted
		} else {
			current.previous.next = current.next;
			//current.next.previous = current.previous;
		}
		
		if (current == last) {
			last = current.previous;
		}else {
			current.next.previous = current.previous;
		}
		return current;
	}
	
	public void displayForward() {
		System.out.println("List (first --> last)");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		System.out.println("List (last --> first)");
		Node current = last;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
