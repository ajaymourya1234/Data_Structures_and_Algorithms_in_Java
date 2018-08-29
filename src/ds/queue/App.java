package ds.queue;

public class App {

	public static void main(String[] args) {

		Queue myQueue = new Queue(3);
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();



		myQueue.view();
	}

}
