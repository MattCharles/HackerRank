/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method. 
// This is also a lame problem but I did a 1-hour interview for Audible just now so I feel entitled to a little rest and a little dinner.
    
void Print(Node head) {
  if(head!=null){
      System.out.println(head.data);
      Print(head.next);
  }
}

