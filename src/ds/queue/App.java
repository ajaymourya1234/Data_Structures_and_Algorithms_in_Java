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
		
		/*CircularQueue cQueue = new CircularQueue(3);
		cQueue.insert(1);
		cQueue.insert(2);
		cQueue.insert(3);
		cQueue.insert(4);
		cQueue.insert(5);
		//long i = cQueue.remove();
		//System.out.println(i);
		cQueue.view();*/
	}

}
