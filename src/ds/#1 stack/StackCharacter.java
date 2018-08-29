package ds.stack;

public class StackCharacter {
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	StackCharacter(int size){
		this.maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char i) {
		if(isFull()) {
			System.out.println("The stack is full");
		}else {
			top++;
			stackArray[top] = i;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return '0';
		}else {
			return stackArray[top--];
		}
	}
	
	public char peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1) ;
	}
	
	public boolean isFull() {
		return (maxSize-1 == top);
	}
}
