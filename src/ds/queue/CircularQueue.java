package ds.queue;

public class CircularQueue {

	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	public CircularQueue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int i) {

		if (rear == maxSize - 1) {
			rear = -1;
		}

		rear++;
		queueArray[rear] = i;
		nItems++;
	}

	public long remove() {

		long temp = queueArray[front];
		front++;

		if (front == maxSize) {
			front = 0;
		}

		nItems--;
		return temp;
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
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
}
