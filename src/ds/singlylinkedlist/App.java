package ds.singlylinkedlist;

public class App {
	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(80);
		myList.insertFirst(40);

		myList.insertLast(555);

		myList.displayList();
	}
}
