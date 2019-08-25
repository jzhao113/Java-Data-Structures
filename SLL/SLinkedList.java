package SLL;

class SLinkedList<T> implements List<T>
{
	private Node head, tail;
	private int size;

	SLinkedList()
	{
		head = tail = null;
		size = 0;
	}

	SLinkedList(Node first)
	{
		head = tail = first;
		size = 1;
	}

	public Node getHead()
	{
		return head;
	}

	public Node getTail()
	{
		return tail;
	}

	public void setHead(Node head)
	{
		this.head = head;
	}

	public void setTail(Node tail)
	{
		this.tail = tail;
	}

	public void append(T x)
	{
		addLast(x);
	}
  
	public void addLast(T x)
	{
		Node<T> newNode = new Node<>(x);
		if(size==0)
			head=tail=newNode;
		else
		{
			tail.setNext(newNode);
			tail=newNode;
		}
		size++;
	}
  
	public void remove(T target)
	{
		if(size==0)
			return;
		
		Node location = get(target);
		
		if(target==null)
			return;
		
		remove(location);
	}
	public void remove(Node target)
	{
		if(target==head)
		{
			head = head.getNext();
			if(size==1)
				tail=null;
		}
		else if(target==tail)
		{
			Node backOne = twoPointer(null);
			tail = backOne;
			backOne.setNext(null);
		}
		else
		{
			Node before = twoPointer(target.getNext());
			before.setNext(target.getNext());
			target.setNext(null);
		}
		
		size--;
	}

	public Node get(T target)
	{
		Node trav = head;
    
		while(trav!=null)
		{
			if(trav.getData() == target)
			{
				return trav;
			}
      
			trav = trav.getNext();
		}
		//returns null
		return trav;
	}
  
	private Node twoPointer(Node x)
	{
	  Node temp = head;
	  Node temp2 = temp;
	    
	  while(temp.getNext()!=x)
	  {
		temp2 = temp;
		temp = temp.getNext();
	  }
	  
	  return temp2;
	}

	public void set(T old, T replace)
	{
		Node temp = get(old);
		if(temp==null)
			append(replace);
		else
			temp.setData(replace);
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}

	public String toString()
	{
		StringBuilder ans = new StringBuilder();
		Node trav = head;
		while(trav!=null){
			ans.append(trav.toString() + "->");
			trav = trav.getNext();
		}
		ans.append("NULL");
		return ans.toString();

	}
}