package Queue;

class Queue<T> implements QueueInterface<T>{
	private T data[];
    private int front, back, size, capacity; 

    public Queue() {
        capacity = 1000;
        data = (T[]) new Object[capacity];
        front = back = size = 0;
     }

    public Queue(int c) {
        capacity = c;
        data = (T[]) new Object[capacity];
        front = back = size = 0;
    }
    
    public void enqueue(T x)
    {
    	if(size==capacity)
    		return;
    	if(isEmpty())
    	{
    		front=0;
    		back=0;
    	}
    	else
    	{
    		back=(back+1+capacity)%capacity;
    	}
    	
    	data[back]=x;
    	size++;
    }
    
    public T dequeue()
    {
    	if(isEmpty())
    		return null;
    	T output = data[front];
    	front = (front+1+capacity)%capacity;
    	size--;
    	return output;
    }
    
    public T peek()
    {
    	return data[front];
    }
    
    public int size()
    {
    	return size;
    }
    
    public boolean isEmpty()
    {
    	return size==0;
    }

    public String toString() {
        int i, j;
        StringBuilder ans = new StringBuilder();
        ans.append("Queue:  ");
        for (i = 0, j = front; i < size; i++, j++) {
           if (j == capacity)
              j = 0;
           ans.append(data[j] + " -> ");
        }
        return ans.toString();
     }
}