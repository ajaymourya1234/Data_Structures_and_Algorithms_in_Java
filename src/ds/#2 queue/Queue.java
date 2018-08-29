package ds.queue;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int i) {
		if (isFull()) {
			System.out.println("full");
		}else {

			/*
			 * if (rear == maxSize -1) { rear = -1; }
			 */
			rear++;
			queueArray[rear] = i;
			nItems++;
		}
	}

	public long remove() {
		if (isEmpty()) {
			System.out.println("empty");
			return -1;
		}else {
			long temp = queueArray[front];
			front++;
			/*
			 * if (front == maxSize) { front = 0; }
			 */
			nItems--;
			return temp;
		}
		
	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);

	}

	public void view() {
		System.out.print("[ ");
		for (int i = front; i <= rear; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
}
