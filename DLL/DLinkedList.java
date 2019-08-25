package DLL;
class DLinkedList<T> implements List<T>{
  private DNode<T> header, trailer;
  private int size;

  DLinkedList(){
    header = new DNode<T>();
    trailer = new DNode<T>(null, null, header);
    header.setNext(trailer);
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }
  
  public void append(T x)
  {
	  DNode<T> temp = new DNode(x);
	  trailer.getPrev().setNext(temp);
	  temp.setPrev(trailer.getPrev());
	  trailer.setPrev(temp);
	  temp.setNext(trailer);
	  size++;
  }
  
  public void remove(T target)
  {
	  if(isEmpty())
		  return;
	  
	  DNode<T> location = search(target);
	  if(location==null)
		  return;
	  
	  location.getNext().setPrev(location.getPrev());
	  location.getPrev().setNext(location.getNext());
	  location.setNext(null);
	  location.setPrev(null);
	  
	  size--;
  }
  
  
  public DNode get(T target)
  {
	  if(isEmpty())
		  return null;
	  
	  return search(target);
  }
  
  public void set(T old, T replace)
  {
	  DNode<T> location = search(old);
	  if(location==null)
		  append(replace);
	  else
		  location.setData(replace);
  }
  
  
  private DNode search(T target)
  {
	  DNode temp = header.getNext();
	  
	  while(temp!=trailer)
	  {
		  if(temp.getData()==target)
			  return temp;
		  
		  temp = temp.getNext();
	  }
	  
	  return null;
  }

  public String toString(){
    StringBuilder ans = new StringBuilder();
    DNode trav = header;
    ans.append("Header <--> ");
    trav = trav.getNext();
    while(trav!=trailer){
      ans.append(trav.toString() + " <--> ");
      trav = trav.getNext();
    }
    ans.append("Trailer");
    return ans.toString();

  }
}