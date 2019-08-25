package DLL;

class Main{
  public static void main(String[] args) {
	  
	//normal appending
    DLinkedList<Integer> list = new DLinkedList<>();
    list.append(5);
    list.append(4);
    list.append(8);
    list.append(9);
    System.out.println("Should be header 5 4 8 9 trailer "+list);
    
    //finding 8, should return 8
    DNode t = list.get(8);
    System.out.println("Should be 8: "+t);
    
    //removing 8, should remove 8
    list.remove(8);
    System.out.println(list);
    
    //should return null as 6 was never entered
    System.out.println("Should be null as 6 is never in it "+list.get(6));
    
    DLinkedList<Integer> list2 = new DLinkedList<>();
    
    //removing something that isnt there and the list is empty
    list2.remove(1);
    System.out.println("Should just be header trailer "+list2);
    
    list2.set(90, 2);
    System.out.println("Should be header 2 trailer: "+list2);
    
  }
}