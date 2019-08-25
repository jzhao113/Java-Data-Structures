package SLL;

class Main {
  public static void main(String[] args) {
    SLinkedList<Integer> list = new SLinkedList<>();
    
    //appending and printing out the list
    list.append(5);
    list.append(4);
    list.append(8);
    list.append(9);
    System.out.println("Should print 5 4 8 9 NULL :"+list);

    //finding the t node and printing it out
    Node t = list.get(8);
    System.out.println("Should print 8 : "+t);
    
    //removing 8 from the list
    list.remove(8);
    System.out.println("Should not have 8 anymore in list : "+list);
    
    //should return null as 6 was never in there
    System.out.println("Should be null since no 6 is in list : "+list.get(6));
    
    //creating a second list to test
    SLinkedList<Integer> list2 = new SLinkedList<>();
    System.out.println("Should be NULL as nothing is in it : "+list2);
    
    //trying to remove something that isnt even on the list
    list2.remove(4);
    System.out.println("Should be NULL as nothing was in the list: "+list2);
    
    //trying to replace something that isnt even there, empty list
    list2.set(4, 9);
    System.out.println("No 4 should just add 9 to list, only 9 right now: "+list2);
    
    //appending an element to the list
    list2.append(4);
    System.out.println("Should be 9 4 NULL : "+list2);
    
    //trying to replace something that isnt even there, with something in the list
    list2.set(5, 10);
    System.out.println("No 5 in list, adds 10 to end 4 9 10: "+list2);
    
    //replacing 4 with 5 
    list2.set(4, 5);
    System.out.println("Replaces 4 with 5 should be 9 5 10 NULL : "+list2);
    
    

  }
}