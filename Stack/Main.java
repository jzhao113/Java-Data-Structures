package Stack;
public class Main {
	
	public static void main(String[]args)
	{
		LinkedStack<Integer> ls = new LinkedStack();
		//trying to pop an empty stack, should keep running even though there is nothing to pop
		ls.pop();
		
		//pushing 3 elements onto the stack
		ls.push(10);
		ls.push(20);
		ls.push(30);
		
		//checking size
		System.out.println("Should be 3: "+ls.size());
		//peeking, should be 30
		System.out.println("Should be 30: "+ls.peek());
		
		//popping the top, should be 30
		System.out.println("Should be 30: "+ls.pop());
		
		//peeking the top, should be 20
		System.out.println("Should be 20: "+ls.peek());
		
		//checking if its empty
		System.out.println("Should be false: "+ls.isEmpty());
		
		//popping an element
		System.out.println("Should be 20: "+ls.pop());
		
		//pushing another element, and peeking
		ls.push(40);
		System.out.println("Should be 40: "+ls.peek());
		
		//getting size again
		System.out.println("Should be 2: "+ls.size());
		
		//popping the remaining elemnts
		System.out.println("Should be 40:"+ls.pop());
		System.out.println("Should be 30: "+ls.pop());
		
		//checking if its empty
		System.out.println("Should be true: "+ls.isEmpty());
		
		
	}

}
