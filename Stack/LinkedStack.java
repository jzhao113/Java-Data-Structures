package Stack;
class LinkedStack<T> implements StackInterface<T>
{
    private SLinkedList<T> stack;
    private int size;

    public LinkedStack() 
    {
        stack = new SLinkedList<>();
        size = 0;
    }
    
    public void push(T x)
    {
    	Node newNode = new Node(x);
    	newNode.setNext(stack.getHead());
    	stack.setHead(newNode);
    	
    	size++;
    }
    
    public T pop()
    {
    	if(isEmpty())
    		return null;
    	
    	Node head = stack.getHead();
    	stack.remove(head);
    	size--;
    	
    	return (T) head.getData();
    }
    
    public T peek()
    {
    	if(isEmpty())
    		return null;
    	
    	return (T) stack.getHead().getData();
    }
    
    public boolean isEmpty()
    {
    	return size==0;
    }
    
    public int size()
    {
    	return size;
    }
    
    public String toString(){
        StringBuilder ans = new StringBuilder();
        Node trav = stack.getHead();
        while(trav!=null){
          ans.append(trav.toString() + "->");
          trav = trav.getNext();
        }
        ans.append("NULL");
        return ans.toString();

      }
}