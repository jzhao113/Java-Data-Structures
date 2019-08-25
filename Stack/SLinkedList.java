package Stack;
class SLinkedList<T> implements List<T>{
  private Node head, tail;
  private int size;

  SLinkedList(){
    head = tail = null;
    size = 0;
  }

  SLinkedList(Node first){
    head = tail = first;
    size = 1;
  }

  public Node getHead(){
    return head;
  }

  public Node getTail(){
    return tail;
  }

  public void setHead(Node head){
    this.head = head;
  }

  public void setTail(Node tail){
    this.tail = tail;
  }

  public void append(T x){
    addLast(x);
  }
  private void addLast(T x){
    Node<T> newNode = new Node<>(x);
    tail.setNext(newNode);
    tail = newNode;
    size++;
  }
  public void remove(T target){
    Node location = get(target);
    remove(location);
  }
  public void remove(Node target)
  {
	  //it always stops at the first if statement as its always popping head
	  if(target==head)
			head = head.getNext();
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

  public Node get(T target){
    Node trav = head;
    while(trav!=null){
      if(trav.getData() == target){
        return trav;
      }
      
      trav = trav.getNext();
    }
    return trav;
  }

  public void set(T old, T replace){
    //Fill in
    return;
  }

  public String toString(){
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