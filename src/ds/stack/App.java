package ds.stack;

public class App {
	public static void main(String[] args) {
		
		Stack myStack = new Stack(2);
		
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);

		while(!myStack.isEmpty()) {
			long value = myStack.pop();
			System.out.println(value);
		}
		
		String result = StringReverse("AJAY");
		System.out.println(result);
	}
	
	public static String StringReverse(String str) {
		
		int stringSize = str.length();
		
		StackCharacter reverse = new StackCharacter(stringSize);
		
		for(int i=0 ; i< str.length(); i++) {
			reverse.push(str.charAt(i));

		}
		
		String result = "";
		while(!reverse.isEmpty()) {
			char ch = reverse.pop();
			result = result + ch;
		}
		return result;
	}
}
