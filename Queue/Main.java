package Queue;
public class Main {
	
	public static void main(String[]args)
	{
		Queue<Integer> q = new Queue<>(3);
		
		//trying to dequeue from a queue
		System.out.println("Should return null for dequeuing nothing: "+q.dequeue());
		
		//enqueueing
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		//checking if its empty
		System.out.println("Should be false: "+q.isEmpty());
		
		//getting size of q 
		System.out.println("Should be 3: "+q.size());
		
		//peeking
		System.out.println("Should return 1 for peeking: "+q.peek());
		
		//dequeueing
		System.out.println("Should return 1 for dequeueing "+q.dequeue());
		
		//peeking agian
		System.out.println("Should be 2 since its after 1 "+q.peek());
		
		//should queue up 4 but not 5
		q.enqueue(4);
		q.enqueue(5);
		
		//dequeuing all elements, and also an extra dequeue
		System.out.println("Should be 2 "+q.dequeue());
		System.out.println("Should be 3 "+q.dequeue());
		System.out.println("Should be 4 "+q.dequeue());
		System.out.println("Should be null "+q.dequeue());
		
		//checking if its emepty again
		System.out.println("Should be true: "+q.isEmpty());
		
		//checking the size
		System.out.println("Should be 0: "+q.size());
		
		
		
	}

}
